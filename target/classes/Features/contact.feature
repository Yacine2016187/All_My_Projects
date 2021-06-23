Feature: Free CRM Create Contact
Scenario Outline: Free CRM Create a new contact Scenario

Given user is already on Login Page
When title of login page is Free CRM
Then user enters "<username>" and "<password>"
Then user clicks on login button
Then user is on home page
Then user move to New contact page 
Then user Enters "<FirstName>" and "<LastName>" and "<Position>"
Then Close The Browser

Examples:
	|     username	   |  password  | FirstName|   LastName	| Position	 | 
	| groupautomation  | Test@12345 | Yadeux   |     Kab	|  Manger    |
	| groupautomation  | Test@12345 | David    |   Desouza	| Diracteur  |
	| groupautomation  | Test@12345 | David    |   Desouza	| Diracteur  |  