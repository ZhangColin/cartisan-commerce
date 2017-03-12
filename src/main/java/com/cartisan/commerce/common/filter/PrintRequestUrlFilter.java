package com.cartisan.commerce.common.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public class PrintRequestUrlFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("request url: "+ ((HttpServletRequest)request).getRequestURI());
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {

    }
}
