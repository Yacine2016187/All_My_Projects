Feature: Deal data creation 
Scenario: Free CRM Create a new contact Scenario

Given user is already on Login Page
When title of login page is Free CRM
Then user enters username and password
| groupautomation  | Test@12345 | 
Then user clicks on login button
Then user is on home page
Then user move to New Deal page
Then user Enters Deal Details 
| test data	|1000|50|10|	
Then Close The Browser
  