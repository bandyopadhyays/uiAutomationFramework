package testBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class TestBase {

    protected static  WebDriver driver;

    protected TestBase() {
        PageFactory.initElements(driver, this);
    }

    @BeforeMethod
    @Parameters("browser")
    public void setUp(String browser) {

        driver = DriverFactory.getDriver(browser);
        driver.manage().window().maximize();
        driver.get("https://classic.crmpro.com/index.html");
    }

    @AfterMethod
    public void tearDown() {
        driver.close();
        driver.quit();
    }

}
