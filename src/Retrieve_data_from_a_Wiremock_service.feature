
Feature: Retrieve data from a Wiremock service
 User should be able to submit GET requests to a web service,
 represented by Wiremock

 Scenario Outline: Data retrieval from a web service
   Given a web service "<service_url>"
   When user submits a GET request
   Then status code 200 is returned

 Examples:
 |service_url|
 #@TestData@ServiceGetUrls.xlsx@Sheet1