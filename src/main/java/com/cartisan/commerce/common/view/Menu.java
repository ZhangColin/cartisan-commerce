package com.cartisan.commerce.common.view;

import lombok.Getter;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

import static com.cartisan.commerce.common.controller.Urls.ACCOUNTS_INDEX;
import static com.cartisan.commerce.common.controller.Urls.ROOT;

@Component
@Scope(value="request", proxyMode = ScopedProxyMode.TARGET_CLASS)
@Getter
public class Menu {
    private List<MenuItem> items;

    public Menu() {
        items = new ArrayList<>();

        items.add(new MenuItem(ROOT, "控制台", "", "", null));

        List<MenuItem> subItems = new ArrayList<>();
        subItems.add(new MenuItem(ACCOUNTS_INDEX, "用户管理", "", "", null));

        items.add(new MenuItem("#", "用户", "", "", subItems));
    }

    public void setActiveClass(String servletPath) {
        for (MenuItem item : items) {
            if (item.getUrl().equals(servletPath)) {
                item.setActiveClass("active");
                break;
            }
        }
    }
}
