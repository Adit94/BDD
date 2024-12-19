Feature: Login feature.
Scenario: Valid login to actitime application.
Given User enters the url as "http://localhost/login.do"
When he enters the username as "<username>"
And he enters the password as "<password>"
And he clicks on Login button
Then Home page should be displayed
Examples:
|username|password|
|admin|manager|
|Aditya|Aditya@123|
