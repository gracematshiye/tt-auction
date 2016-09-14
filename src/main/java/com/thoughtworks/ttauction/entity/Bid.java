package com.thoughtworks.ttauction.entity;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "Bid")
public class Bid {

    @Id
    @Column(name = "bid_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "car_id")
    private Integer carId;

    @Column(name = "user_id")
    private String uname;

    @Column(name = "cus_bid_offer")
    private BigDecimal offer;

    @Column(name = "bid_status")
    private boolean status;

    public Bid() {
    }

    public Bid(Integer carId, String uname, BigDecimal offer, boolean status) {
        this.carId = carId;
        this.uname = uname;
        this.offer = offer;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCarId() {
        return carId;
    }

    public void setCarId(Integer carId) {
        this.carId = carId;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public BigDecimal getOffer() {
        return offer;
    }

    public void setOffer(BigDecimal offer) {
        this.offer = offer;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Bid{" +
                "id=" + id +
                ", carId=" + carId +
                ", uname='" + uname + '\'' +
                ", offer=" + offer +
                ", status=" + status +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Bid bid = (Bid) o;

        if (status != bid.status) return false;
        if (id != null ? !id.equals(bid.id) : bid.id != null) return false;
        if (carId != null ? !carId.equals(bid.carId) : bid.carId != null) return false;
        if (uname != null ? !uname.equals(bid.uname) : bid.uname != null) return false;
        return offer != null ? offer.equals(bid.offer) : bid.offer == null;

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (carId != null ? carId.hashCode() : 0);
        result = 31 * result + (uname != null ? uname.hashCode() : 0);
        result = 31 * result + (offer != null ? offer.hashCode() : 0);
        result = 31 * result + (status ? 1 : 0);
        return result;
    }
}
