@Smoke
Feature: Login function test
 

@tc001_to_tc005
@positive
Scenario: As an Orbis user, can do successfull login with valid credential
    Given Open browser
    And go to Application URL
    When put valid user name
    And put valid password
    And click signin button
    Then login should be successfull and showed sign out button
    And close browser