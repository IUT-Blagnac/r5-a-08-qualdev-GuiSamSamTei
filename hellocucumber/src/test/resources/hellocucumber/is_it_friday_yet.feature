Feature: Check if it's Friday

  Scenario Outline: Check if today is Friday
    Given today is "<day>"
    When I ask whether it's Friday yet
    Then I should be told "<answer>"

    Examples:
      | day            | answer |
      | Friday         | TGIF   |
      | Sunday         | Non    |
      | anything else! | Non    |