package com.yousufibrahim28.helloworldgamingprogramapp.helloWorldSpringImplementation.Configurations;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class HelloWorldConfiguration {

    // String Bean
    @Bean
    public String helloWorld() {
        return "Hello world from Spring";
    }

    // Integer Bean
    @Bean
    public int integerBean() {
        return 28;
    }

    // String Bean
    @Bean
    public String name() {
        return "Yousuf";
    }

    // Integer Bean
    @Bean
    public int age() {
        return 28;
    }

    // Custom Object Bean
    @Bean
    public Person customObjectBean() {
        return new Person("Yousuf", 28, new Address("Main Street", "London"));
    }

    // Custom Object Bean
    @Bean
    public Person person2MethodCall() {
        return new Person(name(), age(), customObjectAddressBean());
    }

    // Custom Object Bean
    @Bean
    public Person person3Parameters(String name, int age, Address customObjectAddressBean) {
        return new Person(name, age, customObjectAddressBean);
    }

    // Custom Object Bean
    @Bean
    public Person person4Parameters(String name, int age, @Qualifier("Main") Address customObjectAddressBean) {
        return new Person(name, age, customObjectAddressBean);
    }

    // Custom Object Bean
    @Bean
    @Qualifier("Main") // Used to uniquely identify the bean if there are multiple candidate/matching beans
    public Address customObjectAddressBean() {
        return new Address("No.12 10 downing street", "London, United Kingdom");
    }

    // Custom Object Bean
    @Bean(name = "address2")
    @Primary // This is used to resolve conflicts if there are multiple candidate/matching bean
    public Address customObjectAddress2Bean() {
        return new Address("Primary Baker street", "London, United Kingdom");
    }

}
