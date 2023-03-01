Feature: Search apartment with rooms

  @Manual:passed
  Scenario: Search an apartment at Cartagena
    When "Esteban" is searching for an apartment at "Cartagena" with 2 rooms
    Then it should be at least one option available