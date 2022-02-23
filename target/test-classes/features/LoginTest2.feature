Feature: To validate Login Functionality

@wip
Scenario Outline: To validate login using Invalid credentials

Given User open chrome browser
Given User launch app using url "https://adactinhotelapp.com/"
When User enters text '<username>' using xpath "//input[@id='username']"
When User enters text '<password>' using xpath "//input[@id='password']"
When User Click button using xpath "//input[@id='login']"
Then User validate title to be '<expectedTitle>'
Then User close the browser

Examples:
|username | password | expectedTitle |
|reyaz0203 | reyaz456 | Adactin.com - Hotel Reservation System |
|reyaz1111 | reyaz123| Adactin.com - Hotel Reservation System |
|reyaz1111 | reyaz456 | Adactin.com - Hotel Reservation System |
