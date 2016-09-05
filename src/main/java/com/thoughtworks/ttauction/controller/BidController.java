package com.thoughtworks.ttauction.controller;

import com.thoughtworks.ttauction.service.CarService;
import com.thoughtworks.ttauction.service.CarServiceImpl.java.CarServiceImpl;
import com.thoughtworks.ttauction.service.CustomerService;
import com.thoughtworks.ttauction.service.CustomerServiceImpl.java.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class BidController {

    @Autowired
    private CarService carService = new CarServiceImpl();

    @Autowired
    private CustomerService userService = new CustomerServiceImpl();
}
