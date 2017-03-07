package com.cartisan.commerce.account.view;

import com.cartisan.commerce.account.service.AccountInfo;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

import static com.cartisan.commerce.common.controller.Urls.ACCOUNTS_INDEX;

public class PresentableAccount extends ModelAndView {
    public PresentableAccount(List<AccountInfo> accounts) {
        this.setViewName(ACCOUNTS_INDEX);
        this.addObject("accounts",accounts);
    }
}
