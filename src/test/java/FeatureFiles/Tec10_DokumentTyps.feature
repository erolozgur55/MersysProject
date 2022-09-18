Feature:  DocumentTyps Functionality


  Scenario: Create DocumentTyps
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfuly
    And Navigate to DocumentTyps page
    When Create a DocumentTyps
    Then Success message should be displayed