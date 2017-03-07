package com.cartisan.commerce.acceptancetest.driver;

import org.openqa.selenium.WebElement;

public class SeleniumWebElement implements UiElement {
    private final WebElement element;

    public SeleniumWebElement(WebElement element) {
        this.element = element;
    }

    @Override
    public void sendKeys(String keys) {
        element.sendKeys(keys);
    }

    @Override
    public void click() {
        element.click();
    }

    @Override
    public String getText() {
        return element.getText();
    }

    @Override
    public void submit() {
        element.submit();
    }
}
