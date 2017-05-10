package com.thoughtworks.ttauction.controller;

import com.thoughtworks.ttauction.entity.Car;
import com.thoughtworks.ttauction.service.AccountService;
import com.thoughtworks.ttauction.service.BidService;
import com.thoughtworks.ttauction.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.security.Principal;
import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    static final String CAR_LIST_PAGE = "all-cars";
    static final String CAR_PAGE = "single-car";

    @Autowired
    private CarService carService;

    @Autowired
    private BidService bidService;

    @Autowired
    private AccountService accountService;

    /**
     * This method returns a list of cars
     **/
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String displayAllCars(ModelMap modelMap, Principal principal) {


//        Car car = new Car("VW", "VW TSI", 1243, 2016, new BigDecimal(130500), "Engine failure", "White", "Automatic", "Disel", "This car is fast",10 , );
//        carService.addCar(car);
//        carService.addCar(car);

        modelMap.addAttribute("carList", this.carService.getCars());
        //modelMap.addAttribute("bidSize", "[" + bidService.getBidCarsDetailsByUserName(principal.getName()).size() + "]");

        return "all-cars";
    }

    @RequestMapping(value = "/cars/car/{carId}", method = RequestMethod.GET)
    public String displayACar(@PathVariable("carId") Integer carId, ModelMap modelMap, Principal principal) {

        modelMap.addAttribute("car", this.carService.getCarById(carId));
        modelMap.addAttribute("bidSize", "[" + bidService.getBidCarsDetailsByUserName(principal.getName()).size() + "]");
        return CAR_PAGE;
    }

    /**
     * Link from View Car Page
     **/
    @RequestMapping(value = "/cars/make={car_make}", method = RequestMethod.GET)
    public String displayCarMake(@PathVariable("car_make") String car_make, ModelMap modelMap, Principal principal) {

        List<Car> cars = this.carService.getCars();

        List<Car> selectMake = new ArrayList<Car>();

        for (Car car : cars) {
            if (car_make.equals(car.getMake())) {
                selectMake.add(car);
            }
        }
        modelMap.addAttribute("carList", selectMake);

        modelMap.addAttribute("bidSize", "[" + bidService.getBidCarsDetailsByUserName(principal.getName()).size() + "]");

        return CAR_LIST_PAGE;
    }


}
