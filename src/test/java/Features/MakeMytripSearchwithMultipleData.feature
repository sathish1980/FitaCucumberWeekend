#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: MakeMy Tripe flight Search with multiple data

  @tag1
  Scenario Outline: Verify Flight Search with valid value with mutiple data
    Given Launch the browser and Enter the URL
    When i see the Add popup then i will close it
    And i select From Location as <From>
    And i select To Location as <To>
    And Select date as <date>
    And i click on Search button
    Then Search result should display according to the search criteria
		And finally i will close the browser
		#And Click on back button
	
		Examples:
		|From|To|date|
		|MAA|PNQ|27|
		|PNQ|MAA|26|
	

		

		