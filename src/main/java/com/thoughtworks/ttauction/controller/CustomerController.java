package com.thoughtworks.ttauction.controller;

import com.thoughtworks.ttauction.entity.Customer;
import com.thoughtworks.ttauction.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.util.List;

@Controller
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @RequestMapping(value = "/customer/register")
    public String viewRegisterPage() {

        return "register";
    }

    @RequestMapping(value = "/customer/register/add", method = RequestMethod.POST)
    public String addCustomer(@Valid @ModelAttribute("customer") Customer customer, BindingResult result, ModelMap model) {

        if (result.hasErrors()) {

            List<FieldError> errors = result.getFieldErrors();
            model.addAttribute("errors", errors);
            model.addAttribute("customer", customer);

            return "register";

        } else if (customerService.checkUserName(customer.getUsername()) == true) {

            model.addAttribute("ussErr", "Username already exist");
            return "register";

        } else if (!customer.getPassword().equals(customer.getPassword2())) {
            model.addAttribute("passErr", "Password not matching");

            return "register";

        } else if (!customer.getPassword().equals(customer.getPassword2())) {

            model.addAttribute("passErr", "Password confirmation not matching");
            return "register";

        } else {
            this.customerService.addCustomer(customer);

            return "redirect:/";
        }

    }


    @RequestMapping(value = "/customer/login", method = RequestMethod.GET)
    public String login(ModelMap modelMap) {

        return "redirect:/";
    }


    //#2 Unregistered User

    //@RequestMapping(value = "/add-user-bid?carId={car_id}", method = RequestMethod.GET)
    //public String addUserBid(@PathVariable("carId") Integer carId, ModelMap model){

    @RequestMapping(value = "/add-user-bid?carId={car_id}", method = RequestMethod.GET)
    public String addUserBid(ModelMap model) {
        System.out.println("\r\naddUserBid\r\n");
        //model.addAttribute("carId", carId);
        return "/customer/register/bid";
    }

    @RequestMapping(value = "/customer/register/bid", method = RequestMethod.GET)
    public String viewRegisterPage2(ModelMap model) {

        System.out.println("\r\nviewRegisterPage2\r\n");
        return "register";
    }

    @RequestMapping(value = "/customer/register/bid/add", method = RequestMethod.POST)
    public String addCustomer2(@Valid @ModelAttribute("customer") Customer customer, BindingResult result, ModelMap model) {

        System.out.println("\r\naddCustomer2\r\n");
        if (result.hasErrors()) {

            List<FieldError> errors = result.getFieldErrors();
            model.addAttribute("errors", errors);
            model.addAttribute("customer", customer);

            return "register";

        } else if (!customer.getPassword().equals(customer.getPassword2())) {
            model.addAttribute("passErr", "Password not matching");

            return "register";

        } else {

            customerService.addCustomer(customer);
            return "redirect:/cars";
        }
    }


//    @RequestMapping(value = "/add-user-bid/carId={carId}", method = RequestMethod.GET)
//    public String addUserBid2(@ModelAttribute("carId") Integer carId){
//        System.out.println("\r\nHere\r\n");
//        return "single-car";
//    }
}
