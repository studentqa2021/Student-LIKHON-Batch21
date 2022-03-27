$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("testFunction.feature");
formatter.feature({
  "line": 1,
  "name": "User able to login with valid username \u0026 password",
  "description": "\r\nDescription: \"User login orangenyhrm website \u0026 verify title\"",
  "id": "user-able-to-login-with-valid-username-\u0026-password",
  "keyword": "Feature"
});
formatter.scenario({
  "comments": [
    {
      "line": 5,
      "value": "#Background:   Contain common step"
    }
  ],
  "line": 7,
  "name": "User can login with valid username \u0026 password and verify the page",
  "description": "",
  "id": "user-able-to-login-with-valid-username-\u0026-password;user-can-login-with-valid-username-\u0026-password-and-verify-the-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "comments": [
    {
      "line": 9,
      "value": "#Given User can open any browser"
    },
    {
      "line": 10,
      "value": "#And User able to enter url"
    },
    {
      "line": 11,
      "value": "# Above steps in cucumber hooks"
    }
  ],
  "line": 12,
  "name": "User enter the userName and password",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "User click on the login button",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "User login successfull \u0026 verify the homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_enter_the_userName_and_password()"
});
formatter.result({
  "duration": 2867760100,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_click_on_the_login_button()"
});
formatter.result({
  "duration": 377294400,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_login_successfull_verify_the_homepage()"
});
formatter.result({
  "duration": 5401300,
  "status": "passed"
});
});