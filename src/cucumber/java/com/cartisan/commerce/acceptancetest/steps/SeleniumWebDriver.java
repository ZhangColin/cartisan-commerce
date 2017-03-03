package com.cartisan.commerce.acceptancetest.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("cucumber-glue")
public class SeleniumWebDriver {
    private final WebDriver webDriver = new FirefoxDriver();

    public WebElement findElementByTag(String tagName) {
        return webDriver.findElement(By.tagName(tagName));
    }

    public WebElement findElementById(String elementId) {
        return webDriver.findElement(By.id(elementId));
    }

    public void close() {
        webDriver.close();
    }

    public void navigateTo(String url) {
        webDriver.get(url);
    }
}
