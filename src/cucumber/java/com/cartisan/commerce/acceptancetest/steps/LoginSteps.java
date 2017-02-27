package com.cartisan.commerce.acceptancetest.steps;

import cucumber.api.java.zh_cn.假如;
import cucumber.api.java.zh_cn.当;
import cucumber.api.java.zh_cn.那么;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginSteps {
    private WebDriver webDriver;

    public LoginSteps() {
        webDriver = new FirefoxDriver();
    }

    @假如("^有一个用户，用户名\"([^\"]*)\"，密码\"([^\"]*)\"$")
    public void 有一个用户_用户名_密码(String name, String password) throws Throwable {

    }

    @当("^使用用户名\"([^\"]*)\"与密码\"([^\"]*)\"进行登录$")
    public void 使用用户名_与密码_进行登录(String name, String password) throws Throwable {
        webDriver.get("http://localhost:8080/signin");
        WebElement username = webDriver.findElement(By.name("username"));
        username.sendKeys(name);
        WebElement pass = webDriver.findElement(By.name("password"));
        pass.sendKeys(password);

        username.submit();
    }

    @那么("^登录成功$")
    public void 登录成功() throws Throwable {
        webDriver.close();
    }
}
