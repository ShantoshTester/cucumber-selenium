Feature: Selecting the Date from Facebook Website

  Scenario: Selecting the date
    Given I navigate to "https://www.facebook.com/"
    When  I click on create new account button
    Then  I should see create new account page is displayed
    Then  I select day as 25
    And   I select month as "Oct"
    And   I select year as 1989