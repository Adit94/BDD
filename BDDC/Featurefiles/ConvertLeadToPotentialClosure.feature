Feature: Leads Module.
Scenario: Convert Lead into Potential closure.
Given User is present in homepage
When he click on Leads
Then Leads page must be displayed
When he click on New Lead
Then Create Lead page must be displayed
When He enter the Company name as "<name>"
And He enter the First Name as "<FirstName>"
And He enter the Last Name as "<LastName>"
And he selects option in the dropdown
And he click on Save button
Then Lead Details page must be displayed
When he clicks on Convert button
Then Convert Lead page should be displayed
When he handles the calender popup
And he select option in the dropdown
And he clicks Save button
Then Potential stage "<Stage>" should be displayed in Account Details page

Examples:
|name|FirstName|LastName|Stage|
|QSpiders|Aditya|Arun|Closed Lost|