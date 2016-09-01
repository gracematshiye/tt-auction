package com.thoughtworks.ttauction.service;


import com.thoughtworks.ttauction.entity.User;

import java.util.List;

public interface UserService {

    List<User> getUsers();
    void addUser(User user);
}
