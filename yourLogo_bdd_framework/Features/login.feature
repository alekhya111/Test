
Feature: My Account-Login feature
Description: This feature will test Login Functionality
  I want to use this template for my feature file
#Login functionality without parameters
#Scenario:Log-in with valid username and password
#Given open browser
#When enter open url "http://automationpractice.com/index.php"
#And click on  signIn
#And Enter username and password
#And click on login button
#Then user must be login to the webpage

#Login functionality with parameters
#Scenario:Log-in with valid username and password
#Given open browser
#When enter open url "http://automationpractice.com/index.php"
#And click on  signIn
#And Enter username "Reeha@gmail.com" and password "5%GV()HH" 
#And click on login button
#Then user must be login to the webpage

#simple Login functionality with parameters
Scenario Outline: Log-in with valid username and password
Given open browser
When enter open url "http://automationpractice.com/index.php"
And click on  signIn
And Enter username "<username>" and password "<password>" 
And click on login button
Then verify login

Examples:
|username | password |
|Reeha@gmail.com| 5%GV()HH |
|agsfjsghjg@gmail.com|sfhttrurt|


#simple Login functionality with parameters
#Scenario: Log-in with valid username and password
#Given open browser
#When enter open url "http://automationpractice.com/index.php"
#And click on  signIn
#And Enter registered username and password 
#|Reeha@gmail.com| 5%GV()HH |
#|agsfjsghjg@gmail.com|sfhttrurt|
#And click on login button
#Then verify login

