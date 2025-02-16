package com.tshaped.SpringBootApp1.service;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Service;
/*
* 2. Added Static Block, Non Static Block and method generateWish() and init()
* */
@Service
public class Greeting {

    static {
        System.out.println("Static Block");
    }

    {
        System.out.println("Non Static Block");
    }

    public Greeting() {
        System.out.println("Greeting Bean Created --> Constructor");
    }
    /*
    * After Constructor Before any Business logic method with @PostConstruct will be executed
    * */
    @PostConstruct
    public void init(){
        System.out.println("Post Construct init() method");
    }

    public String generateWish(){
        return "Good Night";
    }
    /*
     * At the end by default @PreDestroy method will be executed
     * */
    @PreDestroy
    public void destroy(){
        System.out.println("PreDestroy destroy() method");
    }

    /* Output:
    * Static Block
    * Non Static Block
    * Greeting Bean Created --> Constructor
    * Post Construct init() method
    * Good Night
    * PreDestroy destroy() method
    * */
}
