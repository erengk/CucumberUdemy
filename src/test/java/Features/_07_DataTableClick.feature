Feature: DataTable Functionality

  Background:
    Given Navigate to Opencart
    When Enter username and password and click login button
    Then User should login succesfully

    Scenario: Should be click with Data Table
      When Enter item name "ipod"
      And Click to elements with Data Table
      |searchButton|
      |ipod4|
      |addCart|
      |viewCart|
      Then Should be added new item in Shop Cart
