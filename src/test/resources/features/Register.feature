Feature: User Registration Feature

  Scenario: Registering New User
    Given I navigate to "https://demowebshop.tricentis.com/"
    When  I click on register link
    Then  I enter the details into the registration form
      | shantosh | kumar  | shantosh@test.com |
      | anusha   | rajesh | anusha@gmail.com  |
