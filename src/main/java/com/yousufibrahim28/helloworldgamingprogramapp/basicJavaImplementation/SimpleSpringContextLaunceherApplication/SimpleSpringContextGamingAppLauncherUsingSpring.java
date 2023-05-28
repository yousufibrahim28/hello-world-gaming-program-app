package com.yousufibrahim28.helloworldgamingprogramapp.basicJavaImplementation.SimpleSpringContextLaunceherApplication;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Configuration
@Component
public class SimpleSpringContextGamingAppLauncherUsingSpring {

    public static void main(String[] args) {
        try(AnnotationConfigApplicationContext context =
                    new AnnotationConfigApplicationContext(SimpleSpringContextGamingAppLauncherUsingSpring.class)) {

            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        }
    }
}
