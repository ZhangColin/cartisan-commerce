package com.cartisan.commerce.acceptancetest.steps;

import com.cartisan.commerce.Application;
import com.cartisan.commerce.acceptancetest.driver.UiDriver;
import com.cartisan.commerce.acceptancetest.steps.ApplicationConfigurations;
import cucumber.api.CucumberOptions;
import cucumber.api.java.After;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
@ContextConfiguration(classes = Application.class)
public class Launcher {
    @Autowired
    private ApplicationConfigurations applicationConfigurations;

    @Autowired
    private UiDriver uiDriver;

    @After("@restoreApplicationConfiguration")
    public void restoreApplicationConfiguration() {
        applicationConfigurations.restore();
    }

    @After
    public void closeWebBrowser() {
        uiDriver.close();
    }
}
