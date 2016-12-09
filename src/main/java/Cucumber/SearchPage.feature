Feature: Wikipedia Page Count Words

  Scenario Outline: Wikipedia Search Page

    Given User opens Wiki Search Page

    When User search <keywords>

    Then Title page should be the same like <keywords>

    And Count the, are and is on page

    And Successfully write the result

    And Close the browser


  Examples:
  | keywords |
  | cat      |
  | BDD      |
  | Dog      |