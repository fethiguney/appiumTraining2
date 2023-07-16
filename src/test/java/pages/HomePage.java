package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import utilities.MobileDriver;

import java.time.Duration;

public class HomePage {

    public HomePage() {
        PageFactory.initElements(new AppiumFieldDecorator(MobileDriver.getAppiumDriver(), Duration.ofSeconds(25)), this);
    }

        @AndroidFindBy (xpath = "//android.widget.TextView[@text='Tickets and travel passes\n" +
                "wherever and whenever you want!']")
        public MobileElement welcomeText;

        @AndroidFindBy (xpath = "//android.widget.TextView[@text='Later']")
        public MobileElement buttonLater;

        @AndroidFindBy (xpath = "//android.widget.Image[@text='checked CGU/CGV']")
        public MobileElement buttonCheck;

        @AndroidFindBy (xpath = "//android.widget.TextView[@text='OK']")
        public MobileElement buttonOK;




}
