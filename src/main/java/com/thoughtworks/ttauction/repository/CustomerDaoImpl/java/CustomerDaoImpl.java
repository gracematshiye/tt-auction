package com.thoughtworks.ttauction.repository.CustomerDaoImpl.java;

import com.thoughtworks.ttauction.entity.Customer;
import com.thoughtworks.ttauction.repository.CustomerDao;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CustomerDaoImpl implements CustomerDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addCustomer(Customer customer) {
        Session session = sessionFactory.getCurrentSession();

        session.save(customer);

    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Customer> getCustomers() {

        Session session = sessionFactory.getCurrentSession();

        return session.createQuery("from Customer").list();
    }
}
