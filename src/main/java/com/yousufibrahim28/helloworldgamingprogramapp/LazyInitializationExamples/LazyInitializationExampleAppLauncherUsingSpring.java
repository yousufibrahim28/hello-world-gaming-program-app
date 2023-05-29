package com.yousufibrahim28.helloworldgamingprogramapp.LazyInitializationExamples;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class ClassA {

}

/*
Default Initialization for spring beans is Eager
Eager initialization is recommended:
- Errors in the configuration are discovered immediately at
application startup, If lazy initialization used the errors will become runtime

However, you can configure beans to be lazily initialized
usign Lazy annotation:
- Not recommended and Not frequently used

Lazy annotation:
 - can be used almost everywhere @component and @Bean are used
 - Lazy-resolution proxy will be injected instead of actual dependency
 - can be used on Configuration (@Configuration) class
 - All @Bean methods within the @Configuration will be lazily initialized
 - Bean initialized when it is first made use of in the application
 - Memory usage might be little less
 - Recomended for bean very rarely used in the app
 */

@Component
@Lazy
class ClassB {

    private ClassA classA;

    public ClassB(ClassA a) {
        System.out.println("Something ins initialized");
        this.classA = a;
    }

}

@Configuration
@ComponentScan
public class LazyInitializationExampleAppLauncherUsingSpring {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(LazyInitializationExampleAppLauncherUsingSpring.class);

        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        System.out.println(context.getBean(ClassB.class));
    }
}
