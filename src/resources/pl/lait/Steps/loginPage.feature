@tag
Feature: Flight reservation
  I want to use this template for my feature file

  @tag1
  Scenario: login to the app
    Given I open main page
    When I fill the login form with login "adamz" and pass "qwe123"
    Then I should see the flight reservation form
    

 