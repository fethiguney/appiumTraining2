package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import utilities.Driver;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class HomeStepDef {
    HomePage homePage=new HomePage();

    @Given("^user is on the app?")
    public void user_is_on_the_app(){
        Driver.getAppiumDriver();
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

}
