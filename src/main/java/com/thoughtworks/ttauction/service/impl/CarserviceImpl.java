package com.thoughtworks.ttauction.service.impl;

import com.thoughtworks.ttauction.entity.Car;
import com.thoughtworks.ttauction.repository.CarDao;
import com.thoughtworks.ttauction.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CarserviceImpl implements CarService {

    private CarDao carDao;

    @Autowired
    public CarserviceImpl(CarDao carDao){
        this.carDao = carDao;
    }

    @Override
    @Transactional
    public void addCar(Car car) {
        carDao.addCar(car);
    }

    @Override
    @Transactional
    public List<Car> getCars() {
        return carDao.getCars();
    }

    @Override
    @Transactional
    public Car getCarById(int id) {
        return carDao.getCarById(id);
    }
}
