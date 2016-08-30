package com.thoughtworks.ttauction.controller;

import com.thoughtworks.ttauction.service.CarService;
import com.thoughtworks.ttauction.entity.Car;
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
    private CarService carService;

    @RequestMapping(value = "/cars", method = RequestMethod.GET)
    public String displayAllCars(ModelMap modelMap){

//        Car car = new Car("Model name 1", "Make name 1", 27712, 2016, new BigDecimal(120000), "Condition 1", "Color 1", "Transmission 1", "Fuel type 1", "Description 1", new BigDecimal(100000));
//        this.carService.addCar(car);
//        this.carService.addCar(car);

        List<Car> carList = this.carService.getCars();

        modelMap.addAttribute("carList", carList);

        return "all-cars";
    }

    @RequestMapping(value = "/cars/{id}")
    public String displayACar(@PathVariable("id") int id, ModelMap modelMap){

        Car car = this.carService.getCarById(id);

        modelMap.addAttribute("car", car);
        return "single-car";
    }
}
