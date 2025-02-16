package com.tshaped.web;

import org.springframework.stereotype.Controller;

/*
* 2. As this is a Web layer so we will add @Controller or @RestController
* */
@Controller
public class Web {
    public Web() {
        System.out.println("Web Bean Created");
    }
}
