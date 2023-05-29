package com.yousufibrahim28.helloworldgamingprogramapp.CDIContextExamples;

import jakarta.inject.Inject;
import jakarta.inject.Named;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/*
* Context and Dependency injection using Jakarta CDI
* Usage of @Named instead of @Component
* Usage of @Inject instead of @Autowired
*
* We can use any of that.
* */

//@Component
@Named
class BusinessService {

    private DataService dataService;

//        public BusinessService(DataService dataService) {
//            this.dataService = dataService;
//        }

    public DataService getDataService() {
        return dataService;
    }

    //@Autowired
    @Inject
    public void setDataService(DataService dataService) {
        System.out.println("Dependency Injection is done using Setter Injection");
        this.dataService = dataService;
    }
}

//@Component
@Named
class DataService {

}


@Configuration
@Component
@ComponentScan
public class CDIContextExampleAppLauncherUsingSpring {
    public static void main(String[] args) {
        try(AnnotationConfigApplicationContext context =
                    new AnnotationConfigApplicationContext(CDIContextExampleAppLauncherUsingSpring.class)) {

            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
            System.out.println(context.getBean(BusinessService.class).getDataService());
        }
    }
}
