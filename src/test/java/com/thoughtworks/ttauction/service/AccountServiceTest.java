//package com.thoughtworks.ttauction.service;
//
//
//
//
//import com.thoughtworks.ttauction.entity.Account;
//import com.thoughtworks.ttauction.entity.Role;
//import com.thoughtworks.ttauction.repository.AccountDao;
//import com.thoughtworks.ttauction.repository.RoleDao;
//import com.thoughtworks.ttauction.repository.impl.AccountDaoImpl;
//import com.thoughtworks.ttauction.repository.impl.RoleDaoImpl;
//import com.thoughtworks.ttauction.service.AccountServiceImpl.java.AccountServiceImpl;
//import org.junit.Assert;
//import org.junit.Before;
//import org.junit.Test;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.MockitoAnnotations;
//import org.springframework.test.annotation.Rollback;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import static org.mockito.Mockito.*;
//
//@Rollback(true)
//public class AccountServiceTest {
//
//
//
//    @Mock
//    private AccountDao accountDao = new AccountDaoImpl();
//
//    @Mock
//    private RoleDao roleDao = new RoleDaoImpl();
//
//    @Mock
//    List<Account> accountList = new ArrayList<>();
//
//    @InjectMocks
//    private AccountService accountService = new AccountServiceImpl();
//
//    @Before
//    public void setUp() {
//        MockitoAnnotations.initMocks(this);
//    }
//
//    @Test
//    public void testAddCustomer() throws Exception {
//
//        Account account = new Account("firstName", "lastName", "userName", "password", "dateOfBirth", "h@mail.com", "0786683662", "address", true);
//        Role role = new Role(account.getUsername(), "ROLE_USER");
//
//        doNothing().when(accountDao).addAccount(account);
//
//
//        accountService.addAccount(account);
//
//        verify(accountDao, atLeastOnce()).addAccount(account);
//        verify(roleDao, atLeastOnce()).addRole(role);
//    }
//
//    @Test
//    public void testGetAllCustomers() throws Exception {
//        when(accountDao.getAccounts()).thenReturn(accountList);
//
//        Assert.assertEquals(accountService.getAccounts(), accountList);
//        //accountService.getAccounts();
//
//        verify(accountDao, atLeastOnce()).getAccounts();
//    }
//
//
//    @Test
//    public void testGetByUserName() throws Exception {
//        Account account = new Account("firstName", "lastName", "userName", "password", "dateOfBirth", "h@mail.com", "0786683662", "address", true);
//        when(accountDao.loadUserByUsername("userName")).thenReturn(account);
//
//        Assert.assertEquals(accountService.loadUserByUsername("userName").getUsername(), "userName");
//        verify(accountDao, atLeastOnce()).loadUserByUsername("userName");
//    }
//
//}
