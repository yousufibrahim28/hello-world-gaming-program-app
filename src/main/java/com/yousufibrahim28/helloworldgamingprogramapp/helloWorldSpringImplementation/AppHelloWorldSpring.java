package com.yousufibrahim28.helloworldgamingprogramapp.helloWorldSpringImplementation;

import com.yousufibrahim28.helloworldgamingprogramapp.helloWorldSpringImplementation.Configurations.Address;
import com.yousufibrahim28.helloworldgamingprogramapp.helloWorldSpringImplementation.Configurations.HelloWorldConfiguration;
import com.yousufibrahim28.helloworldgamingprogramapp.helloWorldSpringImplementation.Configurations.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class AppHelloWorldSpring {

    public static void main(String[] args) {

        // 1.Launch a Spring Context
        // 2. Configure the things that we want Spring to manage
        // 3. Let's use @Configuration
        // 4. Create a bean called helloWorld in the config
        // 5. we can re-use existing beans, Method call, by Parameters

        // Always remember to close the context, either use a try catch finally or Try with resource as below
        try(AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)) {
            // Retrieving Bean from Spring
            String bean = (String) context.getBean("helloWorld");
            int integerBean = (int) context.getBean("integerBean");
            Person person = (Person) context.getBean("customObjectBean");
            Address address = (Address) context.getBean("customObjectAddressBean");
            Address address2 = (Address) context.getBean(Address.class);
            // Use type to get the bean
            // Person person2 = (Person) context.getBean(Person.class);
            Person person2MethodCall = (Person) context.getBean("person2MethodCall");
            Person person3Parameter = (Person) context.getBean("person3Parameters");

            System.out.println(bean);
            System.out.println(integerBean);
            System.out.println(person);
            System.out.println(address);
            System.out.println(address2);
            System.out.println(person2MethodCall);
            System.out.println(person3Parameter);

            // This way we can get all the beans managed by Spring
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        }
    }
}
