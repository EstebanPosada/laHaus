Feature: Do login

  @Manual:passed
  Scenario: User go to login dialog
    When "Esteban" tries to login by entering the credentials
    Then it should get login error