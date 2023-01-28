package org.stepdefinition;

import org.Base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class scenario6 extends BaseClass {

@Given("To launch the chrome browser and maximise window")
public void to_launch_the_chrome_browser_and_maximise_window() {
   launchBrowser();
   windowMaximize(); 
}

@When("To launch the url of bistrobites application")
public void to_launch_the_url_of_bistrobites_application() {
   launchUrl("https://bistrobitesdc.com/");
}

@When("The user has to click the our story option")
public void the_user_has_to_click_the_our_story_option() {
    WebElement story = driver.findElement(By.id("menu-item-3557"));
    story.click();
}

@When("To check whether navigate home page or not")
public void to_check_whether_navigate_home_page_or_not() {
    System.out.println("check the spelling mistakes");
}

@Then("To close the browser")
public void to_close_the_browser() {
   closeEntireBrowser();
}


}
