package com.cartisan.commerce;


import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.web.servlet.ErrorPage;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

@Component
public class CustomServletContainer implements EmbeddedServletContainerCustomizer {
    @Override
    public void customize(ConfigurableEmbeddedServletContainer container) {
//        container.addErrorPages(new ErrorPage(HttpStatus.NOT_FOUND, "/templates/notFoundError.html"));
        container.addErrorPages(new ErrorPage(HttpStatus.NOT_FOUND, "/common/404"));
    }
}