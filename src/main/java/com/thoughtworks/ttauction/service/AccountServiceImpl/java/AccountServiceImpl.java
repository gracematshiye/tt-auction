package com.thoughtworks.ttauction.service.AccountServiceImpl.java;

import com.thoughtworks.ttauction.entity.Account;
import com.thoughtworks.ttauction.entity.Role;
import com.thoughtworks.ttauction.repository.AccountDao;
import com.thoughtworks.ttauction.repository.RoleDao;
import com.thoughtworks.ttauction.repository.impl.AccountDaoImpl;
import com.thoughtworks.ttauction.repository.impl.RoleDaoImpl;
import com.thoughtworks.ttauction.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {

    private static final String USER = "ROLE_USER";
    //private static final String ADMIN = "ROLE_ADMIN";

    public UserDetails loadByUsername(String username) throws UsernameNotFoundException {

        Account account = accountDao.loadUserByUsername(username);

        if (account == null) {
            throw new UsernameNotFoundException("Invalid username or password");
        }

        return new org.springframework.security.core.userdetails.User(username, account.getPassword(), account.isEnable(),
                true, true, false, getAuthorities(account));

    }

    private List<GrantedAuthority> getAuthorities(Account account) {
        List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();

        Role role = roleDao.getRoleByUserName(account.getUsername());
        authorities.add(new SimpleGrantedAuthority(role.getRole_name()));

        return authorities;
    }

    @Autowired
    private AccountDao accountDao = new AccountDaoImpl();

    @Autowired
    private RoleDao roleDao = new RoleDaoImpl();

    @Override
    @Transactional
    public void addAccount(Account account) {
        create(account, USER);
    }

    public void create(Account account, String roleName) {
        try {

            accountDao.addAccount(account);

            roleDao.addRole(roleFor(roleName, account.getUsername()));

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private Role roleFor(String role, String account_name) {

        return new Role(role, account_name);
    }

    @Override
    @Transactional
    public List<Account> getAccounts() {
        return this.accountDao.getAccounts();
    }

    @Override
    @Transactional
    public Account loadUserByUsername(String username) {
        Account account = new Account();

        for (Account account1 : getAccounts()) {
            if (account1.getUsername().equals(username)) {
                account = account1;
            }
        }
        return account;
    }

    @Override
    @Transactional
    public boolean checkUserName(String username) {

        boolean exist = false;

        for (int i = 0; i < getAccounts().size(); i++) {
            if (username.equals(getAccounts().get(i).getUsername())) {

                exist = true;

            } else {
                exist = false;
            }
        }
        return exist;
    }

    @Override
    @Transactional
    public boolean checkEmail(String email) {
        boolean exist = false;

        for (int i = 0; i < getAccounts().size(); i++) {
            if (email.equals(getAccounts().get(i).getEmail())) {

                exist = true;

            } else {
                exist = false;
            }
        }
        return exist;
    }

}
