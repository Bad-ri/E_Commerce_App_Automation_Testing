@ZLATAN
Feature: user shall be able to change his/her password if he/she forgot it
  Scenario: user enter a valid email
    When user navigate to Password recovery page
    And user enter a valid Email "20199999@fue.edu.eg"
    And user click on recover button
    Then a successful message will be displayed to the user