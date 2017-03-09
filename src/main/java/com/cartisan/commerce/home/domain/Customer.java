package com.cartisan.commerce.home.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class Customer implements Serializable {
    private static final long serialVersionUID = -4134291231455717988L;

    private String id;
    private String name;
    private Integer age;

    public Customer() {
    }

    public Customer(String id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}
