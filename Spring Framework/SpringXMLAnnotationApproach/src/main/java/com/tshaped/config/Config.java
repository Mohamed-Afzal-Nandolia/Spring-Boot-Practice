package com.tshaped.config;

import com.tshaped.services.Password;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*
 * 5. As this is a Configuration Layer, We will add @Configuration
 * */

@Configuration
public class Config {
    public Config() {
        System.out.println("Config Bean Created");
    }

    /*
     * 8. Here a new method name createPass is created which returns a new Password object
     * Basically we are hard coding the object, meaning object is created by the developer
     * and not by the Spring IOC Container
     *
     * (Go to LaunchApp class->)
     * */

    /*
    * 10. Here we will add the annotation @Bean why? Because
    * When you create the Object manually and you want Spring to manage it
    * Basically Developer will create the object but he wants Spring to take care of it,
    * Then use @Bean
    *
    * (Got to Service class ->)
    * */
    @Bean
    public Password createPass(){
        return new Password("SHA");
    }
}
