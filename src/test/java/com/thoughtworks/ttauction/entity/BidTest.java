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
//    private Bid bid;
//    private Bid bid1;
//
//    @Before
//    public void setUp() throws Exception {
//
//        User user = new User("aaa", "aaa", "aaaa", "hhh", "jjj", "hhhhh", "jkjl", "hbjhb");
//        Car car = new Car("Model name 1", "Make name 1", 27712, 2016, new BigDecimal(120000), "Condition 1", "Color 1", "Transmission 1", "Fuel type 1", "Description 1", new BigDecimal(100000));
//
//        bid = new Bid(car, user);
//        bid1 = new Bid(car, user);
//    }
//
//    @Test
//    public void testBidNotNull() throws Exception {
//        Assert.assertNotNull(bid);
//    }
//
//    @Test
//    public void testBidEqualsToItSelf() throws Exception {
//        Assert.assertEquals(bid, bid);
//    }
//
//    @Test
//    public void testBidWithDifferentIDAreNotEqual() throws Exception {
//        Assert.assertNotEquals(bid, bid1);
//    }
//
//    @Test
//    public void testEqualBidHasEqualHashCode() throws Exception {
//        bid1 = bid;
//        Assert.assertEquals(bid.hashCode(), bid1.hashCode());
//    }
//
//    @Test
//    public void testUnEqualBidHasUnEqualHashCode() throws Exception {
//        Assert.assertNotEquals(bid.hashCode(), bid1.hashCode());
//    }
//}
