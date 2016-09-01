package com.thoughtworks.ttauction.entity;


import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "Car")
public class Car {

    @Id
    @Column(name = "car_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "car_model_name")
    private String model;

    @Column(name = "car_make_name")
    private String make;

    @Column(name = "car_mileage")
    private int mileage;

    @Column(name = "car_year")
    private int year;

    @Column(name = "car_price")
    private BigDecimal price;

    @Column(name = "car_condition")
    private String condition;

    @Column(name = "car_colour")
    private String colour;

    @Column(name = "car_transmission")
    private String transmission;

    @Column(name = "car_fuel_type")
    private String fuel;

    @Column(name = "car_description")
    private String description;

    @Column(name = "car_price_offer")
    private BigDecimal priceOffer;

    public Car(String model, String make, int mileage, int year, BigDecimal price, String condition, String colour, String transmission, String fuel, String description, BigDecimal priceOffer) {
        this.model = model;
        this.make = make;
        this.mileage = mileage;
        this.year = year;
        this.price = price;
        this.condition = condition;
        this.colour = colour;
        this.transmission = transmission;
        this.fuel = fuel;
        this.description = description;
        this.priceOffer = priceOffer;
    }

    public Car() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
                ", model='" + model + '\'' +
                ", make='" + make + '\'' +
                ", mileage=" + mileage +
                ", year=" + year +
                ", price=" + price +
                ", condition='" + condition + '\'' +
                ", colour='" + colour + '\'' +
                ", transmission='" + transmission + '\'' +
                ", fuel='" + fuel + '\'' +
                ", description='" + description + '\'' +
                ", priceOffer=" + priceOffer +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (mileage != car.mileage) return false;
        if (year != car.year) return false;
        if (id != null ? !id.equals(car.id) : car.id != null) return false;
        if (model != null ? !model.equals(car.model) : car.model != null) return false;
        if (make != null ? !make.equals(car.make) : car.make != null) return false;
        if (price != null ? !price.equals(car.price) : car.price != null) return false;
        if (condition != null ? !condition.equals(car.condition) : car.condition != null) return false;
        if (colour != null ? !colour.equals(car.colour) : car.colour != null) return false;
        if (transmission != null ? !transmission.equals(car.transmission) : car.transmission != null) return false;
        if (fuel != null ? !fuel.equals(car.fuel) : car.fuel != null) return false;
        if (description != null ? !description.equals(car.description) : car.description != null) return false;
        return priceOffer != null ? priceOffer.equals(car.priceOffer) : car.priceOffer == null;

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (model != null ? model.hashCode() : 0);
        result = 31 * result + (make != null ? make.hashCode() : 0);
        result = 31 * result + mileage;
        result = 31 * result + year;
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + (condition != null ? condition.hashCode() : 0);
        result = 31 * result + (colour != null ? colour.hashCode() : 0);
        result = 31 * result + (transmission != null ? transmission.hashCode() : 0);
        result = 31 * result + (fuel != null ? fuel.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (priceOffer != null ? priceOffer.hashCode() : 0);
        return result;
    }
}
