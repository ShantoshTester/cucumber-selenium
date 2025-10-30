Feature: Login Feature

  Scenario: Login as Standard User
    Given I navigate to "https://www.saucedemo.com/"
    When  I am on the login-page of the application
    Then  I enter "standard_user" as username
    And   I enter "secret_sauce" as password
    And   I click on login button
    Then  I should see the home-page of the application

  Scenario: Login as Locked-Out User
    Given I navigate to "https://www.saucedemo.com/"
    When  I am on the login-page of the application
    Then  I enter "locked_out_user" as username
    And   I enter "secret_sauce" as password
    And   I click on login button
    Then  I should see the error message "Epic sadface: Sorry, this user has been locked out."

  Scenario Outline: Login with All Valid Credentials
    Given I navigate to "https://www.saucedemo.com/"
    When  I am on the login-page of the application
    Then  I enter "<username>" as username
    And   I enter "<password>" as password
    And   I click on login button
    Then  I should see the home-page of the application
    Examples:
      | username                | password     |
      | standard_user           | secret_sauce |
      | problem_user            | secret_sauce |
      | performance_glitch_user | secret_sauce |
      | error_user              | secret_sauce |
      | visual_user             | secret_sauce |
