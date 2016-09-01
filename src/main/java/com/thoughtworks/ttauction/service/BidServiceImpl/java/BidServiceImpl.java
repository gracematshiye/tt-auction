package com.thoughtworks.ttauction.service.BidServiceImpl.java;

import com.thoughtworks.ttauction.entity.Bid;
import com.thoughtworks.ttauction.entity.Car;
import com.thoughtworks.ttauction.entity.User;
import com.thoughtworks.ttauction.repository.BidDao;
import com.thoughtworks.ttauction.repository.BidDaoImpl.java.BidDaoImpl;
import com.thoughtworks.ttauction.service.BidService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.List;

@Service
public class BidServiceImpl implements BidService {

    @Autowired
    private BidDao bidDao = new BidDaoImpl();

    @Override
    @Transactional
    public void addBid(Bid bid) {

        User user = new User("aaa", "aaa", "aaaa", "hhh", "jjj", "hhhhh", "jkjl", "hbjhb");
        Car car = new Car("Model name 1", "Make name 1", 27712, 2016, new BigDecimal(120000), "Condition 1", "Color 1", "Transmission 1", "Fuel type 1", "Description 1", new BigDecimal(100000));

        Bid bid1 = new Bid(car, user);

        this.bidDao.addBid(bid1);
    }

    @Override
    @Transactional
    public List<Bid> getBids() {

        return this.bidDao.getBids();
    }
}
