package com.cartisan.commerce.account.service;

import com.cartisan.commerce.account.domain.Account;
import com.cartisan.commerce.account.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AccountService {
    private final AccountRepository repository;

    @Autowired
    public AccountService(AccountRepository repository) {
        this.repository = repository;
    }

    public List<AccountInfo> getAccounts() {
        List<AccountInfo> accounts = new ArrayList<>();
        repository.findAll().forEach(account->{
            AccountInfo accountInfo = new AccountInfo();
            accountInfo.setEmail(account.getEmail());
            accounts.add(accountInfo);
        });

        return accounts;
    }

    public void save(AccountInfo accountInfo) {
        Account account = new Account();
        account.setEmail(accountInfo.getEmail());
        account.setUserName("colin");
        account.setPassword("colinPassword");
        account.setNickName("文野");

        repository.save(account);
    }
}
