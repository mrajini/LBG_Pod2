Feature: Belly

  @FuntionalTest
  Scenario: a few cukes
    Given I have 42 cukes in my belly
    When I wait 1 hour
    Then my belly should growl

  @FuntionalTest @APITest
  Scenario:
    Given An instance of Ergast motor racing season 2017
    When I request circuit data of season using the ReST API "http://ergast.com/api/f1/2017/circuits.json"
    Then I receive the JSON array of 20 records