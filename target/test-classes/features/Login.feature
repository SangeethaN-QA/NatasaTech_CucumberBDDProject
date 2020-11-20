Feature: Login

@regressionTest
Scenario Outline: Login Validation with Examples Keyword

	Given I have launch yatra application
	Then I can see the yatra home page
	When I click on login button
	Then I can see the login page
	When I enter "<Email>" and "<Password>" to login page
	Then I can see the login user name
	
	Examples:
		|    Email         					|  		Password     |
		|		sarathistudy@gmail.com  |		 4590834098  |
		
	
@smokeTest	
Scenario:  Login Validation without Examples Keyword

	Given I have launch yatra application
	Then I can see the yatra home page
	When I click on login button
	Then I can see the login page
	When I enter "sarathistudy@gmail.com" and "sarathi@18" to login page
	Then I can see the login user name


#@negativeUserNameTest
#Scenario:  Verify Invalid Login Email Info
#
#	Given I have launch yatra application
#	Then I can see the yatra home page
#	When I click on login button
#	Then I can see the login page
#	When I enter invalid username "sarathi988gmail.com" to login page
#	Then I can see the invalid email id error message 
#	
#	
#@negativeUserPwdTest
#Scenario:  Verify Invalid Login Password Info
#
#	Given I have launch yatra application
#	Then I can see the yatra home page
#	When I click on login button
#	Then I can see the login page
#	When I enter invalid password "sangeetha123" to login page
#	Then I can see the invalid password error message 
	
	
	
	
	
	
	
	
	