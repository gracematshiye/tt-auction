package com.thoughtworks.ttauction.service.RoleServiceImpl.java;

import com.thoughtworks.ttauction.entity.Role;
import com.thoughtworks.ttauction.repository.RoleDao;
import com.thoughtworks.ttauction.repository.impl.RoleDaoImpl;
import com.thoughtworks.ttauction.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleDao roleDao = new RoleDaoImpl();

    @Override
    @Transactional
    public void addRole(Role role) {
        roleDao.addRole(role);
    }

    @Override
    @Transactional
    public Role getRoleByUserName(String username) {
        return roleDao.getRoleByUserName(username);
    }

    @Override
    @Transactional
    public void deleteRoleByUserName(String username) {
        roleDao.deleteRoleByUserName(username);
    }
}
