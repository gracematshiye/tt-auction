//package com.thoughtworks.ttauction.controller.customerController;
//
//import com.thoughtworks.ttauction.controller.CustomerController;
//import com.thoughtworks.ttauction.entity.Customer;
//import com.thoughtworks.ttauction.service.CustomerService;
//import org.junit.Assert;
//import org.junit.Before;
//import org.junit.Test;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.MockitoAnnotations;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.setup.MockMvcBuilders;
//import org.springframework.ui.ModelMap;
//import org.springframework.validation.BindingResult;
//import org.springframework.web.servlet.view.InternalResourceViewResolver;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import static org.mockito.Mockito.when;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//
//public class AddCustomerControllerTest {
//
//    private MockMvc mockMvc;
//
//    @Mock
//    private CustomerService customerService;
//
//    @InjectMocks
//    private CustomerController controller;
//
//    List<Customer> customerList = new ArrayList<>();
//
//    private Customer customer;
//
//    @Before
//    public void setUp() throws Exception {
//        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
//        viewResolver.setSuffix(".jsp");
//        viewResolver.setPrefix("/WEB-INF/views");
//
//        MockitoAnnotations.initMocks(this);
//
//        mockMvc = MockMvcBuilders.standaloneSetup(controller)
//                .setViewResolvers(viewResolver)
//                .build();
//
//        customer = new Customer("firstName", "lastName", "userName", "password", "password", "dateOfBirth", "email", "contact", "address");
//
//        customerList.add(customer);
//
//        when(customerService.getCustomers()).thenReturn(customerList);
//
//    }
//
//
//    @Test
//    public void testHTTPStatusForRegisterViewIsOkay() throws Exception {
//        mockMvc.perform(post("/customer/register"))
//                .andExpect(status().isOk());
//    }
//
//    @Test
//    public void testHTTPStatusForAddIsOkay() throws Exception {
//        mockMvc.perform(post("/customer/register/add"))
//                .andExpect(status().isOk());
//    }
//
//
//}
