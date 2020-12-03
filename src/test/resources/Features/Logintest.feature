Feature: test login

  Scenario Outline: Succesful login
    Given browser is open
    And user is in log in page
    When user enters valid <username> and <password>
    And user clicks on login button
    Then user is directed to the home page

    Examples:
    | username | password |
    | N3218862 | N3Gr1T0N0V |
    
    