package com.thoughtworks.ttauction.repository.UserDaoImpl.java;

import com.thoughtworks.ttauction.entity.User;
import com.thoughtworks.ttauction.repository.UserDao;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addUser(User user) {
        Session session = sessionFactory.getCurrentSession();

        session.save(user);
    }

    @Override
    public List<User> getUsers() {
        Session session = sessionFactory.getCurrentSession();

        Query query = session.createQuery("from User");

        return query.list();
    }
}
