package com.thoughtworks.ttauction.entity;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

import javax.persistence.*;

@Entity
@Table(name = "User")
public class User {

    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;

    @Column(name = "user_name")
    private String username;

    @Column(name = "user_password")
    private String password;

    @Column(name = "user_first_ame")
    private String firstName;

    @Column(name = "user_last_name")
    private String lastName;

    @Column(name = "user_date_of_birth")
    private String dateOfBirth;

    @Column(name = "user_email_address")
    private String emailAddress;

    @Column(name = "user_cell_phone_number")
    private String cellPhoneNumber;

    @Column(name = "user_home_address")
    private String homeAddress;

    public User() {
    }

    public User(String username, String password, String firstName, String lastName, String dateOfBirth, String emailAddress, String cellPhoneNumber, String homeAddress) {
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.emailAddress = emailAddress;
        this.cellPhoneNumber = cellPhoneNumber;
        this.homeAddress = homeAddress;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public String getCellPhoneNumber() {
        return cellPhoneNumber;
    }

    public void setCellPhoneNumber(String cellPhoneNumber) {
        this.cellPhoneNumber = cellPhoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        return new EqualsBuilder()
                .append(userId, user.userId)
                .append(username, user.username)
                .append(password, user.password)
                .append(firstName, user.firstName)
                .append(lastName, user.lastName)
                .append(dateOfBirth, user.dateOfBirth)
                .append(emailAddress, user.emailAddress)
                .append(cellPhoneNumber, user.cellPhoneNumber)
                .append(homeAddress, user.homeAddress)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(userId)
                .append(username)
                .append(password)
                .append(firstName)
                .append(lastName)
                .append(dateOfBirth)
                .append(emailAddress)
                .append(cellPhoneNumber)
                .append(homeAddress)
                .toHashCode();
    }
}
