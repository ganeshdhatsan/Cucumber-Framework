@checklogin
Feature: Validate Tricenties Webshop login function

  Background: 
    Given I launch browser
    And I launch url

  @validlogin
  Scenario: Validate Webshop login with valid credentials
    When I click main login button
    And I enter email
    And I enter password
    And I click login
    Then I click logout
    

  @invalidlogin
  Scenario Outline: Validate Webshop login with <TC_Name>
    When I click main login button
    And I enter "<Username>" email
    And I enter "<Password>" password
    And I click login
    #Then I click logout

    Examples: 
      | TC_Name                           | Username                | Password   |
      | Invalid user and valid password   | kumar.ganesh1@wipro.com | Pass@37790 |
      | Valid user and Invalid password   | ganesh1.kumar@wipro.com | Pass37790  |
      | InValid user and Invalid password | kumar.ganesh1@wipro.com | Pass37790  |
