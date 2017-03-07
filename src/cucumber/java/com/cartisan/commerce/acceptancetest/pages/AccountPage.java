package com.cartisan.commerce.acceptancetest.pages;

import com.cartisan.commerce.acceptancetest.data.account.EditableAccount;
import com.cartisan.commerce.acceptancetest.driver.UiDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("cucumber-glue")
public class AccountPage {
    @Autowired
    private UiDriver uiDriver;

    public void show() {
        uiDriver.navigateTo("/account/index");
    }

    public void add(EditableAccount account) {
        uiDriver.navigateTo("/account/index");
        uiDriver.findElementById("btnAdd").click();

        uiDriver.findElementById("email").sendKeys(account.getEmail());
        uiDriver.findElementById("btnSave").click();
    }
}
