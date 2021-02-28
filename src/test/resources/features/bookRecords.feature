@HKS
Feature: As a librarian, I should be able to see book records on user page

  Background:
    Given User is on the library login page
    When User enters correct librarian "librarianUsername" and "librarianPassword"
    And User clicks the sign-in button


  Scenario: Verify that default record is 10
    Then User should see the dashboard
    And User clicks on the Books module
    Then User should see that the default number is "10"


  Scenario: Show records for count options
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







