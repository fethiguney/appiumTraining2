package stepdefinitions;

import io.cucumber.java.en.Given;
import utilities.Driver;

public class HomeStepDef {

    @Given("^user is on the app?")
    public void user_is_on_the_app(){
        Driver.getAppiumDriver();
    }
}
