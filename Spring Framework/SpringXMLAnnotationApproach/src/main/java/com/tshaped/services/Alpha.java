package com.tshaped.services;

import org.springframework.stereotype.Component;

/*
 * 6. As this is a Component Layer, We will add @Component
 * */
@Component
public class Alpha {
    public Alpha() {
        System.out.println("Alpha Bean Created");
    }
}
