package com.thoughtworks.ttauction.controller;

import com.thoughtworks.ttauction.entity.Bid;
import com.thoughtworks.ttauction.service.AccountService;
import com.thoughtworks.ttauction.service.BidService;
import com.thoughtworks.ttauction.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.security.Principal;

@Controller
public class BidController {

    static final String BID_LIST_PAGE = "bid-list";

    BidService bidService;
    CarService carService;
    AccountService accountService;

    @Autowired
    public BidController(BidService bidService, CarService carService, AccountService accountService) {
        this.bidService = bidService;
        this.carService = carService;
        this.accountService = accountService;
    }

    @RequestMapping(value = "/cars/bid/{carId}")
    public String bid(@PathVariable("carId") Integer carId, Principal principal) {

        String username = principal.getName();
        Bid bid = new Bid();

        bid.setBid_username(username);
        bid.setBid_car_id(carId);
        bid.setBid_quatity(1);

        bidService.bidOrUpdate(bid);

        return "redirect:/cars/car/{carId}";
    }

    @RequestMapping(name = "/cars/bid-list", method = RequestMethod.GET)
    public String bidList(ModelMap modelMap, Principal principal) {

        String username = principal.getName();

        modelMap.addAttribute("bidList", bidService.getBidCarsDetailsByUserName(username));

        modelMap.addAttribute("total", bidService.getTotalCostByUsername(username));

        if (bidService.getBidsByUserName(username).size() > 0) {
            modelMap.addAttribute("bidSize", "[" + bidService.getBidCarsDetailsByUserName(principal.getName()).size() + "]");

        } else {
            modelMap.addAttribute("bidSize", "[" + 0 + "]");
        }

        return BID_LIST_PAGE;
    }


    @RequestMapping(value = "/cars/bid/{carId}/remove")
    public String removeBidItem(@PathVariable("carId") Integer carId) {

        bidService.removeBidItem(carId);

        return "redirect:/cars/bid-list";
    }

    @RequestMapping(value = "/cars/bid/remove-all")
    public String removeAllBidItems(Principal principal) {

        String username = principal.getName();

        bidService.removeAllBidItemsByUserName(username);

        return "redirect:/cars/bid-list";
    }
}
