Feature: test login feature

  Scenario Outline: check login is successful with valid credentials
    Given browser is open
    And user is on login page
    When User enter "<username>" and "<password>"
    And user click on login
    Then user is navigated to the home page
    Examples:
      | username | password |
      | Kundan   | 12345    |
      | Varsha   | 12345    |

#used in V29 too