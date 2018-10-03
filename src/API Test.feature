
Feature:
  eature: My feature 2

 Scenario Outline: Test1
   Given User is on Home Page
   When User Navigate to LogIn Page
   And User enters "<username>" and "<password>"
   Then Message displayed Login Successfully

 Examples:
 |username|password|
 #@TestData@MyFeatureTestData2.xlsx@Sheet1