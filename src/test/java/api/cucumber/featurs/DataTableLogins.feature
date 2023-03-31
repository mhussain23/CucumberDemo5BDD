Feature: User login feature

  Scenario: User login scenario
    Given User is at login page of the application
    When User log in with the following username and password
    | user1 | pass1 |
    | user2 | pass2 |
    | user2 | pass3 |
    Then User should be abble to login with correct username and password

