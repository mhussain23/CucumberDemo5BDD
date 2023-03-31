Feature: Post feature of FB
  This will test the post feature at the user wall

  Background: This is for common steps
    Given User should be logged in and should be present on his wall

  @SmokeTest
  Scenario: Post a text on user wall
    When I type text as "My Post" in the text box
    And click on post button
    Then The message should get posted

  Scenario: Post a video on user wall
    When User supply you tube link as "https://www.google.com/" in the text box
    And Click on post button.
    Then The video should have proper thumbnail.