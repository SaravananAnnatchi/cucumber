package com.cucumber.java;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class JustAClass {

    @Autowired
    Constants constants;

    public void justClass(){
        constants.test();
        System.out.println("Reached JustAClass method");
    }
}
