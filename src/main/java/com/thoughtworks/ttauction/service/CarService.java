package com.thoughtworks.ttauction.service;

import com.thoughtworks.ttauction.entity.Car;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface CarService {

    void addCar(Car car);
    List<Car> getCars();
    Car getCarById(Integer car_id);
    void storeImage(Car car, String pathRoot, MultipartFile file);
}
