Feature: Calculator

  Scenario: Add two numbers
    Given I add <5> and <3>
    Then the result should be <8>