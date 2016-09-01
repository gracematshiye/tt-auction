package com.thoughtworks.ttauction.repository;

import com.thoughtworks.ttauction.entity.Bid;

import java.util.List;

public interface BidDao {

    void addBid(Bid bid);
    List<Bid> getBids();
}
