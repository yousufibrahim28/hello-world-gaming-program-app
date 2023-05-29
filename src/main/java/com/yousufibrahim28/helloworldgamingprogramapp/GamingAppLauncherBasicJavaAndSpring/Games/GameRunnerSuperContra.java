package com.yousufibrahim28.helloworldgamingprogramapp.GamingAppLauncherBasicJavaAndSpring.Games;

import com.yousufibrahim28.helloworldgamingprogramapp.GamingAppLauncherBasicJavaAndSpring.AppGamingInterfaces.GamingConsole;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunnerSuperContra extends GameRunner{
    // Here using Qualifier superContraGame, which is the class name since that class has no qualifier,
    // is picked instead of the primary pacman
    public GameRunnerSuperContra(@Qualifier("superContraGame") GamingConsole game) {
        super(game);
    }
}
