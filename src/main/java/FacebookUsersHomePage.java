import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookUsersHomePage {

    @FindBy(css = "._3qcu._cy7")
    WebElement homeLink;

    public String getUsersHomeLinkText(){
        String text = homeLink.getText();
        return text;
    }
}