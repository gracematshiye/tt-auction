package com.thoughtworks.ttauction.repository;

import com.thoughtworks.ttauction.entity.Customer;

import java.util.List;

public interface CustomerDao {

    void addCustomer(Customer customer);
    List<Customer> getCustomers();
}
