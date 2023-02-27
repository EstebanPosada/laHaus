Feature: Search house

  Scenario: Search a house at Bello
    When "Esteban" is searching for a house at "Bello" with 2 rooms
    Then it should be at least one house available with price greater than 200