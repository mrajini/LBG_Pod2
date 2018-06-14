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
  Scenario Outline:
    Given an instance of HedgeIt that contains following trade <id>
    When I request that trade using following Rest API <rest_api>
    Then I receive the following JSON array with following:
    | Trade Name   | <trade_name> |
    | Trade Mode   | <trade_mode> |
    Examples:
    | id            | rest_api                        | trade_name      | trade_mode | date             |
    | 11            | "http://localhost:3000/Trade"   | Hedgeit Bonds   | Cash       | "12/06/2018"     |
    | 22            | "http://localhost:3000/Trade"   | Currency Funds  | SWIFT      | "17/05/2018"     |
    | 33            | "http://localhost:3000/Trade"   | Equity Funds    | Cash       | "20/10/2017"     |