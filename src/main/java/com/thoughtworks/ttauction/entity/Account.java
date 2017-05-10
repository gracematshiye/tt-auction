package com.thoughtworks.ttauction.entity;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Account")
public class Account implements Serializable {

    @Id
    @Column(name = "cus_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer cus_id;

    @Column(name = "cus_first_name" )
    @NotEmpty(message = "Please enter your first name")
    private String firstName;

    @Column(name = "cus_last_name")
    @NotEmpty(message = "Please enter your last name")
    private String lastName;

    @Column(name = "cus_username", unique=true)
    @NotEmpty(message = "Please enter your custom username")
    private String username;

    @Column(name = "cus_password")
    @NotEmpty(message = "Please enter your password")
    private String password;

    @Column(name = "cus_date_of_birth")
    @NotEmpty(message = "Please enter your date of birth")
    private String dateOfBirth;

    @Column(name = "cus_email", unique = true)
    @NotEmpty(message = "Please enter your email address")
    private String email;

    @Column(name = "cus_contact")
    @NotEmpty(message = "Please enter your cell phone number")
    private String contact;

    @Column(name = "cus_address")
    @NotEmpty(message = "Please enter your physical address")
    private String address;

    @Column(name = "cus_enable")
    private boolean enable;


    public Account() {
    }

    public Account(String firstName, String lastName, String username, String password, String dateOfBirth, String email, String contact, String address, boolean enable) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.password = password;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        this.contact = contact;
        this.address = address;
        this.enable = enable;
    }

    public Integer getCus_id() {
        return cus_id;
    }

    public void setCus_id(Integer cus_id) {
        this.cus_id = cus_id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isEnable() {
        return enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }

    @Override
    public String toString() {
        return "Account{" +
                "cus_id=" + cus_id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", email='" + email + '\'' +
                ", contact='" + contact + '\'' +
                ", address='" + address + '\'' +
                ", enable=" + enable +
                '}';
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Account account = (Account) o;

        if (enable != account.enable) return false;
        if (cus_id != null ? !cus_id.equals(account.cus_id) : account.cus_id != null) return false;
        if (firstName != null ? !firstName.equals(account.firstName) : account.firstName != null) return false;
        if (lastName != null ? !lastName.equals(account.lastName) : account.lastName != null) return false;
        if (username != null ? !username.equals(account.username) : account.username != null) return false;
        if (password != null ? !password.equals(account.password) : account.password != null) return false;
        if (dateOfBirth != null ? !dateOfBirth.equals(account.dateOfBirth) : account.dateOfBirth != null) return false;
        if (email != null ? !email.equals(account.email) : account.email != null) return false;
        if (contact != null ? !contact.equals(account.contact) : account.contact != null) return false;
        return address != null ? address.equals(account.address) : account.address == null;

    }

    @Override
    public int hashCode() {
        int result = cus_id != null ? cus_id.hashCode() : 0;
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (dateOfBirth != null ? dateOfBirth.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (contact != null ? contact.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (enable ? 1 : 0);
        return result;
    }
}
