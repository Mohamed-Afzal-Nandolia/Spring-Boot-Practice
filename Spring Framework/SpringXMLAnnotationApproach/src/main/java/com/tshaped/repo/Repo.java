package com.tshaped.repo;

import org.springframework.stereotype.Repository;

/*
 * 4. As this is a Repository Layer, We will add @Repository
 * */
@Repository
public class Repo {
    public Repo() {
        System.out.println("Repo Bean Created");
    }
}
