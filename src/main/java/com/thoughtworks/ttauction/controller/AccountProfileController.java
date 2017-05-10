package com.thoughtworks.ttauction.controller;

import com.thoughtworks.ttauction.service.AccountService;
import com.thoughtworks.ttauction.service.BidService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.security.Principal;

@Controller
@RequestMapping(value = "/user-profile")
public class AccountProfileController {

    @Autowired
    private BidService bidService;

    @Autowired
    private AccountService accountService;

    @RequestMapping(value = "/{username}")
    public String profile(@PathVariable("username") String username, ModelMap modelMap, Principal principal){

        if (username == null) {
            username = principal.getName();
        }

        username = decode(username);

        modelMap.addAttribute("bidList", bidService.getBidCarsDetailsByUserName(username));

        modelMap.addAttribute("account", accountService.loadUserByUsername(username));

        modelMap.addAttribute("total", bidService.getTotalCostByUsername(username));

        if (bidService.getBidsByUserName(username).size() > 0) {
            modelMap.addAttribute("bidSize", "[" + bidService.getBidCarsDetailsByUserName(username).size() + "]");

        } else {
            modelMap.addAttribute("bidSize", "[" + 0 + "]");
        }
        return "user-profile";
    }

    private String decode(String userName) {
        try {
            return URLDecoder.decode(userName, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            return userName;
        }
    }
}
