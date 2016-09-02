package com.thoughtworks.ttauction.controller;

import com.thoughtworks.ttauction.entity.User;
import com.thoughtworks.ttauction.service.UserService;
import com.thoughtworks.ttauction.service.UserServiceImpl.java.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {

    @Autowired
    private UserService userService = new UserServiceImpl();

    @RequestMapping(value = "/shop-cart/customer/add", method = RequestMethod.POST)
    public String addCustomer(@ModelAttribute("customer") User user) {

        if (user.getUserId() == 0){
            userService.addUser(user);
        }

        return "redirect:/cars/{car_id}";
    }
}
