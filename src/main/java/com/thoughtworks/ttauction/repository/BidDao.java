package com.thoughtworks.ttauction.repository;

import com.thoughtworks.ttauction.entity.Bid;

import java.util.List;

public interface BidDao {
    void bidACar(Bid bid);

    List<Bid> getBidsByUserName(String username);


    List<Bid> getBids();


    void remove(Integer bid_id);


    void removeAllBidItems(String username);

    void updateBid(Bid bid);
}