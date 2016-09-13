//package com.thoughtworks.ttauction.repository;
//
//
//import com.thoughtworks.ttauction.entity.Bid;
//import com.thoughtworks.ttauction.entity.Car;
//import com.thoughtworks.ttauction.entity.Customer;
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.junit.Assert;
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.test.annotation.Rollback;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//import org.springframework.transaction.annotation.Transactional;
//
//import java.math.BigDecimal;
//import java.util.ArrayList;
//import java.util.List;
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration("file:src/test/webapp/resources/applicationContext-car-dao-test.xml")
//@Transactional
//public class BidDaoTest {
//
//    @Autowired
//    private BidDao bidDao ;
//
//    @Autowired
//    private SessionFactory sessionFactory;
//
//    private Session session;
//
//    private Bid bid;
//
//    @Before
//    public void setUp() throws Exception {
//        session = sessionFactory.getCurrentSession();
//
//        bid = new Bid(1, 1, new BigDecimal(130000), new Boolean(false));
//    }
//
//    @Test
//    @Rollback(true)
//    public void testAddBid() throws Exception {
//
//        Assert.assertEquals(0, session.createQuery("from Bid").list().size());
//
//        session.save(bid);
//
//        Assert.assertEquals(1, session.createQuery("from Bid").list().size());
//    }
//
//    @Test
//    @Rollback(true)
//    public void testGetBids() throws Exception {
//        Assert.assertEquals(0, session.createQuery("from Bid").list().size());
//
//        session.save(bid);
//
//        List<Bid> bidList = new ArrayList<Bid>(){{
//            add(bid);
//        }};
//
//        List<Bid> bidList_DB = session.createQuery("from Bid").list();
//
//        Assert.assertEquals(bidList.get(0).getId(), bidList_DB.get(0).getId());
//
//
//    }
//}
