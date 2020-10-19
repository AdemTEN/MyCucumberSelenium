Feature: As a user  I should be able to login

  Scenario: Login as a driver

    Given User should be on the login page
    When  User enters driver user name and password
    Then  User click on login button
    Then  User should be able to enter home page

  Scenario: Login as a sales manager
    Given User should be on the login page
    When User enters sales manager user name and password
    Then User click on login button
    Then User should be able to enter home page

  Scenario: Login as a store manager
    Given User should be on the login page
    When User enters store manager user name and password
    Then User click on login button
    Then User should be able to enter home page