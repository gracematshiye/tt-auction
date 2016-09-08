package com.thoughtworks.ttauction.service;




import com.thoughtworks.ttauction.entity.Customer;
import com.thoughtworks.ttauction.repository.CustomerDao;
import com.thoughtworks.ttauction.service.CustomerServiceImpl.java.CustomerServiceImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.annotation.Rollback;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.*;

@Rollback(true)
public class CustomerServiceTest {

    @Mock
    private CustomerDao userDAO;

    @Mock
    List<Customer> customerList = new ArrayList<>();

    @InjectMocks
    private CustomerService userService = new CustomerServiceImpl();

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testAddCustomer() throws Exception {

        Customer  customer = new Customer("firstName", "lastName", "userName", "password", "password", "dateOfBirth", "h@mail.com", "0786683662", "address");

        doNothing().when(userDAO).addCustomer(customer);
        userService.addCustomer(customer);
        verify(userDAO, atLeastOnce()).addCustomer(customer);
    }

    @Test
    public void testGetAllCustomers() throws Exception {
        when(userDAO.getCustomers()).thenReturn(customerList);

        Assert.assertEquals(userService.getCustomers(), customerList);
        userService.getCustomers();

        verify(userDAO, atLeastOnce()).getCustomers();
    }


}
