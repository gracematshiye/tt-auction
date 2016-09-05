package com.thoughtworks.ttauction.repository;


import com.thoughtworks.ttauction.entity.Customer;
import com.thoughtworks.ttauction.repository.CustomerDaoImpl.java.CustomerDaoImpl;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/test/webapp/resources/applicationContext-car-dao-test.xml")
@Transactional
public class CustomerDaoTest {

    /**  This will be implemented when the remote database is up and running  **/

    @Autowired
    private CustomerDao customerDao = new CustomerDaoImpl();

    @Autowired
    private SessionFactory sessionFactory;

    private Session session;

    private Customer customer;

    @Before
    public void setUp() throws Exception {

        customer = new Customer("firstName", "lastName", "userName", "password", "dateOfBirth", "email", "contact", "address");
        session = sessionFactory.getCurrentSession();
    }

    @Test
    @Rollback(true)
    public void testAddCustomer() throws Exception {
       Assert.assertEquals(0, session.createQuery("from Customer").list().size());

        session.save(customer);

        Assert.assertEquals(1, session.createQuery("from Customer").list().size());
    }

    @Test
    @Rollback(true)
    public void testGetAllCustomers() throws Exception {
        Assert.assertEquals(0, session.createQuery("from Customer").list().size());

        session.save(customer);

        List<Customer> customers = new ArrayList<Customer>(){{
            add(customer);
        }};

        List<Customer> customerList_DB = session.createQuery("from Customer").list();

        Assert.assertEquals(customers, customerList_DB);

        Assert.assertEquals(customers.get(0).getUserId(), customerList_DB.get(0).getUserId());
        Assert.assertEquals(customers.get(0).getDateOfBirth(), customerList_DB.get(0).getDateOfBirth());
    }
}
