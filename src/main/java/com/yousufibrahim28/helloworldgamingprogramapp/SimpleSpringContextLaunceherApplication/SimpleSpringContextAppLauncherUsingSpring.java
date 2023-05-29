package com.yousufibrahim28.helloworldgamingprogramapp.SimpleSpringContextLaunceherApplication;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Configuration
@Component
public class SimpleSpringContextAppLauncherUsingSpring {

    public static void main(String[] args) {
        try(AnnotationConfigApplicationContext context =
                    new AnnotationConfigApplicationContext(SimpleSpringContextAppLauncherUsingSpring.class)) {

            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        }
    }
}
