$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("D:/ASH_Automation/ASH Automation/src/test/java/ASHFormBuilder/Features/TestFeature.feature");
formatter.feature({
  "line": 1,
  "name": "Nominee Control",
  "description": "This feature deals with Nominee Control functionality",
  "id": "nominee-control",
  "keyword": "Feature"
});
formatter.scenario({
  "comments": [
    {
      "line": 4,
      "value": "#  Background: Always start by opening the Website"
    }
  ],
  "line": 8,
  "name": "To check Nominee Controls are displayed",
  "description": "",
  "id": "nominee-control;to-check-nominee-controls-are-displayed",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 9,
  "name": "I am logged into Website",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "Nominee Controls should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.iAmLoggedIntoWebsite()"
});
formatter.result({
  "duration": 28777070112,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.nomineeControlsShouldBeDisplayed()"
});
formatter.result({
  "duration": 63693,
  "status": "passed"
});
});