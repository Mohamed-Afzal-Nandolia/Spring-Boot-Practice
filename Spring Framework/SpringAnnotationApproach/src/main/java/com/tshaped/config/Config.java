package com.tshaped.config;

import com.tshaped.services.Password;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
/*
* 1. As we have removed the XML file from this project as we are only going to use Annotations,
* We can add the @ComponentScan Annotation here to do the same thing that we had defined in XML approach
*
* (Go to LauncApp class)
* */
@Configuration
@ComponentScan(basePackages = {"com.tshaped"})
public class Config {
    public Config() {
        System.out.println("Config Bean Created");
    }

    @Bean
    public Password createPass(){
        return new Password("SHA");
    }
}
