package com.thoughtworks.ttauction.entity;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "Bid")
public class Bid {

    @Id
    @Column(name = "bid_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToOne
    private Car _car;

    @OneToOne
    private Customer _customer;

    private BigDecimal _offer;
    private Boolean _bid_status;

    public Bid(Car _car, Customer _customer, BigDecimal _offer, Boolean _bid_status) {
        this._car = _car;
        this._customer = _customer;
        this._offer = _offer;
        this._bid_status = _bid_status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Car get_car() {
        return _car;
    }

    public void set_car(Car _car) {
        this._car = _car;
    }

    public Customer get_customer() {
        return _customer;
    }

    public void set_customer(Customer _customer) {
        this._customer = _customer;
    }

    public BigDecimal get_offer() {
        return _offer;
    }

    public void set_offer(BigDecimal _offer) {
        this._offer = _offer;
    }

    public Boolean get_bid_status() {
        return _bid_status;
    }

    public void set_bid_status(Boolean _bid_status) {
        this._bid_status = _bid_status;
    }

    @Override
    public String toString() {
        return "Bid{" +
                "id=" + id +
                ", _car=" + _car +
                ", _customer=" + _customer +
                ", _offer=" + _offer +
                ", _bid_status=" + _bid_status +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Bid bid = (Bid) o;

        if (id != null ? !id.equals(bid.id) : bid.id != null) return false;
        if (_car != null ? !_car.equals(bid._car) : bid._car != null) return false;
        if (_customer != null ? !_customer.equals(bid._customer) : bid._customer != null) return false;
        if (_offer != null ? !_offer.equals(bid._offer) : bid._offer != null) return false;
        return _bid_status != null ? _bid_status.equals(bid._bid_status) : bid._bid_status == null;

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (_car != null ? _car.hashCode() : 0);
        result = 31 * result + (_customer != null ? _customer.hashCode() : 0);
        result = 31 * result + (_offer != null ? _offer.hashCode() : 0);
        result = 31 * result + (_bid_status != null ? _bid_status.hashCode() : 0);
        return result;
    }
}
