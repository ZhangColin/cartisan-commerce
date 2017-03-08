package com.cartisan.commerce.account.view;

import com.cartisan.commerce.account.service.AccountInfo;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

import static com.cartisan.commerce.common.controller.Urls.ACCOUNTS_INDEX;

@Component
@Scope(value="request", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class PresentableAccounts extends ModelAndView {
    public PresentableAccounts(List<AccountInfo> accounts) {
        this.setViewName(ACCOUNTS_INDEX);
        this.addObject("accounts",accounts);
    }
}
