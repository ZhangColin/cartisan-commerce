package com.cartisan.commerce.acceptancetest.steps;

import com.cartisan.commerce.account.domain.Account;
import cucumber.api.java.zh_cn.假如;
import cucumber.api.java.zh_cn.当;
import cucumber.api.java.zh_cn.那么;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.springframework.beans.factory.annotation.Autowired;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class AccountSteps {
    private WebDriver webDriver;

    @Autowired
    private AccountRepositoryForTest accountRepositoryForTest;

    public AccountSteps() {
        webDriver = new FirefoxDriver();
    }

    @假如("^系统存在一个账户，Email为\"([^\"]*)\"$")
    public void 系统存在一个账户_Email为(String email) throws Throwable {
        Account account = new Account();
        account.setEmail(email);
        accountRepositoryForTest.save(account);
    }

    @当("^打开账户管理页面$")
    public void 打开账户管理页面() throws Throwable {
        webDriver.get("http://localhost:8080/account/index");
    }

    @那么("^看到一条Email为\"([^\"]*)\"的账户记录$")
    public void 看到一条email为_的账户记录(String email) throws Throwable {
        assertThat(webDriver.findElement(By.tagName("body")).getText()).contains(email);

        accountRepositoryForTest.deleteAll();
        webDriver.close();
    }
}
