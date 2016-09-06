package com.thoughtworks.ttauction.controller;

import com.thoughtworks.ttauction.entity.Customer;
import com.thoughtworks.ttauction.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.Validator;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
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

        if (result.hasErrors()){

            List<FieldError> errors = result.getFieldErrors();
            model.addAttribute("errors", errors);
            model.addAttribute("customer", customer);

            return "register";
        }

//        customerService.addCustomer(customer);

        return "redirect:/cars";
    }
}
