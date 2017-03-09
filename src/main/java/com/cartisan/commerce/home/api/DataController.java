package com.cartisan.commerce.home.api;

import com.cartisan.commerce.home.domain.Customer;
import com.cartisan.commerce.home.domain.Location;
import com.cartisan.commerce.home.domain.Person;
import com.cartisan.commerce.home.repository.CustomerRepository;
import com.cartisan.commerce.home.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/data")
public class DataController {
    @Autowired
    PersonRepository personRepository;

    @RequestMapping("save")
    public Person save() {
        Person p = new Person("colin", 30);
        Location location1 = new Location("haimen", "2000");
        Location location2 = new Location("shanghai", "2017");
        p.getLocations().add(location1);
        p.getLocations().add(location2);

        return personRepository.save(p);
    }

    @RequestMapping("/q1")
    public Person q1(String name) {
        return personRepository.findByName(name);
    }

    @RequestMapping("q2")
    public List<Person> q2(Integer age) {
        return personRepository.withQueryFindByAge(age);
    }

    @Autowired
    CustomerRepository customerRepository;

    @GetMapping("/set")
    public void set() {
        Customer customer = new Customer("1", "colin", 36);
        customerRepository.save(customer);
        customerRepository.stringRedisTemplateDemo();
    }

    @GetMapping("/getStr")
    public String getStr() {
        return customerRepository.getString();
    }

    @GetMapping("/getCustomer")
    public Customer getCustomer() {
        return customerRepository.getCustomer();
    }
}
