package com.thoughtworks.ttauction.repository;

import com.thoughtworks.ttauction.entity.Role;

import java.util.List;

public interface RoleDao {
    void addRole(Role role);
    List<Role> getRoles();
    Role getRoleByUserName(String username);
    void deleteRoleByUserName(String username);
}
