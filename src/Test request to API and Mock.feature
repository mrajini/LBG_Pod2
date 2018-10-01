
Feature:
 Test the API and Mock

@Functional_test
  Scenario Outline: Testing directly API
    Given I have a running wiremock server with <port>
    When I run the server with <port>,<url> with <path>
    Then can see the server running with <port>,<url> and with <content>

    Examples:

      | port | url                                        | path                                                                                              | content  |
      | 8089 | /service/valuations/20180618?saveTbls=true | \resources\mappings\service_valutions_20180618-43469b8f-4d39-4cb5-9c69-70ce837ca42f.json          | HP100023 |
      | 8088 | /UTS/UtcService.svc/Main                   | \resources\mappings\utc.json                                                                      | SMT55PRD |
      | 9999 | /MarketDataService/MarketDataService       | \resources\mappings\marketdataservice_marketdataservice-6d4ff208-9df9-4a54-aec3-6f943117fa08.json | SWAPSOIS |