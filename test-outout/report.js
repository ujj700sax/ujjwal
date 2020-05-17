$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/qainfotech/eclipse-workspace/com.qa.test.demo/src/main/java/com/qa/test/demo/Login.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: ujjwal.saxena"
    }
  ],
  "line": 4,
  "name": "Login Page Verification",
  "description": "",
  "id": "login-page-verification",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 7,
  "name": "Achieve application Media processor Login scenario",
  "description": "",
  "id": "login-page-verification;achieve-application-media-processor-login-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "I am on Achieve Int environment",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I want Title of page",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I provide \"sfqatest13mqy20@yopmail.com\" and \"Qait@123\"",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I lands on Homepage of Achieve Media processeor",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "I close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "Login_StepDefination.I_am_on_Achieve_Environment()"
});
formatter.result({
  "duration": 10002878392,
  "status": "passed"
});
formatter.match({
  "location": "Login_StepDefination.I_want_Title_of_page()"
});
formatter.result({
  "duration": 11284903,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "sfqatest13mqy20@yopmail.com",
      "offset": 11
    },
    {
      "val": "Qait@123",
      "offset": 45
    }
  ],
  "location": "Login_StepDefination.I_provide_username_and_Password(String,String)"
});
formatter.result({
  "duration": 10250608826,
  "status": "passed"
});
formatter.match({
  "location": "Login_StepDefination.I_lands_on_Homepage_of_Achieve_Media_processeor()"
});
formatter.result({
  "duration": 6831967236,
  "status": "passed"
});
formatter.match({
  "location": "Login_StepDefination.I_close_the_browser()"
});
formatter.result({
  "duration": 336081200,
  "status": "passed"
});
});