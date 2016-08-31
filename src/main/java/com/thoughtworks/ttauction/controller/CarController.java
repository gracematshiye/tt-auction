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

    private CarService carService;

    @Autowired
    public CarController(CarService carService){
        this.carService = new CarServiceImpl();
    }

    @RequestMapping(value = "/cars", method = RequestMethod.GET)
    public String displayAllCars(ModelMap modelMap){

//        Car car = new Car("Model name 1", "Make name 1", 27712, 2016, new BigDecimal(120000), "Condition 1", "Color 1", "Transmission 1", "Fuel type 1", "Description 1", new BigDecimal(100000));
//        this.carService.addCar(car);
//        this.carService.addCar(car);


        modelMap.addAttribute("carList", this.carService.getCars());

        return "all-cars";
    }

    @RequestMapping(value = "/cars/{id}", method = RequestMethod.GET)
    public String displayACar(@PathVariable("id") Integer id, ModelMap modelMap){


        modelMap.addAttribute("car", this.carService.getCarById(id));
        return "single-car";
    }
}
