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

    private SessionFactory sessionFactory;

    @Autowired
    public CarDaoImpl(SessionFactory sessionFactory){
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void addCar(Car car) {
        Session session = sessionFactory.getCurrentSession();

        session.save(car);
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Car> getCars() {
        Session session =sessionFactory.getCurrentSession();

        Query query = session.createQuery("from Car");

        return query.list();
    }

    @SuppressWarnings("unchecked")
    @Override
    public Car getCarById(int id) {
        Session session = sessionFactory.getCurrentSession();

        Car car = (Car)session.load(Car.class, new Integer(id));
        return car;
    }
}
