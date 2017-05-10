package com.thoughtworks.ttauction.repository.impl;

import com.thoughtworks.ttauction.entity.Account;
import com.thoughtworks.ttauction.repository.AccountDao;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AccountDaoImpl implements AccountDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addAccount(Account account) {
        Session session = sessionFactory.getCurrentSession();
        session.save(account);
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Account> getAccounts() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Account").list();
    }

    @SuppressWarnings("unchecked")
    @Override
    public Account findById(int id) {

        Session session = sessionFactory.getCurrentSession();

        return (Account) session.createQuery("from Account where cus_id = " + id).list().toArray()[0];
    }

    @SuppressWarnings("unchecked")
    @Override
    public Account loadUserByUsername(String username) {

        Session session = sessionFactory.getCurrentSession();

        Query query = session.createQuery("from Account where cus_username = " + username);

        Account account = (Account)query.list().toArray()[0];

        return account;
    }
}
