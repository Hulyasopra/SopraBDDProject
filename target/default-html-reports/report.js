$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/GoogleSearch.feature");
formatter.feature({
  "name": "Login to app",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@search"
    }
  ]
});
formatter.scenario({
  "name": "Login to app",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@search"
    }
  ]
});
formatter.step({
  "name": "User navigates to app url",
  "keyword": "Given "
});
formatter.match({
  "location": "soprasteria.stepdefinitions.LoginSteps.User_navigates_to_app_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User searches \"iphone 15 pro\"",
  "keyword": "When "
});
formatter.match({
  "location": "soprasteria.stepdefinitions.LoginSteps.user_searches(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
});