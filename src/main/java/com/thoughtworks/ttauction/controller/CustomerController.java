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
    private CustomerService customerService = new CustomerServiceImpl();

    @Autowired
    private CarService carService = new CarServiceImpl();

    @RequestMapping(value = "/customer/register/carId={id}")
    public String viewRegisterPage(@PathVariable("id") Integer id) {

        return "register";
    }

    @RequestMapping(value = "/customer/add", method = RequestMethod.POST)
    public String addCustomer(@ModelAttribute("customer") Customer customer) {

        if (customer.getId() == 0) {
            customerService.addCustomer(customer);
        }

        return "redirect:/cars";
    }
}
