Feature: Deal data creation 
Scenario: Free CRM Create a new contact Scenario

Given user is already on Login Page
When title of login page is Free CRM
Then user enters username and password
|	username		|	password	|
| groupautomation 	| 	Test@12345  | 
Then user clicks on login button
Then user is on home page
Then user move to New Deal page
Then user Enters Deal Details 
|	title		|	amount	 |  probability   |commission|
| test data10	|    8000    |      80        |   10	|
| test data20	|	 4000	 |      70        |   80    |
| test data20	|	 6000	 |      60        |   30    |
	
Then Close The Browser