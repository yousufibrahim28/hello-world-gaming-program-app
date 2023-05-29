package com.yousufibrahim28.helloworldgamingprogramapp.GamingAppLauncherBasicJavaAndSpring.Games;

import com.yousufibrahim28.helloworldgamingprogramapp.GamingAppLauncherBasicJavaAndSpring.AppGamingInterfaces.GamingConsole;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("Mario")
public class MarioGame implements GamingConsole {

    public void up() {
        System.out.println("Jump");
    }

    public void down() {
        System.out.println("Go into hole");
    }

    public void left() {
        System.out.println("Go back ");
    }

    public void right() {
        System.out.println("Accelerate");
    }
}
