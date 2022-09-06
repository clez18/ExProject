Feature: Selecting specific dropdowns
  Agile story: As a user when I am selecting specific dropdowns in the
  Dropdown List website by Cydeo it should show that selected dropdown

  @dropdowns
  Scenario: User should see specific dropdown upon selection
    Given user is on Dropdowns List page
    When user clicks option one from simple dropdown
    And user clicks 2000, October, and 31 from select your date of birth
    And user clicks Texas from state selection
    And user clicks Java from which programming languages do you know?
    Then user should assert selected dropdowns to verify
