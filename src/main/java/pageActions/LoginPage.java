package pageActions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import testBase.TestBase;

public class LoginPage extends TestBase {

    @FindBy(xpath = "//input[@name='username']")
    private WebElement txtBxUserName;
    @FindBy(xpath = "//input[@name='password']")
    private WebElement txtBxPassword;
    @FindBy(xpath = "//input[@value='Login']")
    private WebElement btnLogin;

    private LoginPage() {
        super();
    }

    public static LoginPage getLoginPageObj() {
        return new LoginPage();
    }

    public LoginPage setUserName(String userName) {
        txtBxUserName.clear();
        txtBxUserName.sendKeys(userName);
        return this;
    }

    public LoginPage setPassword(String password) {
        txtBxPassword.clear();
        txtBxPassword.sendKeys(password);
        return this;
    }

    public void clickOnLoginBtn() {
        btnLogin.click();
    }

    public void verifyLoginPageTitle(String expectedPageTitle) {
        Assert.assertEquals(driver.getTitle(), expectedPageTitle);
    }


}
