Feature: Login into Application 

Scenario: To verify USer is able to login in the Opencart login page 
	Given Initialize the Chrome browser and launch the Opencart Website 
	When User enters Username 
	And User enters Password 
	Then click on Login