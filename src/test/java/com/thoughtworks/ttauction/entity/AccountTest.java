//package com.thoughtworks.ttauction.entity;
//
//
//import org.junit.Before;
//import org.junit.Assert;
//import org.junit.Test;
//
//public class AccountTest {
//
//    private Account account;
//    private Account account1;
//
//    @Before
//    public void setUp() throws Exception {
//        account = new Account("firs-name","last-name","username","password","date", "h@gmail.com","0798989765","345 braam", true);
//        account1 = new Account("lebom","gala","lebo","password1", "11 feb 1988","lebomathe@gmail.com","0798099765","115 braam", true);
//    }
//
//    @Test
//    public void testUserIsNotNull() throws Exception {
//        Assert.assertNotNull(account);
//        Assert.assertNotNull(account1);
//    }
//
//    @Test
//    public void testUserEqualToItSelf() throws Exception {
//        Assert.assertEquals(account, account);
//    }
//
//    @Test
//    public void testTwoUsersWithDifferentPropertiesAreNotEqual() throws Exception {
//        Assert.assertNotEquals(account, account1);
//    }
//
//    @Test
//    public void testEqualsusersHasSameHashCode() throws Exception {
//        account1 = account;
//
//        Assert.assertEquals(account.hashCode(), account1.hashCode());
//    }
//
//    @Test
//    public void testUnEqualUsersHasDifferentHashCode() throws Exception {
//        Assert.assertNotEquals(account.hashCode(), account1.hashCode());
//    }
//}
