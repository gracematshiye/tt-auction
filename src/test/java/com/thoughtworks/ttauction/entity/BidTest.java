//package com.thoughtworks.ttauction.entity;
//
//import org.junit.Assert;
//import org.junit.Before;
//import org.junit.Test;
//
//import java.math.BigDecimal;
//
//public class BidTest {
//
//    private Car car;
//    private Customer customer;
//
//    private Bid bid;
//    private Bid bid2;
//
//    @Before
//    public void setUp() throws Exception {
//        customer = new Customer("firs-name", "last-name", "username", "password", "password", "date", "h@gmail.com", "0798989765", "345 braam");
//        car = new Car("Model name 1", "Make name 1", 27712, 2016, new BigDecimal(120000), "Condition 1", "Color 1", "Transmission 1", "Fuel type 1", "Description 1", new BigDecimal(100000));
//
//        bid = new Bid(car, customer, new BigDecimal(130000), new Boolean(false));
//        bid2 = new Bid(car, customer, new BigDecimal(135000), new Boolean(true));
//    }
//
//    @Test
//    public void testBidNotNull() throws Exception {
//        Assert.assertNotNull(bid);
//        Assert.assertNotNull(bid2);
//    }
//
//    @Test
//    public void testBidEqualToItself() throws Exception {
//        Assert.assertEquals(bid, bid);
//        Assert.assertEquals(bid2, bid2);
//    }
//
//    @Test
//    public void testTwoBidsWithDifferentPropertiesAreNotEqual() throws Exception {
//        Assert.assertNotEquals(bid, bid2);
//    }
//
//    @Test
//    public void testEqualBidsHasSameHashCode() throws Exception {
//        bid2 = bid;
//
//        Assert.assertEquals(bid.hashCode(), bid2.hashCode());
//    }
//
//    @Test
//    public void testUnEqualCarsHasDifferentHashCode() throws Exception {
//        Assert.assertNotEquals(bid.hashCode(), bid2.hashCode());
//    }
//}
