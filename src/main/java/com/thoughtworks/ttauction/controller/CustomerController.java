package com.thoughtworks.ttauction.controller;

import com.thoughtworks.ttauction.entity.Customer;
import com.thoughtworks.ttauction.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
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

        List<Customer> customers = customerService.getCustomers();

        for (int i = 0; i < customers.size(); i++) {

            if (result.hasErrors()) {

                List<FieldError> errors = result.getFieldErrors();
                model.addAttribute("errors", errors);
                model.addAttribute("customer", customer);

                return "register";

            }

            if (customer.getUsername() == customers.get(i).getUsername()) {

                model.addAttribute("ussErr", "Username already exist");
                return "register";

            } else if (!customer.getPassword().equals(customer.getPassword2())){

                model.addAttribute("passErr", "Password confirmation not matching");
                return "register";
            }
        }

        this.customerService.addCustomer(customer);

        return "redirect:/";
    }

    @RequestMapping(value = "/add-user-bid?carId={car_id}", method = RequestMethod.POST)
    public String addUserBid(ModelMap modelMap) {

//        List<User> listOfUsers = this.userService.getUsers();
//
//        for (int i = 0; i < listOfUsers.size(); i++) {
//
//        }

        return "redirect:/cars/{car_id}";
    }
}
