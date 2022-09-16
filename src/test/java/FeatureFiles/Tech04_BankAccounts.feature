Feature: Bank Accounts Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfuly

  Scenario: Admin User should be able to Add Fields, Edit Fields, Delete Fields for setting up parameters for different schools and environments
    When The user clicks on the bank account
    And Click the add button, fill in the blanks and click the save button
    Then Successfully message
    And User searches added account name, user will edit account and click save
    Then Successfully message
    And User searches added account name, user will delete account and click save
    Then Successfully message