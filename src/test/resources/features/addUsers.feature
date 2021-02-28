@Users
Feature: As a librarian, I should be able to add users from users page.

  Background:

    Given User is on the library login page
    When User enters correct librarian "librarianUsername" and "librarianPassword"
    And User clicks the sign-in button

Scenario: Librarian adds users

  Given User clicks the add user button
  When User enters correct Full Name
  And User enters correct New User Password and Email
  And User enters correct New User Address
  And User clicks the SaveChangesButton
  Then User should see the new user on the UserPage


 Scenario: Librarian edits users
   When user clicks the Users button
   And user clicks the EditUserButton
   And User edits name
   And User clicks SaveChangesButton
   Then User should see the success message on UserPage



