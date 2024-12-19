Feature: Product Page.
Scenario: Printing the selected item.
Given User is present in Amazon homepage
When  when he searches for watches
And  products should be displayed
And  he selects the watch
Then Product page should be displayed

