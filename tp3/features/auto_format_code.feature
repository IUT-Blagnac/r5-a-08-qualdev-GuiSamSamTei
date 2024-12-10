Feature: Automatically Formatting Code on Save
  As a developer
  I want my code editor to format the code automatically on save
  So that I can keep my code clean and follow best practices

  Scenario: Saving a file with incorrect formatting
    Given I have code with incorrect indentation
    When I save the file
    Then the code should be auto-formatted according to style rules