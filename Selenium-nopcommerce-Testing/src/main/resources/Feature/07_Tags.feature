@ZLATAN
Feature: Logged user could select different tags
  Background: open browser and login
    And USER login in the system "20199999@fue.edu.eg" and "MohamedElbadri"
  Scenario: User select different tags
    Given navigate to Category page
    When User click on a Tag
    Then successfully page loaded

