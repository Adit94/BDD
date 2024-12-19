Feature: Login feature.
Scenario: Valid login to demoorangehrm webpage.
Given User enters url 
When he enters username
And he enters password
And he clicks Login button
Then Dashboard page should open
