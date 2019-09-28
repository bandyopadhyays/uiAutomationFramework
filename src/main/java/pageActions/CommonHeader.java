package pageActions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testBase.TestBase;
import util.ActionUtil;


public class CommonHeader extends TestBase {

    @FindBy(xpath = "//a[@title='Companies']")
    private WebElement linkCompany;
    @FindBy(xpath = "//a[@title='New Company']")
    private WebElement linkNewComany;

    private CommonHeader() {
        super();
    }

    public void moveToCompanyLink() {
        driver.switchTo().frame("mainpanel");
        ActionUtil.moveMouseToElement(linkCompany);
    }

    public void clickOnNewCompanyLink() {
        linkNewComany.click();
    }

}
