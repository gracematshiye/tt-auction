package com.thoughtworks.ttauction.entity;


import javax.persistence.*;

@Entity
@Table(name = "Bid")
public class Bid {

    @Id
    @Column(name = "bid_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer bidId;

    @OneToOne
    private Car car;

    @OneToOne
    private User user;

    public Bid(Car car, User user) {
        super();
        this.car = car;
        this.user = user;
    }

    public Integer getBidId() {
        return bidId;
    }

    public void setBidId(Integer bidId) {
        this.bidId = bidId;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Bid{" +
                "bidId=" + bidId +
                ", car=" + car +
                ", user=" + user +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Bid bid = (Bid) o;

        if (bidId != null ? !bidId.equals(bid.bidId) : bid.bidId != null) return false;
        if (car != null ? !car.equals(bid.car) : bid.car != null) return false;
        return user != null ? user.equals(bid.user) : bid.user == null;

    }

    @Override
    public int hashCode() {
        int result = bidId != null ? bidId.hashCode() : 0;
        result = 31 * result + (car != null ? car.hashCode() : 0);
        result = 31 * result + (user != null ? user.hashCode() : 0);
        return result;
    }
}
