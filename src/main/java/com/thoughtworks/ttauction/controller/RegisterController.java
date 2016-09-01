package com.thoughtworks.ttauction.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class RegisterController {

    @RequestMapping(value = "/cars/register", method = RequestMethod.GET)
    public String register(){


        return "single-car";
    }

//    @RequestMapping(value = "/cars/register/{user}", method = RequestMethod.GET)
//    public String registerClick(@PathVariable("user") User user){
//
//
//        return "register";
//    }
}
