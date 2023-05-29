package com.yousufibrahim28.helloworldgamingprogramapp.BeanScopeExamples;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/*
* By Default Beans in spring are singleton
* If using Prototype, Bean will create new objects each time we request
*
* Singleton scope - One object instance per Spring IOC container
* Prototype scope - Possibly many object instances per Spring IoC container
*
* Scopes applicable Only for web-aware Spring ApplicationContext
*   Request - one object instance per single HTTP request
*   session - one object instance per user HTTP session
*   Application  - One object instance per web application runtime
*   Websocket - One Object instance per WebSocket instance
*
* Java Singleton vs Spring Singleton
*   Spring Singleton : One Object instance per Spring IoC container
*   Java Singleton : One Object instance per JVM
*   Spring singleton is equal to Java singleton if only in Spring container is used per JVM (Mostly the case)
*
*
* Difference between
*
* Prototype - Many instances per Spring IOC Container, New bean instance created every time the bean is referred to,
*             Not Default, @Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE), Rarely used, Recommended to be used,
*             in the scenario where you need stateful beans
*
* and
*
* Singleton - One Instance per Spring IOC Container, Same bean instance reused, Default,
*             @Scope(value=ConfigurableBeanFactory.SCOPE_SINGLETON), Very frequently used, Recommended to be used,
*             in the scenario where you need stateless beans
*
*
*
* */

@Component
class NormalClass {

}

@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
class PrototypeClass {

}
@Configuration
@ComponentScan
public class BeanScopesExampleLauncherApplicationUsingSpring {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(BeanScopesExampleLauncherApplicationUsingSpring.class);

        //Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        System.out.println(context.getBean(NormalClass.class)); // same hashcode
        System.out.println(context.getBean(NormalClass.class)); // same hashcode

        System.out.println(context.getBean(PrototypeClass.class)); // different hashcode
        System.out.println(context.getBean(PrototypeClass.class)); // different hashcode
        System.out.println(context.getBean(PrototypeClass.class)); // different hashcode
    }
}
