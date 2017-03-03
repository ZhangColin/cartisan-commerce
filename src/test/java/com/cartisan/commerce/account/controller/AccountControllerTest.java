package com.cartisan.commerce.account.controller;

import com.cartisan.commerce.account.service.AccountInfo;
import com.cartisan.commerce.account.service.AccountService;
import org.junit.Test;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class AccountControllerTest {

    @Test
    public void should_display_view() {
        // Arrange
        AccountService accountService = mock(AccountService.class);
        AccountController controller = new AccountController(accountService);

        List<AccountInfo> expectedAccounts = new ArrayList<>();
        AccountInfo account = new AccountInfo();
        account.setEmail("stwyhm@126.com");

        expectedAccounts.add(account);

        when(accountService.getAccounts()).thenReturn(expectedAccounts);

        // Act
        ModelAndView  modelAndView = controller.index();

        // Assert
        Map<String, Object> model = modelAndView.getModel();
        assertThat(model.containsKey("accounts")).isTrue();
        List<AccountInfo> actualAccounts = (List<AccountInfo>) model.get("accounts");
        assertThat(actualAccounts.size()).isEqualTo(1);
        assertThat(actualAccounts.get(0).getEmail()).isEqualTo("stwyhm@126.com");
    }


}