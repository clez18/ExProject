This feature will allow user to login

  Scenario: Login with correct user and pass
    Given I navigate to login page
    When I enter the user as admin and pass as admin
    And I click login button
    Then I should see personal page