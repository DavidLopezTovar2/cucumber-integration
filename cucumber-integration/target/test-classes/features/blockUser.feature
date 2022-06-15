Feature: block a user

  Background: a user is logged in
    Given user is in the login page
    When user enters username and password
    And the user clicks login button
    Then the user is navigated to the login page

  Scenario Outline: block a user from chat
    Given the user is in the chat page
    When the user opens the <chatUser>
    And selects block user
    Then the user is blocked

    Examples:
    | chatUser      |
    | davidlopez123 |

  Scenario Outline: block a user from its profile
    Given the user is in a <profile>
    When the user blocks the user
    Then the user is blocked

    Examples:
    | profile  |
    | vem90143 |