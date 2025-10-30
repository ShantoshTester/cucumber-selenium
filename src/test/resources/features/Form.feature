Feature: Form Filling Feature

  Scenario: Fill the form with required details
    Given I navigate to "https://demoqa.com/text-box"
    And   I enter full name as "john"
    And   I enter email as "john@test.com"
    And   I enter my current address as
    """
    No 709, 3rd Main, 2nd Cross
    Bangalore Kasturi Nagar, 560043
    """
    And  I enter the permanent address as
    """
    No 709, 3rd Main, 2nd Cross
    Bangalore Kasturi Nagar, 560043
    """
    And  I click on submit button


  Scenario: Checking the CheckBox
    Given I navigate to "https://demoqa.com/checkbox"
    When  I click on home checkbox
    Then  I should see the message "You have selected"

  Scenario: Practice Form Filling
    Given I navigate to "https://demoqa.com/automation-practice-form"
    And   I enter first name as "" and last name as ""
    And   I enter email as "john@test.com"
    And   I select male as my gender
    And   I enter my mobile number as "5698989889"
    And   I select date of birth from calender
    And   I enter the subject as "test-form filling"
    And   I select music as my hobbies
    And   I choose to upload my pic
    And   I enter my current address as
    """
    No 709, 3rd Main, 2nd Cross
    Bangalore Kasturi Nagar, 560043
    """
    And   I select state as "NCR"
    And   I select the city as "Delhi"
    And  I click on submit button





