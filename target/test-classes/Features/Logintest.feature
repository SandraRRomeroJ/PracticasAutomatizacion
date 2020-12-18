Feature: test login

  #Scenario Outline: Succesful login
    Given browser is open
    And user is in log in page
    When user enters valid <username> and <password>
    And user clicks on login button
    Then user is directed to the home page
    Then user clicks on cliente button
    And user clicks on linea de negocio dropdown
    Then user enters <lineanegocio>

    Examples: 
      | username | password | lineanegocio   |
      | N3273075 | 1xsPJzRT | individual privado |
