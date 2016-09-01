package com.thoughtworks.ttauction.controller;

import com.thoughtworks.ttauction.service.CarService;
import com.thoughtworks.ttauction.entity.Car;
import com.thoughtworks.ttauction.service.CarServiceImpl.java.CarServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    @Autowired
    private CarService carService = new CarServiceImpl();

    @RequestMapping(value = "/cars", method = RequestMethod.GET)
    public String displayAllCars(ModelMap modelMap){

        modelMap.addAttribute("carList", this.carService.getCars());

        return "all-cars";
    }

    @RequestMapping(value = "/cars/{car_id}", method = RequestMethod.GET)
    public String displayACar(@PathVariable("car_id") Integer car_id, ModelMap modelMap){

        List<Car> cars = this.carService.getCars();

        //modelMap.addAttribute("car", this.carService.getCarById(car_id));
        modelMap.addAttribute("car", cars.get(car_id - 1));

        return "single-car";
    }
}
