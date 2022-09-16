Feature: Human Resource Functionality

  Background:
    Given Navigate to basgar
    When Enter username and pasword and click login button
    Then User should login successfully

  @SmokeTest
  Scenario Outline: Create Human Resource Department
    When Navigate to Human Resource Page
      | humanResource    |
      | setupUc |
      | positions   |

    And Click on the element in the Dialog
      | addButton |

    And User Sending the keys in Form Content
      | nameInput    |<nameInput1>   |
      | shortInput |<shortInput1>   |

    And User Sending the active or deactivate keys in Form Content
      |<slideButton1>|

    And User Sending the keys in Form
      | saveButton |

    Then Success message should be displayed.

    When Enter "<nameInput1>" and click search button.

    And Click Edit button, change "<Namechange>"

    And User Sending the keys in Form
      | saveButton |

    Then Success message should be displayed.

    And Click Delete button
      | <Namechange> |

    Examples:
      | nameInput1 | shortInput1 | slideButton1 | Namechange |
      | c165             | alik               | activate       | d165             |
#      | c17             | ali               | deactivate   | d17             |





