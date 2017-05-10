package com.thoughtworks.ttauction.controller;

import com.thoughtworks.ttauction.entity.Account;
import com.thoughtworks.ttauction.service.AccountService;
import com.thoughtworks.ttauction.service.BidService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
public class AccountController {

    AccountService accountService;
    BidService bidService;

    @Autowired
    public AccountController(AccountService accountService, BidService bidService) {
        this.accountService = accountService;
        this.bidService = bidService;
    }

    @RequestMapping(value = "/account/create", method = RequestMethod.GET)
    public String accountForm(ModelMap modelMap) {
        return "register/account";
    }

    @RequestMapping(value = "/account/create/add", method = RequestMethod.POST)
    public String addCustomer(@Valid @ModelAttribute("account") Account account, ModelMap model) {


        Account customer = new Account();

        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String hashedPassword = passwordEncoder.encode(account.getPassword());

        customer.setFirstName(account.getFirstName());
        customer.setLastName(account.getLastName());
        customer.setAddress(account.getAddress());
        customer.setEmail(account.getEmail());
        customer.setContact(account.getContact());
        customer.setUsername(account.getUsername());
        customer.setPassword(hashedPassword);
        customer.setDateOfBirth(account.getDateOfBirth());
        customer.setContact(account.getContact());
        customer.setEnable(true);

        if (accountService.checkUserName(account.getUsername())){
            model.addAttribute("ussErr", "Username already exist");
            return "register/account";

        } else if (accountService.checkEmail(account.getEmail())) {
            model.addAttribute("emlErr", "Email address already exist");
            return "register/account";

        } else {

            this.accountService.addAccount(customer);
            return "redirect:/";

        }

    }
}
