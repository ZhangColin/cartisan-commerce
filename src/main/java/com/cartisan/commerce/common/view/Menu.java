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

        items.add(new MenuItem(ROOT, "控制台", "fa-th-large", false, null));

        List<MenuItem> subItems = new ArrayList<>();
        subItems.add(new MenuItem(ACCOUNTS_INDEX, "用户管理", "", false, null));
        subItems.add(new MenuItem("#", "角色管理", "", false, null));

        items.add(new MenuItem("#", "用户", "fa-users", false, subItems));
    }

    public void setActive(String servletPath) {
        processActive(servletPath, items);
    }

    private boolean processActive(String servletPath, List<MenuItem> menuItems) {
        for (MenuItem item : menuItems) {
            if (item.getUrl().equals(servletPath)) {
                item.setActive(true);
                return true;
            }
            else if (item.getSubMenuItems()!=null){
                if (processActive(servletPath, item.getSubMenuItems())){
                    item.setActive(true);
                    return true;
                }
            }
        }
        return false;
    }


}
