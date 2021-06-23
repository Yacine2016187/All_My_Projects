Feature: Free CRM Login Feature

Scenario Outline: Free CRM Login Test Scenario

#without exemple keywords

#Given user is already on Login Page
#When title of login page is Free CRM
#Then user enters "groupautomation" and "Test@12345"
#Then user clicks on login button
#Then user is on home page



#with exemple keywords

Given user is already on Login Page
When title of login page is Free CRM
Then user enters "<username>" and "<password>"
Then user clicks on login button
Then user is on home page

Examples:

|username       | password|
|groupautomation| Test@12345|
|tom            | Test@12345|