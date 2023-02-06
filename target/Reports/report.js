$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/FeatureFile/login.feature");
formatter.feature({
  "name": "Validate the logine functionality of facebook",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Validate the login functionality with inavalid username name and valid password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Unita"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User should type iinavalid the username and valid password",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_should_type_iinavalid_the_username_and_valid_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_should_click_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should negative to incorrect credential page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_should_negative_to_incorrect_credential_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});