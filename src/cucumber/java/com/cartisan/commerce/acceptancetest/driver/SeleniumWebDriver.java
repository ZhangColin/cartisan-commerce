package com.cartisan.commerce.acceptancetest.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumWebDriver implements UiDriver {
    private final WebDriver webDriver = new FirefoxDriver();

    @Override
    public WebElement findElementByTag(String tagName) {
        return webDriver.findElement(By.tagName(tagName));
    }

    @Override
    public WebElement findElementById(String elementId) {
        return webDriver.findElement(By.id(elementId));
    }

    @Override
    public void close() {
        webDriver.close();
    }

    @Override
    public void navigateTo(String url) {
        webDriver.get(url);
    }
}
