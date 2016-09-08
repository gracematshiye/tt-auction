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
//    private Car car;
//
//    private Customer customer;
//    private Bid bid;
//
//    @Before
//    public void setUp() throws Exception {
//        session = sessionFactory.getCurrentSession();
//
//        customer = new Customer("firs-name", "last-name", "username", "password", "password", "date", "h@gmail.com", "0798989765", "345 braam");
//        car = new Car("Model name 1", "Make name 1", 27712, 2016, new BigDecimal(120000), "Condition 1", "Color 1", "Transmission 1", "Fuel type 1", "Description 1", new BigDecimal(100000));
//
//        bid = new Bid(car, customer, new BigDecimal(130000), new Boolean(false));
//    }
//
//    @Test
//    @Rollback(true)
//    public void testAddBid() throws Exception {
//
//        Assert.assertEquals(0, session.createQuery("from Bid").list().size());
//
//        session.save(car);
//        session.save(customer);
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
//        session.save(car);
//        session.save(customer);
//        session.save(bid);
//
//        List<Bid> bidList = new ArrayList<Bid>(){{
//            add(bid);
//        }};
//
//        List<Bid> bidList_DB = session.createQuery("from Bid").list();
//
//        Assert.assertEquals(bidList.get(0).getId(), bidList_DB.get(0).getId());
//        Assert.assertEquals(bidList.get(0).get_car(), bidList_DB.get(0).get_car());
//        Assert.assertEquals(bidList.get(0).get_customer(), bidList_DB.get(0).get_customer());
//        Assert.assertEquals(bidList.get(0).get_offer(), bidList_DB.get(0).get_offer());
//        Assert.assertEquals(bidList.get(0).get_bid_status(), bidList_DB.get(0).get_bid_status());
//    }
//}
