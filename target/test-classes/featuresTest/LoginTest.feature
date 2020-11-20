Feature: LoginTest

@regressionTest
Scenario: Login Validation with Examples Keyword

	Given I have launch yatra application
	Then I can see the yatra home page
	When I click on login button
	Then I can see the login page
	
		
	
@smokeTest	
Scenario:  Login Validation without Examples Keyword

	Given I have launch yatra application
	Then I can see the yatra home page
	When I click on login button
	Then I can see the login page



@negativeUserNameTest
Scenario:  Verify Invalid Login Email Info

	Given I have launch yatra application
	Then I can see the yatra home page
	When I click on login button
	Then I can see the login page

	
@negativeUserPwdTest
Scenario:  Verify Invalid Login Password Info

	Given I have launch yatra application
	Then I can see the yatra home page
	When I click on login button
	Then I can see the login page
	
	
	
	
	
	
	
	
	