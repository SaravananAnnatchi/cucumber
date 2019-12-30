package com.cucumber.java;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BeanClass {


    public void testBean(){
        System.out.println("test bean reached");
    }
}
