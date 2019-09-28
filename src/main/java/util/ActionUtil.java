package util;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import testBase.TestBase;

public class ActionUtil extends TestBase {

    static Actions act;

    static {
        act = new Actions(driver);
    }
    public static void moveMouseToElement(WebElement webElement) {
        act.moveToElement(webElement);
        act.build().perform();
    }
}
