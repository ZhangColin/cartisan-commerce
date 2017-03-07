package com.cartisan.commerce.acceptancetest.steps;

import com.cartisan.commerce.acceptancetest.data.account.AccountRepositoryForTest;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.springframework.beans.factory.annotation.Autowired;

public class AccountHooks {
    @Autowired
    private AccountRepositoryForTest accountRepositoryForTest;

    @Before("@account")
    @After("@account")
    public void after() {
        accountRepositoryForTest.deleteAll();
    }
}
