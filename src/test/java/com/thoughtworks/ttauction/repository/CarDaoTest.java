package com.thoughtworks.ttauction.repository;

import com.thoughtworks.ttauction.entity.Car;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/test/webapp/resources/applicationContext-car-dao-test.xml")
@Transactional
public class CarDaoTest {

    @Autowired
    private CarDao carDao ;

    @Autowired
    private SessionFactory sessionFactory;

    private Session session;

    private Car car;

    @Before
    public void setUp() throws Exception {
        session = sessionFactory.getCurrentSession();
        car = new Car("Model name 1", "Make name 1", 27712, 2016, new BigDecimal(120000), "Condition 1", "Color 1", "Transmission 1", "Fuel type 1", "Description 1", new BigDecimal(100000));
    }

    /** Checking the database state**/
    @Test
    @Rollback(true)
    public void testAddCar() throws Exception {
        Assert.assertEquals(0, session.createQuery("from Car").list().size());

        session.save(car);

        Assert.assertEquals(1, session.createQuery("from Car").list().size());
    }

    @Test
    @Rollback(true)
    public void testGetCars() throws Exception {
        Assert.assertEquals(0, session.createQuery("from Car").list().size());

        session.save(car);

        Assert.assertEquals(1, session.createQuery("from Car").list().size());

        List<Car> cars = carDao.getCars();

        Assert.assertEquals(car.getModel(), cars.get(0).getModel());
        Assert.assertEquals(car.getMake(), cars.get(0).getMake());
        Assert.assertEquals(car.getPrice(), cars.get(0).getPrice());
        Assert.assertEquals(car.getDescription(), cars.get(0).getDescription());
        Assert.assertEquals(car.getColour(), cars.get(0).getColour());
        Assert.assertEquals(car.getCondition(), cars.get(0).getCondition());
        Assert.assertEquals(car.getFuel(), cars.get(0).getFuel());
        Assert.assertEquals(car.getMileage(), cars.get(0).getMileage());
        Assert.assertEquals(car.getYear(), cars.get(0).getYear());
        Assert.assertEquals(car.getPriceOffer(), cars.get(0).getPriceOffer());
        Assert.assertEquals(car.getTransmission(), cars.get(0).getTransmission());
    }

    @Test
    @Rollback(true)
    public void testGetCarById() throws Exception {

    }
}

