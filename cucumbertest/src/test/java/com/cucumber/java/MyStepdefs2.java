package com.cucumber.java;







import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


public class MyStepdefs2{

    @Autowired
    private Constants constants;

    @Given("I am on step defination page")
    public void iAmOnStepDefinationPage() {
        System.out.println("MyStepDef2 given");
        constants.test();
    }

    @Then("I would like to see spring initiated")
    public void iWouldLikeToSeeSpringInitiated() {
        System.out.println("MyStepDef2 then");
    }

    @And("check spring initiated")
    public void checkSpringInitiated() {
        System.out.println("MyStepDef2 and");
    }
}
