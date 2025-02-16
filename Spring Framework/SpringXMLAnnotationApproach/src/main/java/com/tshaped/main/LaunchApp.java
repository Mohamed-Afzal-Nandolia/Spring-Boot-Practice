package com.tshaped.main;

import com.tshaped.services.Password;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LaunchApp {
    public static void main(String[] args) {

        ApplicationContext container = new ClassPathXmlApplicationContext("applicationconfig.xml");
        /*
        * 9. Here we are trying to get the bean of Password class which will not work because
        * we have not told the bean to create the bean of that class
        *
        * Output: No qualifying bean of type 'com.tshaped.services.Password' available
        *
        * (Go to Config class ->)
        * */
        Password pass = container.getBean(Password.class);
        pass.aboutAlgo();
    }
}
