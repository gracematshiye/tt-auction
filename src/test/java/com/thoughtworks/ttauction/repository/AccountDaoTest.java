//package com.thoughtworks.ttauction.repository;
//
//
//import com.thoughtworks.ttauction.entity.Account;
//import com.thoughtworks.ttauction.repository.impl.AccountDaoImpl;
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.junit.Assert;
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.test.annotation.Rollback;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//import org.springframework.transaction.annotation.Transactional;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration("file:src/test/webapp/WEB-INF/spring/applicationContext-car-dao-test.xml")
//@Transactional
//public class AccountDaoTest {
//
//    /**  This will be implemented when the remote database is up and running  **/
//
//    @Autowired
//    private AccountDao accountDao = new AccountDaoImpl();
//
//    @Autowired
//    private SessionFactory sessionFactory;
//
//    private Session session;
//
//    private Account account;
//
//    @Before
//    public void setUp() throws Exception {
//
//        account = new Account("firstName", "lastName", "userName", "password", "dateOfBirth", "h@mail.com", "0786683662", "address", true);
//        session = sessionFactory.getCurrentSession();
//    }
//
//    @Test
//    @Rollback(value = true)
//    public void testAddCustomer() throws Exception {
//       Assert.assertEquals(0, session.createQuery("from Account").list().size());
//
//        session.save(account);
//
//        Assert.assertEquals(1, session.createQuery("from Account").list().size());
//    }
//
//    @Test
//    @Rollback(value = true)
//    public void testGetAllCustomers() throws Exception {
//        Assert.assertEquals(0, session.createQuery("from Account").list().size());
//
//        session.save(account);
//
//        List<Account> accounts = new ArrayList<Account>(){{
//            add(account);
//        }};
//
//        List<Account> accountList_DB = session.createQuery("from Account").list();
//
//        Assert.assertEquals(accounts, accountList_DB);
//
//        Assert.assertEquals(accounts.get(0).getId(), accountList_DB.get(0).getId());
//        Assert.assertEquals(accounts.get(0).getDateOfBirth(), accountList_DB.get(0).getDateOfBirth());
//    }
//
//    @Test
//    @Rollback(value = true)
//    public void testGetCarById() throws Exception {
//        Assert.assertEquals(0, session.createQuery("from Account").list().size());
//
//        session.save(account);
//
//        List<Account> accounts = new ArrayList<Account>(){{
//            add(account);
//        }};
//
//        Assert.assertEquals(accounts.get(0).getId() , account.getId());
//
//    }
//}
