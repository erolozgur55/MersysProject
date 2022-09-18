Feature:  Fields Functionality


  Scenario: Create Fields
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfuly
    And Navigate to Fields page
    When Create a Fields
    Then Success message should be displayed
