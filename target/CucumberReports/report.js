$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/Login.feature");
formatter.feature({
  "name": "Login",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Login Validation without Examples Keyword",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smokeTest"
    }
  ]
});
formatter.step({
  "name": "I have launch yatra application",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.i_have_launch_yatra_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I can see the yatra home page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.i_can_see_the_yatra_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on login button",
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.i_click_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I can see the login page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.i_can_see_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter \"sarathistudy@gmail.com\" and \"sarathi@18\" to login page",
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.i_enter_and_to_login_page(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I can see the login user name",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.i_can_see_the_login_user_name()"
});
formatter.result({
  "status": "passed"
});
});