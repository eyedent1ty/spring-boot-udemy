package com.in28minutes.learn_spring_framework.helloworld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
// import java.util.Arrays;

public class App02HelloWorldSpringJava {
    public static void main(String[] args) {

        // 1. Launch a Spring Context -

        try (var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)) {

            // 2. Configure the things that we want Spring to manage - @Configuration
            // HelloWorldConfiguration - @Configuration
            // name - @Bean

            // 3. Retrieving Beans managed by Spring
            // System.out.println(context.getBean("name"));
            // System.out.println(context.getBean("age"));
            // System.out.println(context.getBean("person"));
            // System.out.println(context.getBean("person2"));
            // System.out.println(context.getBean("person3"));
            // System.out.println(context.getBean("address2"));

            System.out.println(context.getBean("person5"));

            // Throws an error, saying a bean with a class of Address is 3
            // Retrieve a Bean by type
            // System.out.println(context.getBean(Address.class));

            // Listing all the bean definition names
            // Arrays.stream(context.getBeanDefinitionNames())
            // .forEach(System.out::println);
        }
    }
}
