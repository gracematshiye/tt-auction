package com.thoughtworks.ttauction.controller;

import com.thoughtworks.ttauction.service.UserService;
import com.thoughtworks.ttauction.service.UserServiceImpl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {

    @Autowired
    private UserService userService = new UserServiceImpl();

    @RequestMapping(value = "/cars/add-user", method = RequestMethod.POST)
    public String addUser(){

        return "redirect:/all-cars";
    }
}
