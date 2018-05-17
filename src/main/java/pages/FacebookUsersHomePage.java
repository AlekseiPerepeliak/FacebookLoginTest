package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Utils;

public class FacebookUsersHomePage {

    @FindBy(css = "._3qcu._cy7")
    WebElement homeLink;

    public String getUsersHomeLinkText() {
        Utils.waitForElementIsVisible(homeLink);
        return homeLink.getText();
    }
}