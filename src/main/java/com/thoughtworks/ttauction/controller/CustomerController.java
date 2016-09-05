package com.thoughtworks.ttauction.controller;

import com.thoughtworks.ttauction.entity.Customer;
import com.thoughtworks.ttauction.service.CarService;
import com.thoughtworks.ttauction.service.CarServiceImpl.java.CarServiceImpl;
import com.thoughtworks.ttauction.service.CustomerService;
import com.thoughtworks.ttauction.service.CustomerServiceImpl.java.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CustomerController {

    @Autowired
    private CustomerService userService = new CustomerServiceImpl();

    @Autowired
    private CarService carService = new CarServiceImpl();

    @RequestMapping(value = "/user/carId={car.id}&useId={customer.userId}")
    public String viewCustomerPage(@PathVariable("carId") Integer carId, @PathVariable("userId") Integer userId){

        if (userId == null){
            return "register";

        }
        return "redirect:/cars/{car_id}";
    }

    @RequestMapping(value = "/user/add", method = RequestMethod.POST)
    public String addCustomer(@ModelAttribute("user") Customer user) {

        if (user.getUserId() == 0){
            userService.addCustomer(user);
        }

        return "redirect:/cars/{car_id}";
    }
}
