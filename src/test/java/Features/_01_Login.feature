Feature: Login Functionality

  Scenario: Login with valid username and password

    Given Navigate to Opencart
    When Enter username and password and click login button
    Then User should login succesfully