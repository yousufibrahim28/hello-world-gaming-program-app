package com.yousufibrahim28.helloworldgamingprogramapp.GamingAppLauncherBasicJavaAndSpring.Games;

import com.yousufibrahim28.helloworldgamingprogramapp.GamingAppLauncherBasicJavaAndSpring.AppGamingInterfaces.GamingConsole;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

// Making Spring to create the bean by using @Component
@Component
@Primary
public class GameRunner {

    GamingConsole game;
    public GameRunner(GamingConsole game) {
        this.game = game;
    }

    public void run() {
        System.out.println("Running game:" + game);
        game.up();
        game.down();
        game.left();
        game.right();

    }
}
