package com.tshaped.SpringBootApp1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class GreetingService {
    /*
    * 1.
    * To create the logger you can use the inbuilt library i.e. SLF4J (Simple Logging Facade for Java)
    * You can create any instance of logger in any classes
    *
    * SLF4J (Simple Logging Facade for Java) is just an interface (a common way to write logs)
    * It does not do the actual logging, it just provides a standard way to use different logging frameworks like "Logback"
    * Works with Logback, Log4j, Java Util Logging, etc.
    *
    * So basically SLF4J internally uses Logback
    * */
    private final static Logger logger = LoggerFactory.getLogger(GreetingService.class);
    private String name;
    GreetingService(){
        this.name = "Rudy";
        /*
        * 2. This is how you use logger anywhere
        * You can set the level of the logger like info, warn, error, debug, trace, etc
        * */
        logger.info("GreetingService Bean created");
        getGreeting();
        //System.out.println("GreetingService Bean created");
    }
    public void getGreeting() {
        try {
            int ans = 2 / 0;
        }catch (Exception e){
            /*
            * 3. {} are called placeholder, you can use variables in the string itself by using placeholders without "+"
            *
            * Output: Error occurred, name is Rudy :
            *
            * e will still print the exceptions
            *
            * (Go to Hello Class->)
            * */
            logger.error("Error occurred, name is {} :", name, e);
        }
    }
}
