package com.thoughtworks.ttauction.controller;

import com.thoughtworks.ttauction.entity.Car;
import com.thoughtworks.ttauction.entity.Customer;
import com.thoughtworks.ttauction.service.CarService;
import com.thoughtworks.ttauction.service.CarServiceImpl.java.CarServiceImpl;
import com.thoughtworks.ttauction.service.CustomerService;
import com.thoughtworks.ttauction.service.CustomerServiceImpl.java.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.io.Console;
import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    @Autowired
    private CarService carService = new CarServiceImpl();

    /**
     * This method returns a list of cars
     **/
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String displayAllCars(ModelMap modelMap) {

        if (modelMap.size() == 0) {
            modelMap.addAttribute("carList", this.carService.getCars());
        }

        return "all-cars";
    }

    @RequestMapping(value = "/cars/{carId}", method = RequestMethod.GET)
    public String displayACarUname(@PathVariable("carId") Integer carId, @ModelAttribute("uname") String uname, ModelMap modelMap) {

        modelMap.addAttribute("uname", uname);
        modelMap.addAttribute("car", this.carService.getCarById(carId));
        modelMap.addAttribute("priceOffer", this.carService.getCarById(carId).getPriceOffer());

        return "single-car";
    }

    /**
     * Link from View Car Page
     **/
    @RequestMapping(value = "/cars/make={car_make}", method = RequestMethod.GET)
    public String displayCarMake(@PathVariable("car_make") String car_make, ModelMap modelMap) {

        List<Car> cars = this.carService.getCars();

        List<Car> selectMake = new ArrayList<Car>();

        for (Car car : cars) {
            if (car_make.equals(car.getMake())) {
                selectMake.add(car);
            }
        }
        modelMap.addAttribute("carList", selectMake);

        return "all-cars";
    }

    //#1 Unregistered User
    @RequestMapping(value = "/cars/bid/carId={carId}", method = RequestMethod.GET)
    public String redirectToRegister(@PathVariable("carId") Integer carId, ModelMap modelMap) {

        modelMap.addAttribute("carId", carId);

        return "redirect:/customer/register/bid";
    }
}
