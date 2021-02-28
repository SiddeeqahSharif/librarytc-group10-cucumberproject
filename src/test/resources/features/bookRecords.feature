@HKS
Feature: As a librarian, I should be able to see book records on user page


  Scenario: Verify that default record is 10
    Given User is on the homepage
    Then User should see the dashboard
    And User clicks on the Books module
    Then User should see that the default number is "10"


  Scenario: Show records for count options
    Given User is on the homepage
    Then User should see the dashboard
    And User clicks on the Books module
    Then User should click on the Show records tab
    Then User should see the following numbers in the dropdown list
      | 5   |
      | 10  |
      | 15  |
      | 50  |
      | 100 |
      | 200 |
      | 500 |







