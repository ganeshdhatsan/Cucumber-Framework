Feature: Validate Login Fuctions

Background: 
Given I launch browser
When I launch URL and verify title

Scenario: Validate Login With Valid Credentials
And I enter username "java"
And I enter password "selenium"
And I click login button
#Then I verify welcome message "Welcome Java !!"

