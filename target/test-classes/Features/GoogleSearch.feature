Feature: Google search

  Scenario: run a search in google
    Given browser is open
    When user is on google search page
    And user enters a text in the search box
    And hits enter
    Then user is directed to the results page
