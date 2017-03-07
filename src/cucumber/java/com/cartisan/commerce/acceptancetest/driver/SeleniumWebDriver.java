package com.cartisan.commerce.acceptancetest.driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class SeleniumWebDriver implements UiDriver {
    private static final int DEFAULT_TIME_OUT_IN_SECONDS = 10;
    private final WebDriver webDriver = new FirefoxDriver();

    public SeleniumWebDriver() {
        webDriver.manage().timeouts().implicitlyWait(DEFAULT_TIME_OUT_IN_SECONDS, TimeUnit.SECONDS);
    }

    @Override
    public UiElement findElementByTag(String tagName) {
        return new SeleniumWebElement(webDriver.findElement(By.tagName(tagName)));
    }

    @Override
    public UiElement findElementById(String elementId) {
        return new SeleniumWebElement(webDriver.findElement(By.id(elementId)));
    }

    @Override
    public UiElement findElementByName(String elementName) {
        return new SeleniumWebElement(webDriver.findElement(By.name(elementName)));
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
