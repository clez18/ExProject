@smoke @checkbox
 Feature: Checkbox site from practice project. When page is openned checkbox 2 is automatically clicked

   Scenario: Checkbox site. Have 'Checkbox 1' clicked.
     Given user is on checkbox page
     When user clicks check box 1
     And user unclicks check box 2
     Then user will have only check box 1 clicked