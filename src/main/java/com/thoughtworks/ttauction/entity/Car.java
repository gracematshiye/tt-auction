package com.thoughtworks.ttauction.entity;


import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "Car")
public class Car {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String make;
    private String model;
    private String transmission;
    private int mileage;
    private String description;
    private BigDecimal price;
    private BigDecimal priceOffer;

    public Car(){

    }

    public Car( String make, String model, String transmission, int mileage, String description, BigDecimal price, BigDecimal priceOffer) {

        this.make = make;
        this.model = model;
        this.transmission = transmission;
        this.mileage = mileage;
        this.description = description;
        this.price = price;
        this.priceOffer = priceOffer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getPriceOffer() {
        return priceOffer;
    }

    public void setPriceOffer(BigDecimal priceOffer) {
        this.priceOffer = priceOffer;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", transmission='" + transmission + '\'' +
                ", mileage='" + mileage + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", priceOffer=" + priceOffer +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (id != car.id) return false;
        if (mileage != car.mileage) return false;
        if (make != null ? !make.equals(car.make) : car.make != null) return false;
        if (model != null ? !model.equals(car.model) : car.model != null) return false;
        if (transmission != null ? !transmission.equals(car.transmission) : car.transmission != null) return false;
        if (description != null ? !description.equals(car.description) : car.description != null) return false;
        if (price != null ? !price.equals(car.price) : car.price != null) return false;
        return priceOffer != null ? priceOffer.equals(car.priceOffer) : car.priceOffer == null;

    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (make != null ? make.hashCode() : 0);
        result = 31 * result + (model != null ? model.hashCode() : 0);
        result = 31 * result + (transmission != null ? transmission.hashCode() : 0);
        result = 31 * result + mileage;
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + (priceOffer != null ? priceOffer.hashCode() : 0);
        return result;
    }
}
