Feature:Human Resources

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfuly


  Scenario Outline:Click Steps
  When Click to Human Resources ,Setup and Positions
  And Add New Position
  Then Enter "<Name>"  "<ShortName>" and Click Save Button
  And Click Edit Button and Change "<NameEdit>" and Save
  And Search Input and Click Search Button

    Then Delete Click Search

  Examples:
    | Name | ShortName | NameEdit |
    | Ay  | 123 | Mujgan|


