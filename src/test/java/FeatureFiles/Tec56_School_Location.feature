Feature: School Location Functionality

  Background:
    Given Navigate to basgar
    When Enter username and pasword and click login button
    Then User should login successfully
  @SmokeTest
  Scenario Outline: Create School Location
    When Navigate to School Location Page in the left nav
      | setupOne    |
      | schoolSetup |
      | locations   |

    And Click on the element in the Dialog
      | addButton |

    And User Sending the keys in Form Content
      | nameInput   | <nameInput1>   |
      | shortInput  | <shortInput1>  |
      | capacity    | <capacity1>    |


    And User Sending the active or deactivate keys in Form Content
      |<slideButton1>|

    And User Sending the keys in Form
      | saveButton |

    And Click Edit button, change "<nameInput2>"

    And User Sending the keys in Form
      | saveButton |

    Then Success message should be displayed.

    And Click Delete button in the School Location Page
      | <nameInput2> |

    Examples:
      | nameInput1 | shortInput1 | capacity1 | slideButton1 |nameInput2|
      | c2        | a32         | 32   | deactivate   |    d2      |
#      | a58        | a432         | 32   | activate   |    b358        |

