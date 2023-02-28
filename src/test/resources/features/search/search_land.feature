Feature: Search a land

  Scenario: Search land at Chocontá
    When "Esteban" is searching "choco" expecting "Chocontá" for a land
    Then there is no results