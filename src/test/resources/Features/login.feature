Feature: test login functionality

  Scenario: Login succesfully with valid credentials
    Given is on login page
    When user enters user name and password
    And clics on login button
    Then user is directed to home page

  Scenario Outline: Login succesfully with valid credentials
    Given is on login page
    When user enters <username> and <password>
    And clics on login button
    Then user is directed to home page

    Examples: 
      | username | password |
      | user1    | pas123   |
      | user2    | pas234   |
