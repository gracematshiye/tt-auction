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
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class CarController {

    @Autowired
    private CarService carService = new CarServiceImpl();

    @Autowired
    private CustomerService customerService;

    /** This method returns a list of cars **/
    @RequestMapping(value = "/cars", method = RequestMethod.GET)
    public String displayAllCars(ModelMap modelMap){

        modelMap.addAttribute("carList", this.carService.getCars());

        return "all-cars";
    }

    /** This method returns a selected car **/
    @RequestMapping(value = "/cars/{car_id}", method = RequestMethod.GET)
    public String displayACar(@PathVariable("car_id") Integer car_id, ModelMap modelMap){

        List<Car> cars = this.carService.getCars();

        modelMap.addAttribute("car", cars.get(car_id - 1));

        return "single-car";
    }
//
//    @RequestMapping(value = "/cars/bid/carId={carId}&userId={userId}&offer={offer}", method = RequestMethod.GET)
//    public String bidOnCar(@PathVariable("carId") Integer carId, @PathVariable("userId") Integer userId, ModelMap modelMap){
//
////        if (userId == null)
////        {
////            modelMap.addAttribute("carId", carId);
////            return "redirect:/register";
////        }
//
//        //Display textBox: Your Offer.
//        List<Car> cars = this.carService.getCars();
//
//        //modelMap.addAttribute("car", this.carService.getCarById(car_id));
//        userId = 2314;
//
//        modelMap.addAttribute("userId", userId);
//        modelMap.addAttribute("car", cars.get(carId - 1));
//        return "single-car";
//    }
//
//    @RequestMapping(value = "/cars/bid/carId={carId}", method = RequestMethod.GET)
//    public String gotoRegister(@PathVariable("carId") Integer carId, ModelMap modelMap){
//
//        modelMap.addAttribute("carId", carId);
//        return "redirect:/register";
//    }
}
