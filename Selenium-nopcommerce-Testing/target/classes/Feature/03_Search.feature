@ZLATAN
Feature: Logged in user shall search for any product
  Background: open browser and login
    And User login in the system "20199999@fue.edu.eg" and "MohamedElbadri"
  Scenario: User search with valid data
    Given navigate to Home page
    When User enter a valid data for search "Apple MacBook"
    And User click on search button
    Then successfully navigate to the product page