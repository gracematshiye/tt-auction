package com.thoughtworks.ttauction.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Role")
public class Role implements Serializable {

    @Id
    @Column(name = "role_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer role_id;

    @Column(name = "role_name")
    private String role_name;

    @Column(name = "account_name")
    private String account_name;

    public Role() {
    }

    public Role(String role_name, String account_name) {
        this.role_name = role_name;
        this.account_name = account_name;
    }


    public Integer getRole_id() {
        return role_id;
    }

    public void setRole_id(Integer role_id) {
        this.role_id = role_id;
    }

    public String getRole_name() {
        return role_name;
    }

    public void setRole_name(String role_name) {
        this.role_name = role_name;
    }

    public String getAccount_name() {
        return account_name;
    }

    public void setAccount_name(String account_name) {
        this.account_name = account_name;
    }

    @Override
    public String toString() {
        return "Role{" +
                "role_id=" + role_id +
                ", role_name='" + role_name + '\'' +
                ", account_name='" + account_name + '\'' +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Role role = (Role) o;

        if (role_id != null ? !role_id.equals(role.role_id) : role.role_id != null) return false;
        if (role_name != null ? !role_name.equals(role.role_name) : role.role_name != null) return false;
        return account_name != null ? account_name.equals(role.account_name) : role.account_name == null;

    }

    @Override
    public int hashCode() {
        int result = role_id != null ? role_id.hashCode() : 0;
        result = 31 * result + (role_name != null ? role_name.hashCode() : 0);
        result = 31 * result + (account_name != null ? account_name.hashCode() : 0);
        return result;
    }
}
