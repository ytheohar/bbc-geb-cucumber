Feature: Navigate to video page and share it on facebook
	The user should be able to navigate through news categories, select a video page and share it on facebook
      	
	Scenario Outline: Navigate to a Video Page and share it on Facebook
	    Given the user is landed at the home page
	    When the user selects 'Latest News'
	    And the user selects "<category>"
		And the user selects the first video on the 'Watch-Listen' section
		And the user shares the video page on facebook
		Then the facebook page loads having a url that includes the video page url
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

