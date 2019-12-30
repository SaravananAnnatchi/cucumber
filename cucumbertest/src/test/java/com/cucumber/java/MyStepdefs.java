package com.cucumber.java;






import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;

public class MyStepdefs{

    String test;

    @Autowired
    private JustAClass justAClass;

    public MyStepdefs() {
        test = "saravanan";
        System.out.println("this is constructor");
    }

    @Before("@myTag")
    public void before(){
        System.out.println("MyStepdefs=> myTag before "+test);
    }

    @After("@myTag")
    public void after(){
        System.out.println("MyStepdefs=> myTag after " +test);
    }

    @Given("I am on ads endpoints")
    public void i_am_on_ads_endpoints() {
        System.out.println("MyStepdefs=> first step "+test);
        justAClass.justClass();

    }

    @Then("I pass (.*) username to get authorized")
    public void i_pass_username_to_get_authorized(String string) {
        System.out.println("MyStepdefs=> second step "+test);
    }

    @Then("will try to get an ads using endpoints")
    public void will_try_to_get_an_ads_using_endpoints() {
        System.out.println("MyStepdefs=> third step "+test);
    }

    @Given("Just check the background")
    public void justCheckTheBackground() {
        System.out.println("backround reached "+test);
    }
}
