Feature: Post feature of FB
  This will test the post feature at the user wall

  Scenario: Post a text on user wall
    Given User should be logged in and should be present on wall
    When I type text in the text box
    And Click on post button
    Then The msg should get posted