Feature: Login Test Scenic

  Scenario Outline: Login succesfully with valid credentials
    Given Opens browser
    And User is in the login page
    When user enters valid user <username> and <password>
    And clics on login button
    Then user is directed to the home page

    Examples: 
      | username | password |
      | N3414900 | OWe7GtVy |
