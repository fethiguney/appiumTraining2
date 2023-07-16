package pages;


import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utilities.MobileDriver;

import java.time.Duration;

public class HomePage {

    public HomePage() {
        PageFactory.initElements(new AppiumFieldDecorator(MobileDriver.getAppiumDriver(), Duration.ofSeconds(25)), this);
    }

        @AndroidFindBy (xpath = "//android.widget.TextView[@text='Tickets and travel passes\n" +
                "wherever and whenever you want!']")
        public WebElement welcomeText;

        @AndroidFindBy (xpath = "//android.widget.TextView[@text='Later']")
        public WebElement buttonLater;

        @AndroidFindBy (xpath = "//android.widget.Image[@text='checked CGU/CGV']")
        public WebElement buttonCheck;

        @AndroidFindBy (xpath = "//android.widget.TextView[@text='OK']")
        public WebElement buttonOK;




}
