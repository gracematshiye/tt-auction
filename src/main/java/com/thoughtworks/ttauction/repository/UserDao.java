package com.thoughtworks.ttauction.repository;


import com.thoughtworks.ttauction.entity.User;

import java.util.List;


public interface UserDao {
    void addUser(User user);
    List<User> getUsers();


}
