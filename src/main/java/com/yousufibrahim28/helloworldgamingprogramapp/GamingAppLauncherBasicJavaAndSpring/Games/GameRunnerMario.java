package com.yousufibrahim28.helloworldgamingprogramapp.GamingAppLauncherBasicJavaAndSpring.Games;

import com.yousufibrahim28.helloworldgamingprogramapp.GamingAppLauncherBasicJavaAndSpring.AppGamingInterfaces.GamingConsole;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunnerMario extends GameRunner{
    // Here using Qualifier Mario is picked instead of the primary pacman
    public GameRunnerMario(@Qualifier("Mario") GamingConsole game) {
        super(game);
    }
}
