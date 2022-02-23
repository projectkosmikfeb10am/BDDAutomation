Feature: To validate Login Functionality

@smoke @regression
Scenario: To validate login using valid credentials

Given User open chrome browser
Given User launch app using url "https://adactinhotelapp.com/"
When User enters text "reyaz0203" using xpath "//input[@id='username']"
When User enters text "reyaz123" using xpath "//input[@id='password']"
When User Click button using xpath "//input[@id='login']"
Then User validate title to be "Adactin.com - Search Hotel"
Then User close the browser

@regression
Scenario: To validate login using Invalid credentials

Given User open chrome browser
Given User launch app using url "https://adactinhotelapp.com/"
When User enters text "reyaz0203" using xpath "//input[@id='username']"
When User enters text "reyaz456" using xpath "//input[@id='password']"
When User Click button using xpath "//input[@id='login']"
Then User validate title to be "Adactin.com - Search Hotel"
Then User close the browser