Feature: Validate login function
Background:
Given I launch browser
And I launch url
 
Scenario: Validate login with valid credentials
When I click main login button
And I enter email "ganesh.kumar1@wipro.com"
And I enter password "Pass@37790"
And I click login
Then I click logout





