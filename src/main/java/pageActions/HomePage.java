package pageActions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import testBase.TestBase;

public class HomePage extends TestBase {

    @FindBy(xpath = "//a[contains(.,'Logout')]")
    private WebElement linkLogOut;
    @FindBy(xpath = "//td[contains(.,'User:') and @class='headertext']")
    private WebElement txtLoggedInUserInfo;
    @FindBy(xpath = "//td//a[contains(.,'Upgrade your account')]")
    private WebElement txtAccountInfo;

    private HomePage() {
        super();
    }

    public static HomePage getHomePageObj() {
        return new HomePage();
    }

    public HomePage verifyLoggedInUser(String userInfo) {
        driver.switchTo().frame("mainpanel");
        Assert.assertEquals(txtLoggedInUserInfo.getText().trim(),userInfo);
        driver.switchTo().defaultContent();
        return this;
    }

    public void clickOnlogOutLink() {
        driver.switchTo().frame("mainpanel");
        linkLogOut.click();
    }

}
