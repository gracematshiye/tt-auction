package com.thoughtworks.ttauction.service.CarServiceImpl.java;

import com.thoughtworks.ttauction.entity.Car;
import com.thoughtworks.ttauction.repository.CarDao;
import com.thoughtworks.ttauction.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    CarDao carDao;

    @Autowired
    public CarServiceImpl(CarDao carDao){
        this.carDao = carDao;
    }

    public CarServiceImpl(){

    }

    @Override
    @Transactional
    public void addCar(Car car) {
        this.carDao.addCar(car);
    }

    @Override
    @Transactional
    public List<Car> getCars() {
        return this.carDao.getCars();
    }

    @Override
    @Transactional
    public Car getCarById(int id) {
        return this.carDao.getCarById(id);
    }
}
