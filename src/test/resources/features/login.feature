@1
Feature: Library app login feature
  As a user, I should be able to login with correct credentials to different accounts. And dashboard should be displayed.
  Accounts are: librarian, student
  #this is how you comment in feature file
#  Background: User is already in login page
#    Given user is on the login page

  @librarian
  Scenario: Login as librarian
    When user enters librarian username
    And user enter librarian password
    And user clicks the login button
    Then librarian should see dashboard
  @student
  Scenario: Login as student
    When user enters student username
    And user enters student password
    And user clicks the login button
    Then student should see dashboard
