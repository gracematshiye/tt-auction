package com.thoughtworks.ttauction.service;

import com.thoughtworks.ttauction.entity.Bid;

import java.util.List;

public interface BidService {
    void addBid(Bid bid);
    List<Bid> getBids();
}
