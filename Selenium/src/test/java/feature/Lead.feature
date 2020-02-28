Feature: Create Lead in Leafstab application.
Background:
Given open the chrome browser
And maxmimize the browser
And get the url

@smoke
Scenario Outline: TC001 Positive Flow


And enter username <username> in login page
And enter password <password> in login page
When click on Login button
Then user navigates to home page

Given click on create leads
And Enter vb in first name
And Enter Sindhu in second name
And Entetr Amazone in company name
When click on save button
Then say user saved

Examples:

|username|password|
|Demosalesmanager|crmsfa|
|DemoCSR|crmsfa|

@sanity
Scenario: TC002 Positive Flow


And enter username Demosalesmanager in login page
And enter password crmsfa in login page
When click on Login button
Then user navigates to home page

Given click on create leads
And Enter vb in first name
And Enter Sindhu in second name
And Entetr Amazone in company name
When click on save button
Then say user saved