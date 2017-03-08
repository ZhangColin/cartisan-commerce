package com.cartisan.commerce.common.interceptor;

import com.cartisan.commerce.common.view.Menu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import static com.cartisan.commerce.common.controller.Urls.ACCOUNTS_INDEX;
import static com.cartisan.commerce.common.controller.Urls.ROOT;

public class NavigationInterceptor implements HandlerInterceptor {
//    @Autowired
//    private Menu menu;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        if (modelAndView == null) {
            return;
        }

        Menu menu = new Menu();
        menu.setActiveClass(request.getServletPath());

        modelAndView.addObject("menu", menu);
//        modelAndView.addObject("rootUrl", ROOT);
//        modelAndView.addObject("isActiveRootUrl", request.getServletPath());
//
//        modelAndView.addObject("accountsUrl", ACCOUNTS_INDEX);
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
