package com.thoughtworks.ttauction.service.CarServiceImpl.java;

import com.thoughtworks.ttauction.entity.Car;
import com.thoughtworks.ttauction.repository.CarDao;
import com.thoughtworks.ttauction.repository.impl.CarDaoImpl;
import com.thoughtworks.ttauction.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    @Autowired
    private CarDao carDao = new CarDaoImpl();

    public CarServiceImpl() {
    }

    @Override
    @Transactional
    public void addCar(Car car) {
        this.carDao.addCar(car);
    }

    private void insertOrUpdate(Car car) {
        if (car.getId() == null) {
            carDao.addCar(car);
        }else {
            carDao.update(car);
        }
    }

    @Override
    @Transactional
    public void storeImage(Car car, String pathRoot, MultipartFile file) {
        if (!file.isEmpty()) {
            try {
                String imageUrl = "/images/" + file.getOriginalFilename();
                File imageFile = new File(pathRoot + imageUrl);
                file.transferTo(imageFile);
                car.setImageUrl(imageUrl);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    @Transactional
    public Car getCarById(Integer car_id) {
        return this.carDao.getCarById(car_id);
    }

    @Override
    @Transactional
    public List<Car> getCars() {
        return this.carDao.getCars();
    }

}
