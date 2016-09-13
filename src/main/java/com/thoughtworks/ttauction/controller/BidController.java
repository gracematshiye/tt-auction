package com.thoughtworks.ttauction.controller;

import com.thoughtworks.ttauction.entity.Car;
import com.thoughtworks.ttauction.service.CarService;
import com.thoughtworks.ttauction.service.CarServiceImpl.java.CarServiceImpl;
import com.thoughtworks.ttauction.service.CustomerService;
import com.thoughtworks.ttauction.service.CustomerServiceImpl.java.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class BidController {

    @Autowired
    private CarService carService;

    @Autowired
    private CustomerService userService;

    @RequestMapping(value = "/bid/carId={carId}&uname={uname}&offer={offer}", method = RequestMethod.GET)
    public String bidOnCar(@PathVariable("carId") Integer carId, @PathVariable("uname") String uname, @PathVariable("offer") String offer, ModelMap modelMap) {
        //Offer table
        modelMap.addAttribute("car", this.carService.getCarById(carId));
        return "single-car";
    }
}
