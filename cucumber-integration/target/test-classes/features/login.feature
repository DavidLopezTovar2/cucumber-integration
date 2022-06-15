Feature: login

  Scenario Outline: login normal user
    Given the user is in the login page
    When the user enters username <username>
    And the user enters password <password>
    Then the user clicks login

    Examples:
    | username        | password          |
    | davidlopeztovar | Toolbar1997       |
    | test_user_21    | CableTecladoBlanco|
