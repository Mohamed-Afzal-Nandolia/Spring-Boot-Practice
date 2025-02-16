package com.tshaped.SpringBootApp1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalTime;

@Service
public class Greeting {

    @Autowired
    private LocalTime time;

    public Greeting() {
        System.out.println("Greeting Bean Created --> Constructor");
    }

    public String generateWish(){

        int hour = time.getHour();
        if (hour < 12)
            return "Good Morning";
        else if(hour < 16)
            return "Good Afternoon";
        else if(hour < 20)
            return "Good Evening";
        else
            return "Good Night";
    }

}
