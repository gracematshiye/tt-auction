package com.thoughtworks.ttauction.repository.BidDaoImpl.java;

import com.thoughtworks.ttauction.entity.Bid;
import com.thoughtworks.ttauction.repository.BidDao;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BidDaoImpl implements BidDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addBid(Bid bid) {
        Session session = sessionFactory.getCurrentSession();

        session.save(bid);
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Bid> getBids() {
        Session session = sessionFactory.getCurrentSession();

        Query query = session.createQuery("from Bid");

        return query.list();
    }
}
