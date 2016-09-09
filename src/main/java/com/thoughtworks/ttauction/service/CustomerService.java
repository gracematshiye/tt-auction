package com.thoughtworks.ttauction.service;

import com.thoughtworks.ttauction.entity.Customer;

import java.util.List;

public interface CustomerService {
    void addCustomer(Customer customer);
    List<Customer> getCustomers();
    boolean checkUserName(String username);
    boolean checkEmail(String email);
}
