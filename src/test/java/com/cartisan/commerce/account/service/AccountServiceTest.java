package com.cartisan.commerce.account.service;

import com.cartisan.commerce.account.domain.Account;
import com.cartisan.commerce.account.repository.AccountRepository;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class AccountServiceTest {
    @Test
    public void getAccountsTest() {
        // Arrange
        AccountRepository accountRepository = mock(AccountRepository.class);
        AccountService accountService = new AccountService(accountRepository);

        List<Account> expectedAccounts = new ArrayList<>();
        Account account = new Account();
        account.setEmail("stwyhm@126.com");

        expectedAccounts.add(account);
        when(accountRepository.findAll()).thenReturn(expectedAccounts);

        // Act
        List<AccountInfo> accounts = accountService.getAccounts();

        // Assert
        assertThat(accounts.size()).isEqualTo(1);
        assertThat(accounts.get(0).getEmail()).isEqualTo("stwyhm@126.com");
    }
}