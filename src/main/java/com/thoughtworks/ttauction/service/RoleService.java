package com.thoughtworks.ttauction.service;

import com.thoughtworks.ttauction.entity.Role;

public interface RoleService {
    void addRole(Role role);
    Role getRoleByUserName(String username);
    void deleteRoleByUserName(String username);
}
