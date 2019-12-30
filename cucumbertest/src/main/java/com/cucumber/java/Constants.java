package com.cucumber.java;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class Constants {

    @Autowired
    BeanClass beanClass;

    public void test(){
        beanClass.testBean();
        System.out.println("spring method");
    }

}
