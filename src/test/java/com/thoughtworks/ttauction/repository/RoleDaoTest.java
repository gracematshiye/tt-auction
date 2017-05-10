//package com.thoughtworks.ttauction.repository;
//
//
//import com.thoughtworks.ttauction.entity.Role;
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.junit.Assert;
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.test.annotation.Rollback;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//import org.springframework.transaction.annotation.Transactional;
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration("file:src/test/webapp/WEB-INF/spring/*.xml")
//@Transactional
//public class RoleDaoTest {
//
//    @Autowired
//    private RoleDao roleDao;
//
//    @Autowired
//    private SessionFactory sessionFactory;
//
//    private Session session;
//
//    private Role role;
//
//    @Before
//    public void setUp() throws Exception {
//        session = sessionFactory.getCurrentSession();
//        role = new Role("Ralson", "ROLE_USER");
//
//    }
//
//    @Test
//    @Rollback(true)
//    public void testAddRole() throws Exception {
//        Assert.assertEquals(0, session.createQuery("from Role").list().size());
//
//        roleDao.addRole(role);
//
//        Assert.assertEquals(1, session.createQuery("from Role").list().size());
//
//    }
//
//    @Test
//    @Rollback(true)
//    public void testGetRoleByUserName() throws Exception {
//
//        Assert.assertEquals(0, roleDao.getRoleByUserName("Ralson"));
//
//        roleDao.addRole(role);
//
//    }
//
//}
