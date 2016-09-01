package com.thoughtworks.ttauction.repository.UserDaoImpl.java;

import com.thoughtworks.ttauction.entity.User;
import com.thoughtworks.ttauction.repository.UserDao;
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

    }

    @Override
    public List<User> getUsers() {
        List<User> listOfUsers = new ArrayList<User>();
        return listOfUsers;
    }
}
