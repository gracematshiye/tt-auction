//package com.thoughtworks.ttauction.service;
//
//import com.thoughtworks.ttauction.entity.Role;
//import com.thoughtworks.ttauction.repository.RoleDao;
//import com.thoughtworks.ttauction.repository.impl.RoleDaoImpl;
//import com.thoughtworks.ttauction.service.RoleServiceImpl.java.RoleServiceImpl;
//import org.junit.Before;
//import org.junit.Test;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.MockitoAnnotations;
//import org.springframework.test.annotation.Rollback;
//
//import static org.mockito.Matchers.any;
//import static org.mockito.Mockito.*;
//
//@Rollback(true)
//public class RoleServiceTest {
//
//    @Mock
//    private RoleDao roleDao = new RoleDaoImpl();
//
//    @InjectMocks
//    private RoleService roleService = new RoleServiceImpl();
//
//    @Before
//    public void setUp() {
//        MockitoAnnotations.initMocks(this);
//    }
//
//    @Test
//    public void testAddNewCar() throws Exception {
//
//        doNothing().when(roleDao).addRole(any(Role.class));
//        roleService.addRole(any(Role.class));
//        verify(roleDao, atLeastOnce()).addRole(any(Role.class));
//    }
//
//
//}
