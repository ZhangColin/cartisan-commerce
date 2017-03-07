package com.cartisan.commerce.account.controller;

import com.cartisan.commerce.account.service.AccountInfo;
import com.cartisan.commerce.account.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import static com.cartisan.commerce.common.controller.Urls.*;

@Controller
@RequestMapping(ACCOUNTS)
public class AccountController {

    private final AccountService accountService;

    @Autowired
    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @GetMapping(INDEX)
    public ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName(ACCOUNTS_INDEX);
        modelAndView.addObject("accounts",accountService.getAccounts());

        return modelAndView;
    }

    @PostMapping(SAVE)
    public ModelAndView save(@ModelAttribute AccountInfo accountInfo) {
        accountService.save(accountInfo);

        return index();
    }
}
