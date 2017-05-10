package com.thoughtworks.ttauction.repository.impl;

import com.thoughtworks.ttauction.entity.Role;
import com.thoughtworks.ttauction.repository.RoleDao;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@SuppressWarnings("ALL")
@Repository
public class RoleDaoImpl implements RoleDao {

    @Autowired
    private SessionFactory sessionFactory;


    @Override
    public void addRole(Role role) {
        Session session = sessionFactory.getCurrentSession();
        session.save(role);
    }

    @Override
    public List<Role> getRoles() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Role").list();
    }

    @SuppressWarnings("unchecked")
    @Override
    public Role getRoleByUserName(String username) {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("from role where account_name = " + username);

        Role role = ((Role) query.list().toArray()[0]);

        return role;
    }

    @Override
    public void deleteRoleByUserName(String username) {
        Session session = sessionFactory.getCurrentSession();

        Query query = session.createQuery("from role where account_name = " + username);

        Role role = ((Role) query.list().toArray()[0]);

        session.delete(role);
    }

}
