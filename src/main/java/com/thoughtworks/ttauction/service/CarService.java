package com.thoughtworks.ttauction.service;

import com.thoughtworks.ttauction.entity.Car;

import java.util.List;

public interface CarService {

    void addCar(Car car);
    List<Car> getCars();
    Car getCarById(int id);
}
