Feature: Succesful Login

  Scenario: Login with valid credentials
    Given Opens browser
    And User is in the login page
    When user enters valid user name and password
    And clics on login button
    Then user is directed to the home page
