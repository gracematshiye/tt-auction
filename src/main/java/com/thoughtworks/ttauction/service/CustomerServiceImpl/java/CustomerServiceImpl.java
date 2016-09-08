package com.thoughtworks.ttauction.service.CustomerServiceImpl.java;

import com.thoughtworks.ttauction.entity.Customer;
import com.thoughtworks.ttauction.repository.CustomerDao;
import com.thoughtworks.ttauction.repository.CustomerDaoImpl.java.CustomerDaoImpl;
import com.thoughtworks.ttauction.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerDao customerDao = new CustomerDaoImpl();

    @Override
    @Transactional
    public void addCustomer(Customer customer) {
        this.customerDao.addCustomer(customer);
    }

    @Override
    @Transactional
    public List<Customer> getCustomers() {
        return this.customerDao.getCustomers();
    }

    @Override
    @Transactional
    public boolean checkUserName(String username) {

        boolean exist = false;

        for (int i = 0; i < getCustomers().size(); i++) {
            if (username.equals(getCustomers().get(i).getUsername())) {

                exist = true;

            } else {
                exist = false;
            }
        }
        return exist;
    }
}
