#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: It is a file which contains List of scenarios. It explains high level definitions. 
#Scenario: list of steps with or without arguments.
#Scenario Outline: List of steps for driving the data from an Examples to steps
#Given: It explains Some precondition step
#When: It explains Some key actions
#Then: It explains outcomes or results
#And,But: It explains more than one actions (for Given,When,Then steps)
#Examples: It acts as a Test Data Container in table format
#Background: It contains a List of common steps which going to execute before each scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@Smoke  @Sanity
Feature: Validate Login function
  Background: 
    Given I initialize the driver
    And I launch url
    When I landed in home page
   
@Smoke  @Sanity
  Scenario: Validate Login with valid credential
 
    And I enter user name
    And I enter pass word
    And I click login button
    Then I check welcome message
    
  @Smoke @Regression
  Scenario: Validate Login with Invalid credential
   
    And I enter invalid user name
    And I enter invalid pass word
    And I click login button
    Then I check welcome message

  @tag2
  Scenario Outline: Title of your scenario outline
    Given I want to write a step with <name>
    When I check for the <value> in step
    Then I verify the <status> in step

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
