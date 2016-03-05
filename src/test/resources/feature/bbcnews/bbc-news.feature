Feature: Navigate to video page and share it on facebook
	As a user 
	I want to navigate through news categories
	So that I can select a video page and share it on facebook
      	
	Scenario Outline: Navigate to a Video Page and share it on Facebook
	    Given I am on the home page
	    When I select 'Latest News'
	    And I select "<category>"
		And I select the first video on the 'Watch-Listen' section
		And I share the video page on facebook
		Then the facebook page loads with the video page url
    	Examples:
      	| category  			|
      	| UK					|
      	| Business				|
      	| Politics				|
      	| Tech					|
      	| Science				|
      	| Health				|
      	| Education				|
      	| Entertainment & Arts	|

