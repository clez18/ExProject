@keypress @smoke
Feature: Once on the keypress page, whatever key is pressed is displayed on the site.

  Scenario: Press a key and it gets displayed
  Given user is on keypress website
  When a key is pressed
  Then the key is displayed on the site
