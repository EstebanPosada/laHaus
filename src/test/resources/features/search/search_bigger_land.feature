Feature: Search bigger land

  Scenario: Search the bigger land at Bogotá
    When "Esteban" is searching for bigger land at "Bogotá, Colombia"
    Then it should found a place bigger than 3000 m2