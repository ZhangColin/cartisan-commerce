package com.cartisan.commerce.acceptancetest.steps;

import com.cartisan.commerce.account.domain.Account;
import org.springframework.data.repository.Repository;

import javax.transaction.Transactional;

@Transactional
public interface AccountRepositoryForTest extends Repository<Account, Long> {
    void save(Account account);

    void deleteAll();
}
