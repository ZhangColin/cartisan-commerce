package com.cartisan.commerce.acceptancetest.pages;

import com.cartisan.commerce.acceptancetest.driver.UiDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("cucumber-glue")
public class CommonPage {
    @Autowired
    private UiDriver driver;

    public String getAllText() {
        return driver.findElementByTag("body").getText();
    }
}
