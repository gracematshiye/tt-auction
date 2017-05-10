package com.thoughtworks.ttauction.validation;

import com.thoughtworks.ttauction.entity.Car;

import java.util.HashMap;
import java.util.Map;

public class CarValidator {

    public static Map<String, String> validateCar(Car car){
        Map<String, String> errors = new HashMap<>();

        if (car.getModel().isEmpty()){
            errors.put("model", "Please enter the model name");
        }

        if (car.getMake().isEmpty()){
            errors.put("make", "Please enter the make name");
        }

        if (car.getMileage() == null){
            errors.put("mileage", "Please enter the car mileage");
        }

        if (car.getYear() == null){
            errors.put("year", "Please enter the car year");
        }
        if(car.getPrice() == null){
            errors.put("price", "Please enter the price in SA rands");
        }

        if (car.getCondition() == null){
            errors.put("condition", "Please enter the car condition");
        }

        if (car.getTransmission().isEmpty()){
            errors.put("transmission", "Please select the car transmission type");
        }
        if (car.getColour() == null){
            errors.put("mileage", "Please enter the car colour");
        }
        if (car.getFuel().isEmpty()){
            errors.put("fuel", "Please enter the fuel type of this car");
        }

        if (car.getDescription().isEmpty()){
            errors.put("description", "Please enter the car description");
        }

        if (car.getQuantity() == null){
            errors.put("mileage", "Please enter the car quantity");
        }
        if (car.getImageUrl().isEmpty()){
            errors.put("imageUrl", "Please chose an image to upload");
        }

        return errors;
    }
}
