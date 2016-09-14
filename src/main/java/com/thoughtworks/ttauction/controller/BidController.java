package com.thoughtworks.ttauction.controller;

import com.thoughtworks.ttauction.entity.Bid;
import com.thoughtworks.ttauction.service.BidService;
import com.thoughtworks.ttauction.service.BidServiceImpl.java.BidServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class BidController {

    @Autowired
    private BidService bidService = new BidServiceImpl();

    @RequestMapping(value = "/bid/carId={carId}&uname={uname}", method = RequestMethod.POST)
    public String bidOnCar(@ModelAttribute("bid")Bid bid, ModelMap modelMap, @PathVariable("uname") String uname, @PathVariable("carId") Integer carId) {

        bid.setCarId(carId);
        bid.setUname(uname);
        bid.setOffer(bid.getOffer());
        bid.setStatus(true);

        bidService.addBid(bid);

        return "redirect:/";
    }
}
