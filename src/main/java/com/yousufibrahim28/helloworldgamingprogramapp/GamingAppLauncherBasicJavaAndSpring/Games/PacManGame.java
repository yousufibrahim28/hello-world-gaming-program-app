package com.yousufibrahim28.helloworldgamingprogramapp.GamingAppLauncherBasicJavaAndSpring.Games;

import com.yousufibrahim28.helloworldgamingprogramapp.GamingAppLauncherBasicJavaAndSpring.AppGamingInterfaces.GamingConsole;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

// @Component is a way to make spring create the bean for us
// If this is marked as component spring will create a bean
// when asked for this. but we need to tell spring where this
// is located, for that we need to use @ComponentScan annotation
// and provide the location of the bean, this is to be done in
// the class where @Configuration is used, i.e the config class
@Component
@Primary
public class PacManGame implements GamingConsole {
    public void up() {
        System.out.println("Go up");
    }

    public void down() {
        System.out.println("Go down");
    }

    public void left() {
        System.out.println("Go left");
    }

    public void right() {
        System.out.println("Go right");
    }
}
