package com.in28minutes.learn_spring_framework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// "record" keyword is creating a class with a goal of reducing boilerplate code.
// It comes with the methods "equals, hashCode, toString, getters, also a constructor"
record Person (String name, int age, Address address) {};
record Address (String firstLine, String city) {};

@Configuration
public class HelloWorldConfiguration {

    // A bean that returns my first name
    @Bean
    public String name() {
        return "John Daniel";
    }

    // A bean that returns my current age
    @Bean
    public int age() {
        return 22;
    }

    // beans that returns an address
    @Bean
    public Address address() {
        return new Address("Baker Street", "London");
    }

    @Bean
    public Address address2() {
        return new Address("Villa Palao", "Philippines");
    }

    @Bean
    public Address address3() {
        return new Address("Cabuyao City", "Laguna");
    }

    // A bean that returns an instance of Person class
    @Bean
    public Person person() {
        return new Person("Stephanie  Joy", 22, new Address("Main Street", "Utrecht"));
    }

    // This bean uses other beans by a method call
    // "this" keyword on the left side is optional, it refers to the proxy instance of this class managed by Spring
    @Bean(name = "person2")
    public Person person2MethodCall() {
        return new Person(this.name(), this.age(), this.address());
    }

    // This bean uses other beans by passing the name of the bean as a parameter (Auto wiring)
    @Bean(name = "person3")
    public Person person3Parameters(String name, int age, Address address3) {
        return new Person(name, age, address3);
    }
}
