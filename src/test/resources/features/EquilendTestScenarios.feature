Feature: Verify scenarios for a test page

  Scenario: Verify Remove functionality works as expected
    Given the user is on test page
    When the user clicks on Dynamic Controls
    And the user clicks on Remove button
    Then verify the text "It's gone!" is rendered