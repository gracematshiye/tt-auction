package com.thoughtworks.ttauction.controller.user;


import com.thoughtworks.ttauction.controller.UserController;
import com.thoughtworks.ttauction.entity.User;
import com.thoughtworks.ttauction.service.UserServiceTest;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

public class UserControllerTest {

//    private MockMvc mockMvc;
//
//    @Mock
//    private UserServiceTest userService ;
//
//    @InjectMocks
//    private UserController controller;
//
//    private User user;
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
//        user = new User();
//
//    }
//
//    @Test
//    public void VerifyThatTheHTTPStatusIsFound() throws Exception {
//        mockMvc.perform(post("/cars/add-user"))
//                .andExpect(status().isFound());
//
//    }
//
//    @Test
//    public void testIfItCanRedirectToHomepage() throws Exception {
//        mockMvc.perform(post("/cars/add-user"))
//                .andExpect(view().name("redirect:/all-cars"));
//    }
//
//    @Test
//    public void verifyThatAttributeExists() throws Exception {
//        mockMvc.perform(post("/cars/add-user"));
//
//    }
}
