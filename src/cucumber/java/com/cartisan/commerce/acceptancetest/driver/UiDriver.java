package com.cartisan.commerce.acceptancetest.driver;

public interface UiDriver {
    UiElement findElementByTag(String tagName);

    UiElement findElementById(String elementId);

    UiElement findElementByName(String name);

    void close();

    void navigateTo(String url);
}
