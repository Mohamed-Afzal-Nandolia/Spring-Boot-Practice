package com.tshaped.services;

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
