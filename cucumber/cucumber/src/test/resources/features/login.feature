Feature: Login Functionality

  Scenario: Valid login
    Given user is on the login page
    When user enters valid username and password
    Then user should be redirected to dashboard
