package com.thoughtworks.ttauction.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Bid")
public class Bid implements Serializable {

    @Id
    @Column(name = "bid_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer bid_id;

    @Column(name = "bid_username")
    private String bid_username;

    @Column(name = "bid_car_id")
    private Integer bid_car_id;

    @Column(name = "bid_quatity")
    private Integer bid_quatity;

    public Bid() {
    }

    public Bid(String bid_username, Integer bid_car_id, Integer bid_quatity) {
        this.bid_username = bid_username;
        this.bid_car_id = bid_car_id;
        this.bid_quatity = bid_quatity;
    }

    public Integer getBid_id() {
        return bid_id;
    }

    public void setBid_id(Integer bid_id) {
        this.bid_id = bid_id;
    }

    public String getBid_username() {
        return bid_username;
    }

    public void setBid_username(String bid_username) {
        this.bid_username = bid_username;
    }

    public Integer getBid_car_id() {
        return bid_car_id;
    }

    public void setBid_car_id(Integer bid_car_id) {
        this.bid_car_id = bid_car_id;
    }

    public Integer getBid_quatity() {
        return bid_quatity;
    }

    public void setBid_quatity(Integer bid_quatity) {
        this.bid_quatity = bid_quatity;
    }

    @Override
    public String toString() {
        return "Bid{" +
                "bid_id=" + bid_id +
                ", bid_username='" + bid_username + '\'' +
                ", bid_car_id=" + bid_car_id +
                ", bid_quatity=" + bid_quatity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Bid bid = (Bid) o;

        if (bid_id != null ? !bid_id.equals(bid.bid_id) : bid.bid_id != null) return false;
        if (bid_username != null ? !bid_username.equals(bid.bid_username) : bid.bid_username != null) return false;
        if (bid_car_id != null ? !bid_car_id.equals(bid.bid_car_id) : bid.bid_car_id != null) return false;
        return bid_quatity != null ? bid_quatity.equals(bid.bid_quatity) : bid.bid_quatity == null;

    }

    @Override
    public int hashCode() {
        int result = bid_id != null ? bid_id.hashCode() : 0;
        result = 31 * result + (bid_username != null ? bid_username.hashCode() : 0);
        result = 31 * result + (bid_car_id != null ? bid_car_id.hashCode() : 0);
        result = 31 * result + (bid_quatity != null ? bid_quatity.hashCode() : 0);
        return result;
    }
}
