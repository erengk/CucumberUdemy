Feature: Search Item with Data Table

  Background:
    Given Navigate to Opencart
    When Enter username and password and click login button
    Then User should login succesfully

  Scenario: Add new item with parameter
    When Enter item name as DataTable
      | ipod      |
      | samsung   |
      | macbook   |

#    And Add to Cart and Check
#    Then Should be added new item in Shop Cart