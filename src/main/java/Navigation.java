import org.openqa.selenium.support.PageFactory;

public class Navigation {

    public static String baseURL = "https://www.facebook.com/";

    public static LogInOrSignUpFacebookPage goToFacebook() {
        BrowserManager.browser.get(baseURL);
        return PageFactory.initElements(BrowserManager.browser, LogInOrSignUpFacebookPage.class);
    }

}