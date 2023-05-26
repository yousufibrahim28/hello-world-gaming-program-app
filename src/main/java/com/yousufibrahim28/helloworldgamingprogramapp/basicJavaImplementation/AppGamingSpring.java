package com.yousufibrahim28.helloworldgamingprogramapp.basicJavaImplementation;

import com.yousufibrahim28.helloworldgamingprogramapp.basicJavaImplementation.AppGamingInterfaces.GamingConsole;
import com.yousufibrahim28.helloworldgamingprogramapp.basicJavaImplementation.Configurations.AppGamingConfigurations;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppGamingSpring {
    public static void main(String[] args) {

        try(AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppGamingConfigurations.class)) {
            context.getBean(GamingConsole.class).up();
            context.getBean(GameRunner.class).run();
        }
    }
}
