package com.cartisan.commerce.demo.rabbitmq.object;

import lombok.Data;

import java.io.Serializable;

@Data
public class RabbitUser implements Serializable {
    private static final long serialVersionUID = -3062175093170297637L;
    private String name;
    private String pass;

    @Override
    public String toString() {
        return "User{name='"+name+"', pass='"+pass+"'}";
    }
}
