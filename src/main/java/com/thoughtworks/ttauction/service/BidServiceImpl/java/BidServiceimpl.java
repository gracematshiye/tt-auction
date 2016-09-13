package com.thoughtworks.ttauction.service.BidServiceImpl.java;

import com.thoughtworks.ttauction.entity.Bid;
import com.thoughtworks.ttauction.repository.BidDao;
import com.thoughtworks.ttauction.repository.BidDaoImpl.java.BidDaoImpl;
import com.thoughtworks.ttauction.service.BidService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BidServiceImpl implements BidService {

    @Autowired
    private BidDao bidDao = new BidDaoImpl();

    public BidServiceImpl(){

    }

    @Override
    @Transactional
    public void addBid(Bid bid) {
        this.bidDao.addBid(bid);
    }

    @Override
    @Transactional
    public List<Bid> getBids() {
        return this.bidDao.getBids();
    }
}
