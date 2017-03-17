package com.cartisan.commerce.integrationtest.demo.domain;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;
import java.util.Collection;
import java.util.LinkedHashSet;

@Data
@Document
public class Person {
    @Id
    private String id;
    private String name;
    private Integer age;
    private Collection<Location> locations = new LinkedHashSet<>();

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}
