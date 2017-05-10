package com.thoughtworks.ttauction.service.BidServiceImpl.java;

import com.thoughtworks.ttauction.entity.Bid;
import com.thoughtworks.ttauction.entity.Car;
import com.thoughtworks.ttauction.repository.BidDao;
import com.thoughtworks.ttauction.repository.CarDao;
import com.thoughtworks.ttauction.service.AccountService;
import com.thoughtworks.ttauction.service.BidService;
import com.thoughtworks.ttauction.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.*;

@Service
public class BidServiceImpl implements BidService {

    @Autowired
    private BidDao bidDao;

    @Autowired
    private CarDao carDao;

    @Autowired
    private AccountService accountService;

    @Autowired
    private CarService carService;

    private int count = 1;

    @Override
    @Transactional
    public void bidACar(Bid bid) {
        bidDao.bidACar(bid);
    }

    @Override
    @Transactional
    public void updateBid(Bid bid) {
        bidDao.updateBid(bid);
    }

    @Override
    @Transactional
    public void bidOrUpdate(Bid bid) {
        List<Bid> bidsFromDB = getBidsByUserName(bid.getBid_username());
        Bid _item = new Bid();

        _item.setBid_username(bid.getBid_username());
        _item.setBid_car_id(bid.getBid_car_id());

        for (Bid bidFromDB : bidsFromDB) {

            if (bidFromDB.getBid_id().equals(bid.getBid_id())) {

                Integer quantity = bid.getBid_quatity() + bidFromDB.getBid_quatity();

                _item.setBid_quatity(quantity);
                updateBid(_item);
            }
        }

        bidACar(bid);
    }


    @Override
    @Transactional
    public List<Bid> getBids() {
        return bidDao.getBids();
    }

    @Override
    @Transactional
    public List<Bid> getBidsByUserName(String username) {
        return bidDao.getBidsByUserName(username);
    }

    @Override
    @Transactional
    public void removeBidItem(Integer bid_id) {
        bidDao.remove(bid_id);
    }

    @Override
    @Transactional
    public void removeAllBidItemsByUserName(String username) {
        bidDao.removeAllBidItems(username);
    }

    @Override
    @Transactional
    public HashMap<Car, Bid> getBidCarsDetailsByUserName(String username) {
        List<Bid> bids = getBidsByUserName(username);
        return getBidItemsFromDataBase(username, bids);
    }

    @Override
    @Transactional
    public BigDecimal getTotalCostByUsername(String username) {
        HashMap<Car, Bid> itemMap = getBidCarsDetailsByUserName(username);
        return calculateTotalCost(itemMap);
    }

    private BigDecimal calculateTotalCost(HashMap<Car, Bid> itemMap) {
        BigDecimal total = new BigDecimal(0);
        for (Car car : itemMap.keySet()) {
            total = total.add(car.getPrice());
        }
        return total;
    }

    private HashMap<Car, Bid> getBidItemsFromDataBase(String username, List<Bid> bids) {
        HashMap<Car, Bid> carBid = new HashMap<>();
        if (carBid != null) {
            for (Bid bid : bids) {
                Car car = carService.getCarById(bid.getBid_car_id());
                carBid.put(car, bid);
            }
        }
        return carBid;
    }
}
