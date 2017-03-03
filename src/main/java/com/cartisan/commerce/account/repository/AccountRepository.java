package com.cartisan.commerce.account.repository;

import com.cartisan.commerce.account.domain.Account;
import org.springframework.data.repository.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public interface AccountRepository extends Repository<Account, Long> {
    List<Account> findAll();
}
