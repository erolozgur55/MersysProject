Feature: Position Categories Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfuly

  Scenario:User should be able to Add Position Categories, Edit Position Categories and Delete Position Categories
    When Navigate to the Attestations
    Then Admin should add a Attestation
    And Success message should be displayed
    Then Admin should edit the Attestation
    And Success message should be displayed
    Then Admin should delete the Attestation
    And Success message should be displayed