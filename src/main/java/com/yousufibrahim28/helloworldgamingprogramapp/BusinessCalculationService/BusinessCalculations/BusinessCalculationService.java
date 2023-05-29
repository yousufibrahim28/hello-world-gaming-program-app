package com.yousufibrahim28.helloworldgamingprogramapp.BusinessCalculationService.BusinessCalculations;

import com.yousufibrahim28.helloworldgamingprogramapp.BusinessCalculationService.Interface.DataService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Arrays;


/*

@Component specialisation - which are variants of @Component

- @Service - Indicates that an annotated class has business logic
- @Controller -  Indicates that an annotated class is a “Controller” eg. web controller
        - Used to define controllers in your web applications and REST API
        - @Repository - Indicates that an annotated class is used to retrieve and/or manipulate data in a data base

        Use the most specific annotation, by doing so we are giving more information to the framework about your intentions

        We can use Aspect Oriented Programming AOP, to introduce new behaviours based on the annotation, eg. for @Repository, Spring automatically wires in JDBC Exception translation features
*/
//@Component
@Service
public class BusinessCalculationService {

    private DataService dataService;

    public BusinessCalculationService(DataService dataService){
        this.dataService = dataService;
    }

    public int findMax() {
        return Arrays.stream(dataService.retrieveData()).max().orElse(0);
    }
}
