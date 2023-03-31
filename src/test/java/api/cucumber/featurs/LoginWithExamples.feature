Feature: login action

  Scenario Outline: Successful Login with valid credentials
    Given User is on Home Page
    When User navigate to Login page
    And User enters "<username>" and "<password>"
    Then Message displayed Login successfully
    Examples:
    |username | password|
    |standard_user | secret_sauce|
    |locked_out_user | secret_sauce|
    |problem_user | secret_sauce|
    |performance_glitch_user | secret_sauce|


