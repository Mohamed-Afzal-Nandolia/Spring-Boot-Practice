package com.tshaped.services;
/*
 * 7.
 * In this class we are not defining any Annotation
 * This is not part of Spring lifecycle as we have not define it to Spring
 *
 * (Go to Config class ->)
 * */
public class Password {
    String algo;
    public Password(String algo) {
        this.algo = algo;
        System.out.println("Password Bean Created");
    }

    public String aboutAlgo(){
        return "Algo used is " + algo;
    }
}
