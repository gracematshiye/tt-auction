package com.thoughtworks.ttauction.controller;

import com.thoughtworks.ttauction.entity.Car;
import com.thoughtworks.ttauction.service.AccountService;
import com.thoughtworks.ttauction.service.BidService;
import com.thoughtworks.ttauction.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.security.Principal;

@Controller
public class AdminController {


    @Autowired
    private AccountService accountService;

    @Autowired
    private BidService bidService;

    @Autowired
    private CarService carService;

    @RequestMapping(value = "/admin/car/manage", method = RequestMethod.GET)
    public String get(@ModelAttribute("car") Car car, ModelMap modelMap, Principal principal) {

        String username = principal.getName();

        if (bidService.getBidsByUserName(username).size() > 0) {
            modelMap.addAttribute("bidSize", "[" + bidService.getBidCarsDetailsByUserName(principal.getName()).size() + "]");

        } else {
            modelMap.addAttribute("bidSize", "[" + 0 + "]");
        }
        return "Adminstration/manage-car";
    }

    @RequestMapping(value = "/admin/car/manage/create")
    public String post(@Valid @ModelAttribute("car") Car car,
                       @RequestParam(value = "file", required = false) MultipartFile file,
                       HttpServletRequest request,
                       ModelMap modelMap) {

        String pathRoot = request.getSession().getServletContext().getRealPath("");

        carService.storeImage(car, pathRoot, file);
        carService.addCar(car);

        return "redirect:/";

    }
}
