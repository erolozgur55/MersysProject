Feature: Login Functionality
  @SmokeTest
  Scenario: Login with valid username ve password

    Given Navigate to basgar
    When Enter username and pasword and click login button
    Then User should login successfully
