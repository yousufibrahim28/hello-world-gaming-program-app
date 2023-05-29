package com.yousufibrahim28.helloworldgamingprogramapp.DependencyInjectionExamples;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


import java.util.Arrays;

// Example of Dependency Injection

// Create YourBusinessClass
// Create Dependency1
// Create Dependency2
// the above classes would be created here for the sake of simplicity


@Component
class YourBusinessClass {

    // Example of field Dependency Injection
    //@Autowired
    Dependency1 dependency1;
    //@Autowired
    Dependency2 dependency2;

    // Constructor Injection, but adding @Autowired is not required, Since Spring will identify the dependencies
    // and will inject it
    // This is the recommended approach by spring team, since all initialization can be done in one method.
    //@Autowired
    public YourBusinessClass(Dependency1 dependency1, Dependency2 dependency2) {
        System.out.print("Constructor Injection - Your Business class ");
        this.dependency1 = dependency1;
        this.dependency2 = dependency2;
    }

    // Setter injection examples
//    @Autowired
//    public void setDependency1(Dependency1 dependency1) {
//        System.out.print("setter Injection - Dependency 1 ");
//        this.dependency1 = dependency1;
//    }
//
//    @Autowired
//    public void setDependency2(Dependency2 dependency2) {
//        System.out.print("setter Injection - Dependency 2 ");
//        this.dependency2 = dependency2;
//    }

    public String toString() {
        try {
            return new StringBuffer().append("Using ").append(dependency1).append(" and ").append(dependency2).toString();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}

@Component
class Dependency1 {

}

@Component
class Dependency2 {

}
@Configuration
@ComponentScan
public class DependencyInjectionExampleAppLauncherUsingSpring {
    public static void main(String[] args) {
        try(AnnotationConfigApplicationContext context =
                    new AnnotationConfigApplicationContext(DependencyInjectionExampleAppLauncherUsingSpring.class)) {

            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

            System.out.println(context.getBean("yourBusinessClass"));
        }
    }
}
