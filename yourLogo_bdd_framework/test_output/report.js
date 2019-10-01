$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 2,
  "name": "My Account-Login feature",
  "description": "Description: This feature will test Login Functionality\nI want to use this template for my feature file",
  "id": "my-account-login-feature",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 5,
      "value": "#Login functionality without parameters"
    },
    {
      "line": 6,
      "value": "#Scenario:Log-in with valid username and password"
    },
    {
      "line": 7,
      "value": "#Given open browser"
    },
    {
      "line": 8,
      "value": "#When enter open url \"http://automationpractice.com/index.php\""
    },
    {
      "line": 9,
      "value": "#And click on  signIn"
    },
    {
      "line": 10,
      "value": "#And Enter username and password"
    },
    {
      "line": 11,
      "value": "#And click on login button"
    },
    {
      "line": 12,
      "value": "#Then user must be login to the webpage"
    },
    {
      "line": 14,
      "value": "#Login functionality with parameters"
    },
    {
      "line": 15,
      "value": "#Scenario:Log-in with valid username and password"
    },
    {
      "line": 16,
      "value": "#Given open browser"
    },
    {
      "line": 17,
      "value": "#When enter open url \"http://automationpractice.com/index.php\""
    },
    {
      "line": 18,
      "value": "#And click on  signIn"
    },
    {
      "line": 19,
      "value": "#And Enter username \"Reeha@gmail.com\" and password \"5%GV()HH\""
    },
    {
      "line": 20,
      "value": "#And click on login button"
    },
    {
      "line": 21,
      "value": "#Then user must be login to the webpage"
    },
    {
      "line": 23,
      "value": "#simple Login functionality with parameters"
    }
  ],
  "line": 24,
  "name": "Log-in with valid username and password",
  "description": "",
  "id": "my-account-login-feature;log-in-with-valid-username-and-password",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 25,
  "name": "open browser",
  "keyword": "Given "
});
formatter.step({
  "line": 26,
  "name": "enter open url \"http://automationpractice.com/index.php\"",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "click on  signIn",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "Enter username \"\u003cusername\u003e\" and password \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "verify login",
  "keyword": "Then "
});
formatter.examples({
  "line": 32,
  "name": "",
  "description": "",
  "id": "my-account-login-feature;log-in-with-valid-username-and-password;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 33,
      "id": "my-account-login-feature;log-in-with-valid-username-and-password;;1"
    },
    {
      "cells": [
        "Reeha@gmail.com",
        "5%GV()HH"
      ],
      "line": 34,
      "id": "my-account-login-feature;log-in-with-valid-username-and-password;;2"
    },
    {
      "cells": [
        "agsfjsghjg@gmail.com",
        "sfhttrurt"
      ],
      "line": 35,
      "id": "my-account-login-feature;log-in-with-valid-username-and-password;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 34,
  "name": "Log-in with valid username and password",
  "description": "",
  "id": "my-account-login-feature;log-in-with-valid-username-and-password;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 25,
  "name": "open browser",
  "keyword": "Given "
});
formatter.step({
  "line": 26,
  "name": "enter open url \"http://automationpractice.com/index.php\"",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "click on  signIn",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "Enter username \"Reeha@gmail.com\" and password \"5%GV()HH\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "verify login",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinations.open_browser()"
});
formatter.result({
  "duration": 10149422300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://automationpractice.com/index.php",
      "offset": 16
    }
  ],
  "location": "LoginStepDefinations.enter_open_url(String)"
});
formatter.result({
  "duration": 8568857200,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinations.click_on_signIn()"
});
formatter.result({
  "duration": 2811078200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Reeha@gmail.com",
      "offset": 16
    },
    {
      "val": "5%GV()HH",
      "offset": 47
    }
  ],
  "location": "LoginStepDefinations.enter_username_and_password(String,String)"
});
formatter.result({
  "duration": 2229981200,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinations.click_on_login_button()"
});
formatter.result({
  "duration": 1738389800,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinations.verify_login()"
});
formatter.result({
  "duration": 673585000,
  "status": "passed"
});
formatter.scenario({
  "line": 35,
  "name": "Log-in with valid username and password",
  "description": "",
  "id": "my-account-login-feature;log-in-with-valid-username-and-password;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 25,
  "name": "open browser",
  "keyword": "Given "
});
formatter.step({
  "line": 26,
  "name": "enter open url \"http://automationpractice.com/index.php\"",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "click on  signIn",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "Enter username \"agsfjsghjg@gmail.com\" and password \"sfhttrurt\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "verify login",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinations.open_browser()"
});
formatter.result({
  "duration": 9420534800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://automationpractice.com/index.php",
      "offset": 16
    }
  ],
  "location": "LoginStepDefinations.enter_open_url(String)"
});
formatter.result({
  "duration": 7019017100,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinations.click_on_signIn()"
});
formatter.result({
  "duration": 1449174900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "agsfjsghjg@gmail.com",
      "offset": 16
    },
    {
      "val": "sfhttrurt",
      "offset": 52
    }
  ],
  "location": "LoginStepDefinations.enter_username_and_password(String,String)"
});
formatter.result({
  "duration": 2253992800,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinations.click_on_login_button()"
});
formatter.result({
  "duration": 1403999300,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinations.verify_login()"
});
formatter.result({
  "duration": 653968100,
  "status": "passed"
});
});