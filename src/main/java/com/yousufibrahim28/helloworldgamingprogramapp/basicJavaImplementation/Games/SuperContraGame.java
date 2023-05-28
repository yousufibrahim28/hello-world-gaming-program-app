package com.yousufibrahim28.helloworldgamingprogramapp.basicJavaImplementation.Games;

import com.yousufibrahim28.helloworldgamingprogramapp.basicJavaImplementation.AppGamingInterfaces.GamingConsole;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
// It is not necessary to add qualifier we can use the calss name in camel case as qualifier as well auperContraGame
public class SuperContraGame implements GamingConsole {
    public void up() {
        System.out.println("up");
    }

    public void down() {
        System.out.println("sit down");
    }

    public void left() {
        System.out.println("Go back");
    }

    public void right() {
        System.out.println("Shoot a bullet");
    }
}
