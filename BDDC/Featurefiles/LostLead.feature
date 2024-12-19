Feature: Leads Module.
Scenario: Lost Lead.
Given User must be present in homepage
When he clicks on Leads
Then Leads page should be displayed
When he clicks on New Lead
Then Create Lead page should be displayed
When He enters the Company name as "<name>"
And He enters the First Name as "<FirstName>"
And He enters the Last Name as "<LastName>"
And he selects an option in the dropdown
And he clicks on Save button
Then Lead Details page should be displayed
And Lead Status "<status>" should be displayed

Examples:
|name|FirstName|LastName|status|
|TCS|Vignesh|S|Lost Lead|