package com.yousufibrahim28.helloworldgamingprogramapp.PrePostAnnotationExamples;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class SomeClass {
    private SomeDependency someDependency;

    public SomeClass(SomeDependency someDependency) {
        super();
        this.someDependency = someDependency;
        System.out.println("All Dependencies are ready");
    }

    // Immediately called after all the dependencies are wired
    @PostConstruct
    public void initialize() {
        someDependency.getReady();
    }

    // Called before the spring bean is destroyed
    @PreDestroy
    public void cleanup() {
        System.out.println("Cleanup");
    }
}

@Component
class SomeDependency {

    public void getReady(){
        System.out.println("Some logic using some dependency");

    }

}

@Configuration
@Component
@ComponentScan
public class PrePostAnnotationExampleAppLauncherUsingSpring {

    public static void main(String[] args) {
        try(AnnotationConfigApplicationContext context =
                    new AnnotationConfigApplicationContext(PrePostAnnotationExampleAppLauncherUsingSpring.class)) {

            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        }
    }
}
