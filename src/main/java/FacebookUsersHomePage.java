import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FacebookUsersHomePage {

    @FindBy(css = "._3qcu._cy7")
    WebElement homeLink;

    public String getUsersHomeLinkText() {
        String text = homeLink.getText();
        return text;
    }
}