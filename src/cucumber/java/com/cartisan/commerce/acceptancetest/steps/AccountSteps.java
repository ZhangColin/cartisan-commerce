package com.cartisan.commerce.acceptancetest.steps;

import com.cartisan.commerce.acceptancetest.data.account.AccountRepositoryForTest;
import com.cartisan.commerce.acceptancetest.data.account.EditableAccount;
import com.cartisan.commerce.acceptancetest.pages.AccountPage;
import com.cartisan.commerce.acceptancetest.pages.CommonPage;
import com.cartisan.commerce.account.domain.Account;
import cucumber.api.java.zh_cn.假如;
import cucumber.api.java.zh_cn.当;
import cucumber.api.java.zh_cn.那么;
import org.springframework.beans.factory.annotation.Autowired;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class AccountSteps {
    @Autowired
    private AccountRepositoryForTest accountRepositoryForTest;

    @Autowired
    private AccountPage accountPage;

    @Autowired
    private CommonPage commonPage;

    @假如("^系统存在一个账户，Email为\"([^\"]*)\"$")
    public void 系统存在一个账户_Email为(String email) throws Throwable {
        Account account = new Account();
        account.setEmail(email);
        account.setUserName("colin");
        account.setPassword("colinPassword");
        account.setNickName("文野");
        accountRepositoryForTest.save(account);
    }

    @当("^查看账户列表$")
    public void 查看账户时() throws Throwable {
        accountPage.show();
    }

    @那么("^看到一条Email为\"([^\"]*)\"的账户记录$")
    public void 看到一条email为_的账户记录(String email) throws Throwable {
        assertThat(commonPage.getAllText()).contains(email);
    }

    @假如("^系统一个账户都不存在$")
    public void 系统一个账户都不存在() throws Throwable {
    }

    @那么("^提示\"([^\"]*)\"$")
    public void 页面提示(String msg) throws Throwable {
        assertThat(commonPage.getAllText()).contains(msg);
    }

    @当("^添加一个账户，Email为\"([^\"]*)\"$")
    public void 添加一个账户_Email为(String email) throws Throwable {
        EditableAccount account = editableAccount(email);
        accountPage.add(account);
    }

    @那么("^成功创建账户，Email为\"([^\"]*)\"$")
    public void 成功创建账户_Email为(String email) throws Throwable {
        assertThat(commonPage.getAllText()).contains(email);
    }

    private EditableAccount editableAccount(String email) {
        EditableAccount account = new EditableAccount();
        account.setEmail(email);
        return account;
    }

}
