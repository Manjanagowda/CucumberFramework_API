Feature: Testing the Github repository

Scenario: Creating repository

Given Provide repository body
When send the request using api 
Then check for name and status code
