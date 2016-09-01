package com.thoughtworks.ttauction.repository;

import com.thoughtworks.ttauction.entity.Car;

import java.util.List;

public interface CarDao {

    void addCar(Car car);
    List<Car> getCars();
    Car getCarById(Integer id);
}
