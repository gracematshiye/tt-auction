//package com.thoughtworks.ttauction.entity;
//
//import org.junit.Assert;
//import org.junit.Before;
//import org.junit.Test;
//
//public class RoleTest {
//    private Role role;
//    private Role role1;
//
//    @Before
//    public void setUp() throws Exception {
//        role = new Role("Ralson", "ROLE_USER");
//        role1 = new Role("Hlulani", "ROLE_ADMIN");
//    }
//
//    @Test
//    public void testRoleIsNotNull() throws Exception {
//        Assert.assertNotNull(role);
//        Assert.assertNotNull(role1);
//    }
//
//    @Test
//    public void testRoleEqualToItSelf() throws Exception {
//        Assert.assertEquals(role, role);
//    }
//
//    @Test
//    public void testTwoRolesWithDifferentPropertiesAreNotEqual() throws Exception {
//        Assert.assertNotEquals(role, role1);
//    }
//
//    @Test
//    public void testEqualsRolesHasSameHashCode() throws Exception {
//        role1 = role;
//
//        Assert.assertEquals(role.hashCode(), role1.hashCode());
//    }
//
//    @Test
//    public void testUnEqualRolesHasDifferentHashCode() throws Exception {
//        Assert.assertNotEquals(role.hashCode(), role1.hashCode());
//    }
//}
