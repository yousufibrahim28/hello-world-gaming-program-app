package com.yousufibrahim28.helloworldgamingprogramapp.BusinessCalculationService.BusinessCalculations;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.yousufibrahim28.helloworldgamingprogramapp.BusinessCalculationService")
public class BusinessCalculationServiceExecutor {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(BusinessCalculationServiceExecutor.class);

        System.out.println(context.getBean(BusinessCalculationService.class).findMax());

    }








}
