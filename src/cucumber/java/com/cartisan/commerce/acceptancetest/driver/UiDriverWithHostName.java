package com.cartisan.commerce.acceptancetest.steps;

import org.openqa.selenium.WebElement;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("cucumber-glue")
public class UiDriverWithHostName implements UiDriver {
    public static final String DELIMITER = ":";

    @Value("${server.port}")
    private String port = "8080";

    private final String hostName = "http://localhost";
    private final UiDriver originalDriver = new SeleniumWebDriver();

    @Override
    public WebElement findElementByTag(String tagName) {
        return originalDriver.findElementByTag(tagName);
    }

    @Override
    public WebElement findElementById(String elementId) {
        return originalDriver.findElementById(elementId);
    }

    @Override
    public void close() {
        originalDriver.close();
    }

    @Override
    public void navigateTo(String url) {
        originalDriver.navigateTo(hostName + DELIMITER + port + url);
    }
}
