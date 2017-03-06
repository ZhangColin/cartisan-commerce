package com.cartisan.commerce.acceptancetest.steps;

import org.openqa.selenium.WebElement;

public interface UiDriver {
    WebElement findElementByTag(String tagName);

    WebElement findElementById(String elementId);

    void close();

    void navigateTo(String url);
}
