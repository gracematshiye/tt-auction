package com.thoughtworks.ttauction.service;

import com.thoughtworks.ttauction.entity.Bid;
import com.thoughtworks.ttauction.repository.BidDao;
import com.thoughtworks.ttauction.service.BidServiceImpl.java.BidServiceimpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.*;

public class BidServiceTest {

    @Mock
    private BidDao bidDao;

    @Mock
    private List<Bid> bidList = new ArrayList<>();

    @InjectMocks
    private BidService bidService = new BidServiceimpl();

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testAddBid() throws Exception {
        doNothing().when(bidDao).addBid(any(Bid.class));
        bidService.addBid(any(Bid.class));
        verify(bidDao, atLeastOnce()).addBid(any(Bid.class));

    }

    @Test
    public void testGetAllBids() throws Exception {
        when(bidDao.getBids()).thenReturn(bidList);
        Assert.assertEquals(bidService.getBids(), bidList);
        bidService.getBids();
        verify(bidDao, atLeastOnce()).getBids();

    }
}
