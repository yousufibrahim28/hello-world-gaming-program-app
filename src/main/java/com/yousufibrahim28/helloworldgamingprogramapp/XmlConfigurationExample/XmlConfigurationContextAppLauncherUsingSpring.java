package com.yousufibrahim28.helloworldgamingprogramapp.XmlConfigurationExample;

import com.yousufibrahim28.helloworldgamingprogramapp.GamingAppLauncherBasicJavaAndSpring.Games.GameRunner;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

// Nowadays XML Configuration is rarely used, but we should know this because lot of old projects use xml configs
// Annotations are preferred and easy to use, easy to maintain, recent projects use annotations frequently,
// debugging is a bit difficult you should have good grasp of Spring
// xml configs are cumbersome, has complicated syntax, but using xml configs, POJOs can be clean of annotation,
// nowadays rarely used, we can use either annotation or xml configs, no mixing, should consistent,
// debugging is of medium difficulty
public class XmlConfigurationContextAppLauncherUsingSpring {

    // the bean is fetched from contextConfiguration.xml in the resources folder.
    public static void main(String[] args) {
        try(ClassPathXmlApplicationContext context =
                    new ClassPathXmlApplicationContext("contextConfiguration.xml")) {

            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
            System.out.println(context.getBean("name"));
            context.getBean(GameRunner.class).run();
        }
    }
}
