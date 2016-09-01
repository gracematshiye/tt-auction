package com.thoughtworks.ttauction.service.UserServiceImpl.java;

import com.thoughtworks.ttauction.entity.User;
import com.thoughtworks.ttauction.repository.UserDao;
import com.thoughtworks.ttauction.repository.UserDaoImpl.java.UserDaoImpl;
import com.thoughtworks.ttauction.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao = new UserDaoImpl();

    public UserServiceImpl() {
    }

    @Override
    @Transactional
    public void addUser(User user) {



        this.userDao.addUser(user);
    }

    @Override
    @Transactional
    public List<User> getUsers() {

        return userDao.getUsers();
    }
}
