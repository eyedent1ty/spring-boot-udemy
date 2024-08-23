package com.in28minutes.learn_spring_framework.helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

// "record" keyword is creating a class with a goal of reducing boilerplate code.
// It comes with the methods "equals, hashCode, toString, getters, also a constructor"
record Person (String name, int age, Address address) {};
record Address (String firstLine, String city) {};

@Configuration
public class HelloWorldConfiguration {

    // A method that returns a string Bean
    @Bean
    public String name() {
        return "John Daniel";
    }

    // A method that retruns an integer Bean
    @Bean
    public int age() {
        return 22;
    }

    // A method that returns an instance of a person
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

    // As you an see there is not qualifying candidate for address, but this is resolved
    // Due to the @Primary annotation that is provided on the address2 Bean
    @Bean
    public Person person4(String name, int age, Address address) {
        return new Person(name, age ,address);
    }

    // @Qualifier annotation's argument can accept the custom name of the bean or the provided name of the @Qualifier annotation if it is annoted
    @Bean
    public Person person5(String name, int age, @Qualifier("address3Qualifier") Address address) {
        return new Person(name, age, address);
    }

    // By setting a custom name to a method which returns a bean, the name of the method will be the custom name instead
    @Bean(name = "address2")
    @Primary
    public Address address() {
        return new Address("Villa Palao", "Philippines");
    }

    // Qualifier can help in autowiring when you have multiple same type of beans and also to use a specific bean and not the bean annotated with a @Primary
    @Bean(name = "address3")
    @Qualifier("address3Qualifier")
    public Address address3() {
        return new Address("Cabuyao City", "Laguna");
    }
}
