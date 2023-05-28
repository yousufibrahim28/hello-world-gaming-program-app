package com.yousufibrahim28.helloworldgamingprogramapp.basicJavaImplementation;

import com.yousufibrahim28.helloworldgamingprogramapp.basicJavaImplementation.Games.*;
import org.springframework.context.annotation.*;

// This is one way to have the configurations in the Launcher itself
// instead of having in a separate file
//@Configuration
//class AppGamingConfigurationsInsideAppGamingSpring {
//
//    @Bean
//    public GamingConsole marioGame() {
//        return new MarioGame();
//    }
//
//    @Bean
//    public GamingConsole superContraGame() {
//        return new SuperContraGame();
//    }
//
//    @Bean
//    @Primary
//    public GamingConsole game() {
//        return new PacManGame();
//    }
//
//    @Bean
//    public GameRunner gameRunner(GamingConsole game) {
//        return new GameRunner(game);
//    }
//}

// we can make the AppGamingSpring launcher as configuration and define beans inside this too.
@Configuration
// we instruct spring to scan in this package to find our bean class to instantiate it.
@ComponentScan("com.yousufibrahim28.helloworldgamingprogramapp.basicJavaImplementation.Games")
public class GamingAppLauncherApplicationUsingSpring {

//    @Bean
//    public GamingConsole marioGame() {
//        return new MarioGame();
//    }
//
//    @Bean
//    public GamingConsole superContraGame() {
//        return new SuperContraGame();
//    }
//
//    @Bean
//    @Primary
//    public GamingConsole game() {
//        return new PacManGame();
//    }
//
//    @Bean
//    public GameRunner gameRunner(GamingConsole game) {
//        return new GameRunner(game);
//    }
    public static void main(String[] args) {

        // Here we can either initialize AppGamingConfigurations or
        // AppGamingConfigurationsInsideAppGamingSpring or AppGamingSpring
        try(AnnotationConfigApplicationContext context =
                    new AnnotationConfigApplicationContext(GamingAppLauncherApplicationUsingSpring.class)) {
            //  We need to specify the game runner Mario and Super contra
            //  context.getBean(GameRunnerMario.class).run();
            // context.getBean(GameRunnerSuperContra.class).run();

            // Default GameRunner runs Pacman
             context.getBean(GameRunner.class).run();
        }
    }
}
