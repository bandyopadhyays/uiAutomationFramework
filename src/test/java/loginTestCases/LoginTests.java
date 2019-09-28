package loginTestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pageActions.HomePage;
import pageActions.LoginPage;
import testBase.TestBase;

public class LoginTests extends TestBase {
    WebDriver driver;

    @Test
    public void TC_001_LoginTest_LoginWithValidCredential_FreeAccount() {

        LoginPage objLoginPage = LoginPage.getLoginPageObj();
        HomePage objHomePage = HomePage.getHomePageObj();

        // LOGIN STEPS -
        objLoginPage.setUserName("souni0419").
                    setPassword("Password1").
                    clickOnLoginBtn();


        // VALIDATIONS -
        objHomePage.verifyLoggedInUser("User: souni banerjee").
                    clickOnlogOutLink();
    }

    @Test
    public void TC_002_LoginTest_VerifyPageTitle() {
        LoginPage objLoginPage = LoginPage.getLoginPageObj();
        objLoginPage.verifyLoginPageTitle("CRMPRO - CRM software for customer relationship management, sales, and support.");
    }

}
