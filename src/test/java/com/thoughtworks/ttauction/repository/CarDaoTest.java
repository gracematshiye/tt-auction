package com.thoughtworks.ttauction.repository;//package com.thoughtworks.ttauction.repository;

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
import java.util.ArrayList;
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

        List<Car> cars = new ArrayList<Car>(){{
            add(car);
        }};

        List<Car> carList_DB = session.createQuery("from Car").list();

        Assert.assertEquals(cars, carList_DB);

        Assert.assertEquals(cars.get(0).getId(), carList_DB.get(0).getId());
        Assert.assertEquals(cars.get(0).getModel(), carList_DB.get(0).getModel());
    }

}

