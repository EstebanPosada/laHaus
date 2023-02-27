Feature: Search new project

  Scenario: Search a new project at Medellín
    When "Esteban" is searching in "Medellín" for a new project
    Then it should find at least one option available