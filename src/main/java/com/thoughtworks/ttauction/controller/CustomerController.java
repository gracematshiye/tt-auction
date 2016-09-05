package com.thoughtworks.ttauction.controller;

import com.thoughtworks.ttauction.entity.Customer;
import com.thoughtworks.ttauction.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @RequestMapping(value = "/customer/register")
    public String viewRegisterPage() {

        return "register";
    }

    @RequestMapping(value = "/customer/register/add", method = RequestMethod.POST)
    public String addCustomer(@ModelAttribute("customer") Customer customer) {

        customerService.addCustomer(customer);

        return "redirect:/cars";
    }
}
