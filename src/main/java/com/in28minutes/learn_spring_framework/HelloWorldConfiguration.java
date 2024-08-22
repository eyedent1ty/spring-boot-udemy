package com.in28minutes.learn_spring_framework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person (String name, int age) {};
record Address (String firstLine, String city) {};

@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name() {
        return "John Daniel";
    }

    @Bean
    public int age() {
        return 22;
    }

    @Bean
    public Person person() {
        return new Person("Stephanie  Joy", 22);
    }

    @Bean(name = "address2")
    public Address address() {
        return new Address("Baker Street", "London");
    }

    // When there is a duplicate name of a bean, the first found bean is returned
    @Bean(name = "address2")
    public Address address3() {
        return new Address("Villa Palao", "Philippines");
    }
}
