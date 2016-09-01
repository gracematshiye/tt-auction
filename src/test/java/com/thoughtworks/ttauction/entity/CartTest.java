package com.thoughtworks.ttauction.entity;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

public class CartTest {

    private Car car;
    private Car car1;

    @Before
    public void setUp() throws Exception {
        car = new Car("Model name 1", "Make name 1", 27712, 2016, new BigDecimal(120000), "Condition 1", "Color 1", "Transmission 1", "Fuel type 1", "Description 1", new BigDecimal(100000));
        car1 = new Car("Model name 2", "Make name 2", 30000, 2014, new BigDecimal(100000), "Condition 2", "Color 2", "Transmission 2", "Fuel type 2", "Description 2", new BigDecimal(90000));
    }

    @Test
    public void testCarIsNotNull() throws Exception {
        Assert.assertNotNull(car);
        Assert.assertNotNull(car1);
    }

    @Test
    public void testCarEqualToItSelf() throws Exception {
        Assert.assertEquals(car, car);
    }

    @Test
    public void testTwoCarsWithDifferentPropertiesAreNotEqual() throws Exception {
        Assert.assertNotEquals(car, car1);
    }

    @Test
    public void testEqualsCarsHasSameHashCode() throws Exception {
        car1 = car;

        Assert.assertEquals(car.hashCode(), car1.hashCode());
    }

    @Test
    public void testUnEqualCarsHasDifferentHashCode() throws Exception {
        Assert.assertNotEquals(car.hashCode(), car1.hashCode());
    }
}
