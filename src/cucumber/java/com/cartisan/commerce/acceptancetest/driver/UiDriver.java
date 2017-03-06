package com.cartisan.commerce.acceptancetest.driver;

public interface UiDriver {
    UiElement findElementByTag(String tagName);

    UiElement findElementById(String elementId);

    void close();

    void navigateTo(String url);
}
