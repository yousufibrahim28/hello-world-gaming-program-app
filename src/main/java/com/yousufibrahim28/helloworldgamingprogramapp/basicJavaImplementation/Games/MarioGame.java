package com.yousufibrahim28.helloworldgamingprogramapp.basicJavaImplementation.Games;

import com.yousufibrahim28.helloworldgamingprogramapp.basicJavaImplementation.AppGamingInterfaces.GamingConsole;

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
