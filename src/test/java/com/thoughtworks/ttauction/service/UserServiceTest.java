package com.thoughtworks.ttauction.service;




import com.thoughtworks.ttauction.entity.User;
import com.thoughtworks.ttauction.repository.UserDao;
import com.thoughtworks.ttauction.service.UserServiceImpl.java.UserServiceImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.*;

public class UserServiceTest {

    @Mock
    private UserDao userDAO;

    @Mock
    private List<User> listOfUsers = new ArrayList<User>();

    @InjectMocks
    private UserService userService = new UserServiceImpl();

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testAddUser() throws Exception {
        doNothing().when(userDAO).addUser(any(User.class));
        userService.addUser(any(User.class));
        verify(userDAO, atLeastOnce()).addUser(any(User.class));
    }

    @Test
    public void testGetAllUsers() throws Exception {
        when(userDAO.getUsers()).thenReturn(listOfUsers);

        Assert.assertEquals(userService.getUsers(), listOfUsers);
        userService.getUsers();

        verify(userDAO, atLeastOnce()).getUsers();
    }
}
