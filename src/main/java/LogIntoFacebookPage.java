import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogIntoFacebookPage {

    @FindBy(xpath = "//form[@id=\"login_form\"]//input[@name=\"email\"]")
    WebElement usenameId;

    @FindBy(xpath = "//form[@id=\"login_form\"]//input[@name=\"pass\"]")
    WebElement passwordId;

    @FindBy(css = "button[id*='loginbutton']")
    WebElement loginButtonSignIn;

    public LogIntoFacebookPage enterUsersCredentials(String username, String password) {
        usenameId.sendKeys(username);
        passwordId.sendKeys(password);
        return PageFactory.initElements(BrowserManager.browser.get(), LogIntoFacebookPage.class);
    }

    public FacebookUsersHomePage clickLoginButton() {
        loginButtonSignIn.click();
        return PageFactory.initElements(BrowserManager.browser.get(), FacebookUsersHomePage.class);

    }
}