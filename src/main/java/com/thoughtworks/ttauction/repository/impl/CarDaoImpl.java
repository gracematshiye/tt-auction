package com.thoughtworks.ttauction.repository.impl;

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
        getSessionFactory().save(car);
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Car> getCars() {
        Query query = getSessionFactory().createQuery("from Car order by car_id");

        return query.list();
    }


    @Override
    public Car getCarById(Integer car_id) {
        Query query = getSessionFactory().createQuery("from Car where car_id = " + car_id);
        return ((Car) query.list().toArray()[0]);
    }

    @Override
    public void update(Car car) {
        getSessionFactory().update(car);
    }

    private Session getSessionFactory(){

        return sessionFactory.getCurrentSession();
    }
}
