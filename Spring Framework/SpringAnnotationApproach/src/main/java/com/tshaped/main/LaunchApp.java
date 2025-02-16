package com.tshaped.main;

import com.tshaped.config.Config;
import com.tshaped.services.Password;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LaunchApp {
    public static void main(String[] args) {
        /*
        * 2. Here we will AnnotationConfigApplicationContext class for Annotation approach,
        * and the class that will be passed here will be Config class
        *
        * And thats it.
        * */
        ApplicationContext container = new AnnotationConfigApplicationContext(Config.class);

        Password pass = container.getBean(Password.class);
        pass.aboutAlgo();
    }
}
