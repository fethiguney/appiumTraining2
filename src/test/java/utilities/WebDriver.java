package utilities;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.util.concurrent.TimeUnit;

public class WebDriver {

    private static org.openqa.selenium.WebDriver webDriver = null;

    public static org.openqa.selenium.WebDriver getWebDriver() {
        if(webDriver ==null){
            webDriver = initialize();
        }
        return webDriver;
    }

    public static org.openqa.selenium.WebDriver initialize(){
        if (webDriver == null) {
            String browser = System.getProperty("browser") != null ? browser = System.getProperty("browser") : ConfigReader.getProperty("browser");
            switch (browser) {
                case "chrome":
                    ChromeOptions options = new ChromeOptions();
                    options.addArguments("--remote-allow-origins=*");
                    WebDriverManager.chromedriver().setup();
                    webDriver = new ChromeDriver();
                    break;
                case "chrome-headless":
                    webDriver = new ChromeDriver(new ChromeOptions().setHeadless(true));
                    break;
                case "edge"    :
                    webDriver =new EdgeDriver();
                    break;
                case "firefox" :
                    webDriver =new FirefoxDriver();
                    break;
                case "safari":
                    if (!System.getProperty("os.name").toLowerCase().contains("mac"))
                        throw new WebDriverException("Your OS doesn't support Safari");
                    webDriver = new SafariDriver();
                    break;
            }
        }
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return webDriver;
    }


    public static void closeDriver(){
        if (webDriver !=null) {
            getWebDriver().manage().deleteAllCookies();
            webDriver.close();
            webDriver =null;
        }

    }

    public static void quitDrivers(){
        if (webDriver !=null) {
            webDriver.quit();
            webDriver =null;
        }
    }

}