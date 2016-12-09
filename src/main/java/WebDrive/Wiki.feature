Feature: Wikipedia Page Count Words

  Scenario Outline: Wikipedia Search Page

    Given user open Wikipedia Search Page

    When user enters <word>

    Then the page title should start with <word>

    And user close browser

    Examples:
      | word |
      | cat  |
      | BDD  |
      | Dog  |
