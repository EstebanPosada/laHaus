Feature: Search apartment

  Scenario: Search an apartment at Itagui
    When "Esteban" is searching for an apartment at "Itagui"
    Then it should be at least one option available