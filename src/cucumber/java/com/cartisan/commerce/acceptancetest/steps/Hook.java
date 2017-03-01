package com.cartisan.commerce.acceptancetest.steps;

import com.cartisan.commerce.Application;
import cucumber.api.java.After;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
@ContextConfiguration(classes = Application.class)
public class Hook {
    @Autowired
    ApplicationConfigurations applicationConfigurations;

    @After("@restoreApplicationConfiguration")
    public void restoreApplicationConfiguration() {
        applicationConfigurations.restore();
    }
}
