package com.thoughtworks.ttauction.controller;

import com.thoughtworks.ttauction.service.UserService;
import com.thoughtworks.ttauction.service.UserServiceImpl.java.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {

    @Autowired
    private UserService userService = new UserServiceImpl();

    @RequestMapping(value = "/cars/add-user", method = RequestMethod.POST)
    public String addUser( ModelMap modelMap){

//        List<User> listOfUsers = this.userService.getUsers();
//
//        for (int i = 0; i < listOfUsers.size(); i++) {
//
//        }

        return "redirect:/all-cars";
    }

    @RequestMapping(value = "/add-user-bid", method = RequestMethod.POST)
    public String addUserBid( ModelMap modelMap){

//        List<User> listOfUsers = this.userService.getUsers();
//
//        for (int i = 0; i < listOfUsers.size(); i++) {
//
//        }

        return "redirect:/cars/{car_id}";
    }
}
