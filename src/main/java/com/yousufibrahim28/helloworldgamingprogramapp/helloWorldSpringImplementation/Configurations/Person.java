package com.yousufibrahim28.helloworldgamingprogramapp.helloWorldSpringImplementation.Configurations;

// record is a new feature from Java 16, where it reduces verbose of the code
// automatically, constructor, getter and setters will be created.
public record Person(String name, int age, Address address) {
}
