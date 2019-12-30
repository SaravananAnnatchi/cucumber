package com.cucumber.java;
/*
import cucumber.api.event.EventHandler;
import cucumber.api.event.EventPublisher;
import cucumber.api.event.TestRunFinished;
import cucumber.api.event.TestRunStarted;
import cucumber.api.formatter.Formatter;
import org.springframework.beans.factory.annotation.Autowired;

public class Initialization implements Formatter {

    @Autowired
    Constants constants;

    private EventHandler<TestRunStarted> setup = event -> {
        // setup static method(-s) here
        //constants.test();
        System.out.println("setup method");
    };

    private EventHandler<TestRunFinished> teardown = event -> {
        // tear down static method(-s) here
        System.out.println("tearDown method");
    };

    @Override
    public void setEventPublisher(EventPublisher publisher) {
        publisher.registerHandlerFor(TestRunStarted.class, setup);
        publisher.registerHandlerFor(TestRunFinished.class, teardown);
    }
}
*/