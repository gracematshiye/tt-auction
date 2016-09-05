package com.thoughtworks.ttauction.entity;


import org.junit.Before;
import org.junit.Assert;
import org.junit.Test;

public class CustomerTest {

    private Customer customer;
    private Customer customer1;

    @Before
    public void setUp() throws Exception {
        customer = new Customer("firs-name","last-name","username","password","password","date", "h@gmail.com","0798989765","345 braam");
        customer1 = new Customer("lebom","gala","lebo","password1", "password1", "11 feb 1988","lebomathe@gmail.com","0798099765","115 braam");
    }

    @Test
    public void testUserIsNotNull() throws Exception {
        Assert.assertNotNull(customer);
        Assert.assertNotNull(customer1);
    }

    @Test
    public void testUserEqualToItSelf() throws Exception {
        Assert.assertEquals(customer, customer);
    }

    @Test
    public void testTwoUsersWithDifferentPropertiesAreNotEqual() throws Exception {
        Assert.assertNotEquals(customer, customer1);
    }

    @Test
    public void testEqualsusersHasSameHashCode() throws Exception {
        customer1 = customer;

        Assert.assertEquals(customer.hashCode(), customer1.hashCode());
    }

    @Test
    public void testUnEqualUsersHasDifferentHashCode() throws Exception {
        Assert.assertNotEquals(customer.hashCode(), customer1.hashCode());
    }
}
