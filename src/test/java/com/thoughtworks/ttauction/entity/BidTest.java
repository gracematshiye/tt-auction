package com.thoughtworks.ttauction.entity;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

public class BidTest {

    private Bid bid;
    private Bid bid2;

    @Before
    public void setUp() throws Exception {

        bid = new Bid(1, "user", new BigDecimal(130000), new Boolean(false));
        bid2 = new Bid(2, "user2", new BigDecimal(135000), new Boolean(true));
    }

    @Test
    public void testBidNotNull() throws Exception {
        Assert.assertNotNull(bid);
        Assert.assertNotNull(bid2);
    }

    @Test
    public void testBidEqualToItself() throws Exception {
        Assert.assertEquals(bid, bid);
        Assert.assertEquals(bid2, bid2);
    }

    @Test
    public void testTwoBidsWithDifferentPropertiesAreNotEqual() throws Exception {
        Assert.assertNotEquals(bid, bid2);
    }

    @Test
    public void testEqualBidsHasSameHashCode() throws Exception {
        bid2 = bid;

        Assert.assertEquals(bid.hashCode(), bid2.hashCode());
    }

    @Test
    public void testUnEqualCarsHasDifferentHashCode() throws Exception {
        Assert.assertNotEquals(bid.hashCode(), bid2.hashCode());
    }
}
