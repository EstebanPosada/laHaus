Feature: Search all offers

  @Manual:passed
  Scenario: Search all offers ont he page
    When "Esteban" is searching for all the offers
    Then it should found a list of offers