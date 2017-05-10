package com.thoughtworks.ttauction.repository.impl;

import com.thoughtworks.ttauction.entity.Bid;
import com.thoughtworks.ttauction.repository.BidDao;
import com.thoughtworks.ttauction.repository.CarDao;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class BidDaoImpl implements BidDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Autowired
    private CarDao carDao;

    int count = 1;


    @Override
    public void bidACar(Bid bid) {
        Session session = sessionFactory.getCurrentSession();
        session.save(bid);
    }

    @Override
    public void updateBid(Bid bid) {
        Session session = sessionFactory.getCurrentSession();

        Bid item = session.get(Bid.class, new Integer(bid.getBid_id()));
        item.setBid_username(bid.getBid_username());
        item.setBid_car_id(bid.getBid_car_id());
        item.setBid_quatity(bid.getBid_quatity());

        session.update(item);
    }


    @SuppressWarnings("unchecked")
    @Override
    public List<Bid> getBidsByUserName(String username) {
        List<Bid> bids = new ArrayList<>();

        for (int i = 0; i < getBids().size(); i++) {
            if (getBids().get(i).getBid_username().equals(username)) {
                bids.add(getBids().get(i));
            }
        }
        return bids;
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Bid> getBids() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Bid").list();
    }

    @Override
    public void remove(Integer bid_id) {
        Session session = sessionFactory.getCurrentSession();

        Query query = session.createQuery("from Bid where bid_id = " + bid_id);
        Bid bid = (Bid) query.list().toArray()[0];

        session.delete(bid);
    }


    @Override
    public void removeAllBidItems(String username) {
        Session session = sessionFactory.getCurrentSession();

        List<Bid> bids = getBidsByUserName(username);

        for (int i = 0; i < bids.size(); i++) {
            Query query = session.createQuery("from Bid where bid_id = " + bids.get(i).getBid_id());
            Bid bid = (Bid) query.list().toArray()[0];

            session.delete(bid);
        }
    }



}
