package com.thoughtworks.ttauction.service;

import com.thoughtworks.ttauction.entity.Bid;
import com.thoughtworks.ttauction.entity.Car;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;

public interface BidService {

    void bidACar(Bid bid);
    void updateBid(Bid bid);
    void bidOrUpdate(Bid bid);

    List<Bid> getBids();

    List<Bid> getBidsByUserName(String username);

    void removeBidItem(Integer bid_id);

    void removeAllBidItemsByUserName(String username);

    HashMap<Car,Bid> getBidCarsDetailsByUserName(String username);

    BigDecimal getTotalCostByUsername(String username);

}