Feature: To validate register Functionality

@wip0217
Scenario Outline: To validate register using valid data

Given User open chrome browser
Given User launch app using url "https://adactinhotelapp.com/"
Then User click link using xpath "//a[text()='New User Register Here']"
Then User enters details in New User Registration Form
|username|password|confirmPassword|fullName|email|
|sai0217|sai123|sai123|sai kumar|abc@gmail.com|
Then User close the browser


