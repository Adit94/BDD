Feature: Potential Module
Scenario: Create and Delete the potential
Given User should be present in homepage 
When he clicks on potential
Then Potential Page should be displayed
When he clicks on new Potential
Then New Potential Page should be displayed
When He enters the potential name as "<name>"
And He enters the account name as "<accName>"
And he enters the closing date as "<date>"
And he select an option in the dropdown
And he clicks on save button
Then Potential details page should be displayed
When he clicks on delete button
And Handles the alert popup
And he clicks on recycle bin link
Then recycle bin page should be displayed
When he clicks on nect next button
Then the deleted potential "<name>" should be displayed

Examples:
|name|accName|date|
|Rohith|Mumbai Indians|12/31/2024|
#|Pappu|Congress|02/28/2025|
#|Punith|Karnataka|03/17/2025|
