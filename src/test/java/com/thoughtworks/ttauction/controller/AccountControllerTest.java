//package com.thoughtworks.ttauction.controller;
//
//import com.thoughtworks.ttauction.entity.Account;
//import com.thoughtworks.ttauction.service.AccountService;
//import org.junit.Before;
//import org.mockito.Mock;
//import org.mockito.MockitoAnnotations;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.setup.MockMvcBuilders;
//import org.springframework.web.servlet.view.InternalResourceViewResolver;
//
//import javax.annotation.Resource;
//
//public class AccountControllerTest {
//
//    private MockMvc mockMvc;
//
//    private Account account;
//
//    @Mock
//    private AccountService accountService;
//
//    private AccountController accountController;
//
//    @Resource(name = "authenticationManager")
//    protected AuthenticationManager authenticationManager;
//
//    BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
//    private java.lang.String hashedPassword;
//
//    @Before
//    public void setUp() throws Exception {
//        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
//        viewResolver.setSuffix(".jsp");
//        viewResolver.setPrefix("/WEB-INF/views");
//
//        MockitoAnnotations.initMocks(this);
//
//        mockMvc = MockMvcBuilders.standaloneSetup(accountController)
//                .setViewResolvers(viewResolver)
//                .build();
//
//        account = new Account("firs-name","last-name","username","password","date", "h@gmail.com","0798989765","345 braam", true);
//
//    }
//}
