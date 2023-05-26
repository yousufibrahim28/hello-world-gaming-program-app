package com.yousufibrahim28.helloworldgamingprogramapp.basicJavaImplementation.Configurations;


import com.yousufibrahim28.helloworldgamingprogramapp.basicJavaImplementation.AppGamingInterfaces.GamingConsole;
import com.yousufibrahim28.helloworldgamingprogramapp.basicJavaImplementation.GameRunner;
import com.yousufibrahim28.helloworldgamingprogramapp.basicJavaImplementation.Games.MarioGame;
import com.yousufibrahim28.helloworldgamingprogramapp.basicJavaImplementation.Games.PacManGame;
import com.yousufibrahim28.helloworldgamingprogramapp.basicJavaImplementation.Games.SuperContraGame;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AppGamingConfigurations {

    @Bean
    public GamingConsole marioGame () {
        return new MarioGame();
    }

    @Bean
    public GamingConsole superContraGame() {
        return new SuperContraGame();
    }
    @Bean
    @Primary
    public GamingConsole game () {
        return new PacManGame();
    }

    @Bean
    public GameRunner gameRunner (GamingConsole game) {
        return new GameRunner(game);
    }
}
