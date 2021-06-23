Feature: Free CRM Appilication testing 


@SmokTest  @RegrissionTest
Scenario: Login with correct username and correct password
Given this is a valid login test

@SmokTest
Scenario: Login with incorrect useraname and password 
Given this is a invalid login test

@SmokTest  @RegrissionTest
Scenario: Create a contact
Given This is a contact test case 

@RegrissionTest
Scenario: Create a deal
Given This is a deal test case  

@SmokTest
Scenario: Create a task
Given This is a task test case 

@SmokTest
Scenario: Create a case
Given This is a case test case 

@SmokTest  @RegrissionTest
Scenario: verfiy left panel links
Given clicking on left panal link

@SmokTest  @RegrissionTest
Scenario: scearch a deal
Given This is a search deal test  

@SmokTest  @RegrissionTest
Scenario: scearch a deal
Given This is a search deal test

@SmokTest  @RegrissionTest
Scenario: scearch a contact
Given This is a contact deal test

@SmokTest  @RegrissionTest
Scenario: scearch a task
Given This is a search task test

@SmokTest  @RegrissionTest
Scenario: scearch a call
Given This is a search call test

@End2End
Scenario: scearch a email
Given This is a search email test

@End2End
Scenario: scearch a docs 
Given This is a docs deal test

 @End2End
Scenario: scearch a form
Given This is a search form test

@SmokTest  @End2End
Scenario: validation report
Given This is a  report test

@SmokTest  @End2End
Scenario: application logout
Given This is a  logout test