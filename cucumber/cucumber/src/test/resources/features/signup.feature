Feature: user signup
Scenario: successful signup

Given user is on sign up page
When user enter email id 
And enters valid password 
And  confirm password
Then  he should be registered 


  