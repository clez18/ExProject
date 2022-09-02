@Regression @smoke @login
Feature: Library app login feature
  User Story:
  As a user, I should be able to login with correct credentials. And dashboard should be displayed.

  Account is: tomsmith

  Background: For the scenarios in the feature file, user is expected to be on login page
    Given user is on the login page

  Scenario: Login as tomsmith
    When user enters tomsmith username
    And user enters SuperSecretPassword password
    Then user should see the successful login

#this is how we add comments in feature file