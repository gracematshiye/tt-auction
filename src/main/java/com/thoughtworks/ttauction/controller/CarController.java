package com.thoughtworks.ttauction.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CarController {

    @RequestMapping(value = "/")
    public ModelAndView testView(){
        String message = "Hello World!!";

        return new ModelAndView("testJSP", "message", message);
//        return "testJSP";
    }
}
