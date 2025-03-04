package com.tshaped.SpringBootApp1;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/*
* 4. We can directly use @Slf4j from Lombok Library which I have added in pom.xml file
* */
@Slf4j
@Component
public class Hello {
    private String name;
    private int age;
    Hello(){
        this.name = "Mancuso";
        this.age = 24;
        /*
         * 5. Just add log here, which will be generated by @Slf4j
         *
         * Before adding the logging level to DEBUG, By default we only get ERROR, WARN and INFO
         * After setting the logging level in application.properties, We also get DEBUG + ERROR, WARN and INFO
         * */
        log.error("Hello Bean created: ERROR");// if set to ERROR only {ERROR} logs will print
        log.warn("Hello Bean created: WARN");// if set to WARN only {ERROR, WARN} logs will print
        log.info("Hello Bean created: INFO");// if set to INFO only {ERROR, WARN, INFO} logs will print
        log.debug("Hello Bean created: DEBUG");// if set to INFO only {ERROR, WARN, INFO, DEBUG} logs will print
        log.trace("Hello Bean created: TRACE");// if set to INFO only {ERROR, WARN, INFO, DEBUG, TRACE} logs will print
        getHello();
    }
    public void getHello() {
        try {
            int ans = 2 / 0;
        }catch (Exception e){
            /*
            * Output: Error occurred, name is Mancuso and age is 24:
            * */
            log.error("Error occurred, name is {} and age is {}:", name, age, e);
        }
    }
}
