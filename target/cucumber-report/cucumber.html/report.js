$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("visaconfirmation.feature");
formatter.feature({
  "line": 1,
  "name": "Visa confirmation Test",
  "description": "",
  "id": "visa-confirmation-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 5781057500,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "A chilean Coming To the UK for Working and Plans on staying for longer than six months",
  "description": "",
  "id": "visa-confirmation-test;a-chilean-coming-to-the-uk-for-working-and-plans-on-staying-for-longer-than-six-months",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 12,
      "name": "@Test"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "I am on Homepage of Homeoffice website",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "I click on start button",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "I select Nationality \"Chile\" from the country option",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I click on continue button",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I select \"academic\" as reason to work",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I click on continue button",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I select intend to stay for \"longer than 6 months\" on the planing to work page",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I click on continue button on duration of stay",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I select job type \"Health and care professional\" on work type page",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "I click on next step on work type page",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I can see \"You need a visa to work in health and care\" message on the screen",
  "keyword": "Then "
});
formatter.match({
  "location": "VisaTest.iAmOnHomepageOfHomeofficeWebsite()"
});
formatter.result({
  "duration": 158083900,
  "status": "passed"
});
formatter.match({
  "location": "VisaTest.iClickOnStartButton()"
});
formatter.result({
  "duration": 20410282000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Chile",
      "offset": 22
    }
  ],
  "location": "VisaTest.iSelectNationalityFromTheCountryOption(String)"
});
formatter.result({
  "duration": 101665800,
  "status": "passed"
});
formatter.match({
  "location": "VisaTest.iClickOnContinueButton()"
});
formatter.result({
  "duration": 364222000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "academic",
      "offset": 10
    }
  ],
  "location": "VisaTest.iSelectAsReasonToWork(String)"
});
formatter.result({
  "duration": 15923100,
  "status": "passed"
});
formatter.match({
  "location": "VisaTest.iClickOnContinueButton()"
});
formatter.result({
  "duration": 233434300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "longer than 6 months",
      "offset": 29
    }
  ],
  "location": "VisaTest.iSelectIntendToStayForOnThePlaningToWorkPage(String)"
});
formatter.result({
  "duration": 8309000,
  "status": "passed"
});
formatter.match({
  "location": "VisaTest.iClickOnContinueButtonOnDurationOfStay()"
});
formatter.result({
  "duration": 205481600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Health and care professional",
      "offset": 19
    }
  ],
  "location": "VisaTest.iSelectJobTypeOnWorkTypePage(String)"
});
formatter.result({
  "duration": 110570600,
  "status": "passed"
});
formatter.match({
  "location": "VisaTest.iClickOnNextStepOnWorkTypePage()"
});
formatter.result({
  "duration": 299514400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "You need a visa to work in health and care",
      "offset": 11
    }
  ],
  "location": "VisaTest.iCanSeeMessageOnTheScreen(String)"
});
formatter.result({
  "duration": 101554600,
  "error_message": "org.junit.ComparisonFailure: expected:\u003cYou [need a visa to work in health and care]\u003e but was:\u003cYou [will not need a visa to come to the UK]\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:115)\r\n\tat gov.uk.check.visa.steps.VisaTest.iCanSeeMessageOnTheScreen(VisaTest.java:57)\r\n\tat ✽.Then I can see \"You need a visa to work in health and care\" message on the screen(visaconfirmation.feature:24)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 1292805400,
  "status": "passed"
});
});