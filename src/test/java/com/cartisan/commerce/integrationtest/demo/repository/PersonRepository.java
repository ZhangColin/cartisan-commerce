package com.cartisan.commerce.integrationtest.demo.repository;

import com.cartisan.commerce.integrationtest.demo.domain.Person;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface PersonRepository extends MongoRepository<Person, String> {
    Person findByName(String name);

    @Query("{'age': ?0}")
    List<Person> withQueryFindByAge(Integer age);
}
