Feature: Search fraction

  @Manual:passed
  Scenario: Search a fraction at Medellín
    When "Esteban" is searching for fraction at "Medellín"
    Then it should found a fraction