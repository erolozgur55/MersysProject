Feature: Position Categories Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfuly

  Scenario:User should be able to Add Position Categories, Edit Position Categories and Delete Position Categories
    When Navigate to the position categories
    Then Admin should add a position category
    And Success message should be displayed
    Then Admin should edit the position category
    And Success message should be displayed
    Then Admin should delete the position category
    And Success message should be displayed
