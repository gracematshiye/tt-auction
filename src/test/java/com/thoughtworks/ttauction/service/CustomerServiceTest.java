//package com.thoughtworks.ttauction.service;
//
//
//
//
//import com.thoughtworks.ttauction.entity.Customer;
//import com.thoughtworks.ttauction.repository.CustomerDao;
//import com.thoughtworks.ttauction.service.CustomerServiceImpl.java.CustomerServiceImpl;
//import org.junit.Assert;
//import org.junit.Before;
//import org.junit.Test;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.MockitoAnnotations;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import static org.mockito.Matchers.any;
//import static org.mockito.Mockito.*;
//
//public class CustomerServiceTest {
//
//    @Mock
//    private CustomerDao userDAO;
//
//    @Mock
//    private List<Customer> listOfUsers = new ArrayList<Customer>();
//
//    @InjectMocks
//    private CustomerService userService = new CustomerServiceImpl();
//
//    @Before
//    public void setUp() {
//        MockitoAnnotations.initMocks(this);
//    }
//
//    @Test
//    public void testAddCustomer() throws Exception {
//        doNothing().when(userDAO).addCustomer(any(Customer.class));
//        userService.addCustomer(any(Customer.class));
//        verify(userDAO, atLeastOnce()).addCustomer(any(Customer.class));
//    }
//
//    @Test
//    public void testGetAllCustomers() throws Exception {
//        when(userDAO.getCustomers()).thenReturn(listOfUsers);
//
//        Assert.assertEquals(userService.getCustomers(), listOfUsers);
//        userService.getCustomers();
//
//        verify(userDAO, atLeastOnce()).getCustomers();
//    }
//
//
//}
