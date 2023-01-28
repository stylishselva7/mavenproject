$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Scenario 6.feature");
formatter.feature({
  "name": "To read the story of bistrobites application",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "The user has to read the story in application",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "To launch the chrome browser and maximise window",
  "keyword": "Given "
});
formatter.match({
  "location": "scenario6.to_launch_the_chrome_browser_and_maximise_window()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To launch the url of bistrobites application",
  "keyword": "When "
});
formatter.match({
  "location": "scenario6.to_launch_the_url_of_bistrobites_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user has to click the our story option",
  "keyword": "And "
});
formatter.match({
  "location": "scenario6.the_user_has_to_click_the_our_story_option()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To check whether navigate home page or not",
  "keyword": "And "
});
formatter.match({
  "location": "scenario6.to_check_whether_navigate_home_page_or_not()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "scenario6.to_close_the_browser()"
});
formatter.result({
  "status": "passed"
});
});