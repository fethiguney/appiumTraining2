package stepdefinitions;

import io.cucumber.java.en.*;
import pages.HomePage;
import utilities.MobileDriver;
import utilities.WebDriver;


import static org.junit.Assert.*;

public class HomeStepDef {
    HomePage homePage=new HomePage();

    @Given("^user is on the app?")
    public void user_is_on_the_app(){
        MobileDriver.getAppiumDriver();
    }

    @Then("^user validates the welcome text \"([^\"]*)\"?")
    public void user_validates_the_welcome_text(String text){
        assertTrue(homePage.welcomeText.getText().contains(text));
    }

    @When("^user clicks the later and check button?")
    public void user_clicks_the_later_and_check_button(){
        homePage.buttonLater.click();
        homePage.buttonCheck.click();
        homePage.buttonOK.click();
    }

    @Then("^user goes to havas cms and login with valid credentials?")
    public void user_goes_to_havas_cms_and_login_with_valid_credentials(){
        WebDriver.getWebDriver().get("http://amazon.com/");
    }
}
