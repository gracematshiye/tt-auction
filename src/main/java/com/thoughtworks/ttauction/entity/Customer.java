package com.thoughtworks.ttauction.entity;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.Pattern;

@Entity
@Table(name = "Customer")
public class Customer {

    @Id
    @Column(name = "cus_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "cus_first_name" , nullable = false)
    @NotEmpty(message = "Please enter your first name")
    private String firstName;

    @Column(name = "cus_last_name", nullable = false)
    @NotEmpty(message = "Please enter your last name")
    private String lastName;

    @Column(name = "cus_username", nullable = false, unique=true)
    @NotEmpty(message = "Please enter your custom username")
    private String username;

    @Column(name = "cus_password", nullable = false)
    @NotEmpty(message = "Please enter your password")
    private String password;

    @Column(name = "cus_password_confirm", nullable = false)
    private String password2;

    @Column(name = "cus_date_of_birth", nullable = false)
    @NotEmpty(message = "Please enter your date of birth in format i.e (DD/MM/YYYY)")
    private String dateOfBirth;

    @Column(name = "cus_email", nullable = false, unique=true)
    @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\." +"[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@" +"(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message = "Please enter a correct email address")
    private String email;

    @Column(name = "cus_contact", nullable = false, unique=true)
    @Pattern(regexp="^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$", message = "Please enter a correct cell phone number")
    private String contact;

    @Column(name = "cus_address", nullable = false)
    @NotEmpty(message = "Please enter your physical address")
    private String address;

    public Customer() {
    }

    public Customer(String firstName, String lastName, String username, String password, String password2, String dateOfBirth, String email, String contact, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.password = password;
        this.password2 = password2;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        this.contact = contact;
        this.address = address;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getPassword2() {
        return password2;
    }

    public void setPassword2(String password2) {
        this.password2 = password2;
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

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", password2='" + password2 + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", email='" + email + '\'' +
                ", contact='" + contact + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Customer customer = (Customer) o;

        if (id != null ? !id.equals(customer.id) : customer.id != null) return false;
        if (firstName != null ? !firstName.equals(customer.firstName) : customer.firstName != null) return false;
        if (lastName != null ? !lastName.equals(customer.lastName) : customer.lastName != null) return false;
        if (username != null ? !username.equals(customer.username) : customer.username != null) return false;
        if (password != null ? !password.equals(customer.password) : customer.password != null) return false;
        if (password2 != null ? !password2.equals(customer.password2) : customer.password2 != null) return false;
        if (dateOfBirth != null ? !dateOfBirth.equals(customer.dateOfBirth) : customer.dateOfBirth != null)
            return false;
        if (email != null ? !email.equals(customer.email) : customer.email != null) return false;
        if (contact != null ? !contact.equals(customer.contact) : customer.contact != null) return false;
        return address != null ? address.equals(customer.address) : customer.address == null;

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (password2 != null ? password2.hashCode() : 0);
        result = 31 * result + (dateOfBirth != null ? dateOfBirth.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (contact != null ? contact.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        return result;
    }
}
