package com.thoughtworks.ttauction.repository.CarDaoImpl.java;

import com.thoughtworks.ttauction.entity.Car;
import com.thoughtworks.ttauction.repository.CarDao;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addCar(Car car) {
        Session session = sessionFactory.getCurrentSession();

        session.save(car);
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Car> getCars() {
        Session session = sessionFactory.getCurrentSession();

        Query query = session.createQuery("from Car order by car_id");

        return query.list();
    }


    @Override
    public Car getCarById(Integer car_id) {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("from Car where car_id = " + car_id);
        Car car = ((Car) query.list().toArray()[0]);
        return car;
    }
}
