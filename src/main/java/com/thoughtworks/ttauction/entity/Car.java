package com.thoughtworks.ttauction.entity;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Table(name = "Car")
public class Car implements Serializable {

    @Id
    @Column(name = "car_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "car_model_name")
    private String model;

    @Column(name = "car_make_name")
    @NotNull
    private String make;

    @Column(name = "car_mileage")
    private Integer mileage;

    @Column(name = "car_year")
    private Integer year;

    @Column(name = "car_price")
    @NotNull
    private BigDecimal price;

    @Column(name = "car_condition")
    private String condition;

    @Column(name = "car_colour")
    private String colour;

    @Column(name = "car_transmission")
    @NotNull
    private String transmission;

    @Column(name = "car_fuel_type")
    private String fuel;

    @Column(name = "car_description")
    private String description;

    @Column(name = "car_quantity")
    private Integer quantity;

    @Column(name = "car_image_url")
    private String imageUrl;

    public Car() {
    }

    public Car(String model, String make, Integer mileage, Integer year, BigDecimal price, String condition, String colour, String transmission, String fuel, String description, Integer quantity, String imageUrl) {
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
        this.quantity = quantity;
        this.imageUrl = imageUrl;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public Integer getMileage() {
        return mileage;
    }

    public void setMileage(Integer mileage) {
        this.mileage = mileage;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
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

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
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
                ", quantity=" + quantity +
                ", imageUrl='" + imageUrl + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (id != null ? !id.equals(car.id) : car.id != null) return false;
        if (model != null ? !model.equals(car.model) : car.model != null) return false;
        if (make != null ? !make.equals(car.make) : car.make != null) return false;
        if (mileage != null ? !mileage.equals(car.mileage) : car.mileage != null) return false;
        if (year != null ? !year.equals(car.year) : car.year != null) return false;
        if (price != null ? !price.equals(car.price) : car.price != null) return false;
        if (condition != null ? !condition.equals(car.condition) : car.condition != null) return false;
        if (colour != null ? !colour.equals(car.colour) : car.colour != null) return false;
        if (transmission != null ? !transmission.equals(car.transmission) : car.transmission != null) return false;
        if (fuel != null ? !fuel.equals(car.fuel) : car.fuel != null) return false;
        if (description != null ? !description.equals(car.description) : car.description != null) return false;
        if (quantity != null ? !quantity.equals(car.quantity) : car.quantity != null) return false;
        return imageUrl != null ? imageUrl.equals(car.imageUrl) : car.imageUrl == null;

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (model != null ? model.hashCode() : 0);
        result = 31 * result + (make != null ? make.hashCode() : 0);
        result = 31 * result + (mileage != null ? mileage.hashCode() : 0);
        result = 31 * result + (year != null ? year.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + (condition != null ? condition.hashCode() : 0);
        result = 31 * result + (colour != null ? colour.hashCode() : 0);
        result = 31 * result + (transmission != null ? transmission.hashCode() : 0);
        result = 31 * result + (fuel != null ? fuel.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (quantity != null ? quantity.hashCode() : 0);
        result = 31 * result + (imageUrl != null ? imageUrl.hashCode() : 0);
        return result;
    }
}
