@logout
Feature: Logout
  Lib-1000 As a student user, I should be able to logout
  Lib-1003 As a librarian user, I should be able to logout

  #Acceptance criteria Lib=1000
  #Student will login with valid username and password

  Scenario Outline: User will login as student
    Given User is on the library login page
    When User enters correct student "<Username>" and "<Password>"
    And User clicks the sign-in button
    And User sees the library homepage
    When User click navigation bar dropdown
    And Click Log Out
    Then User is back on login page

    Examples:
      | Username         | Password         |
      | student1Username | student1Password |
      | student2Username | student2Password |
      | student3Username | student3Password |


  #Student negative test

  Scenario Outline: User will login as librarian
    Given User is on the library login page
    When User enters correct librarian "<Username>" and "<Password>"
    And User clicks the sign-in button
    And User sees the library homepage
    When User click navigation bar dropdown
    And Click Log Out
    Then User is back on login page
    Examples:
      | Username          | Password          |
      | librarianUsername | librarianPassword |





