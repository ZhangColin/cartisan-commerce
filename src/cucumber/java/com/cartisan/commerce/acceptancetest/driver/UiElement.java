package com.cartisan.commerce.acceptancetest.driver;

public interface UiElement {
    void sendKeys(String email);

    void click();

    String getText();

    void submit();
}
