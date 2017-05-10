package com.thoughtworks.ttauction.service;

import com.thoughtworks.ttauction.entity.Account;

import java.util.List;

public interface AccountService {

    void addAccount(Account account);
    List<Account> getAccounts();
    Account loadUserByUsername(String username);

    boolean checkUserName(String username);
    boolean checkEmail(String email);
}
