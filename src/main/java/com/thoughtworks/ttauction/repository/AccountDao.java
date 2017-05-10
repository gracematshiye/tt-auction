package com.thoughtworks.ttauction.repository;

import com.thoughtworks.ttauction.entity.Account;

import java.util.List;

public interface AccountDao {

    void addAccount(Account account);
    List<Account> getAccounts();
    Account findById(int id);
    Account loadUserByUsername(String username);
}
