@myTag
Feature: Just a test cucumber feature

  Background: just check it
    Given Just check the background

  @Test1 @smoke @sanity
  Scenario: verify the ads
    Given I am on ads endpoints
    Then I pass ukautomationpub username to get authorized
    Then will try to get an ads using endpoints

  @Test2  @sanity
  Scenario: verify the ads2
    Given I am on ads endpoints
    Then I pass ukautomationpub username to get authorized
    Then will try to get an ads using endpoints