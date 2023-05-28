package com.yousufibrahim28.helloworldgamingprogramapp.basicJavaImplementation;

import com.yousufibrahim28.helloworldgamingprogramapp.basicJavaImplementation.Games.GameRunner;
import com.yousufibrahim28.helloworldgamingprogramapp.basicJavaImplementation.Games.PacManGame;

public class GamingAppLauncherApplicationUsingBasicJava {

    public static void main(String[] args) {

        //MarioGame game = new MarioGame();

        //SuperContraGame game =  new SuperContraGame();

        PacManGame game = new PacManGame();

        GameRunner gameRunner = new GameRunner(game);

        gameRunner.run();

    }


}
