Feature:Education SetUp

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfuly


  Scenario Outline:
    When Navigate to Education,Setup and Subject Categories
    And Click Add Button
    And Add "<Name>" vs "<Code>" and Click Save Button
    Then Subject Category successfully updated
    And Click Edit and send "<NewName>" and Save
    Then Delete
    And Success message
    Examples:
      | Name | Code |NewName|
      | Alba | 1992 |  Sara |
