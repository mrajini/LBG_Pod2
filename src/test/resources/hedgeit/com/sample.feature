Feature: Belly

  @FunctionalTest
  Scenario: a few cukes
    Given I have 42 cukes in my belly
    When I wait 1 hour
    Then my belly should growl

  @FunctionalTest
  Scenario:
    Given An instance of Ergast motor racing season 2017
    When I request circuit data of season using the ReST API "http://ergast.com/api/f1/2017/circuits.json"
    Then I receive the JSON array of 20 records

  @FunctionalTest
  Scenario:
  Given an instance of HedgeIt that contains trade id 11
  When I request that trade using the ReST API
  http://<server>:16003/service/trades/8549748LO1/20180524
  Then I receive the following JSON array
  [{....}]```