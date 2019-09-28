package testBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {

    private static WebDriver driver;
    private static String driverExecutableBasePath = System.getProperty("user.dir") + "/src/main/resources/driverServer/";

    private static WebDriver setWebDriver(String browser) {

        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", driverExecutableBasePath + "chromedriver.exe");
            driver = new ChromeDriver();
        }else if (browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", driverExecutableBasePath + "geckodriver.exe");
            driver = new FirefoxDriver();
        } else{
        driver = null;
        }
        return driver;

}


    public static WebDriver getDriver(String browser) {
        return setWebDriver(browser);
    }


}
