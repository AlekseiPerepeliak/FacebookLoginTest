import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class LoginFacebookTest {

    @BeforeMethod
    public void browser() {
        BrowserManager.openBrowser();
    }

    @Test
    public void loginFacebook() {
        String actualTextatHomePage =
                Navigation
                        .goToFacebook()
                        .clickLoginButtonFromSinUpPage()
                        .enterUsersCredentials("", "")
                        .clickLoginButton()
                        .getUsersHomeLinkText();
        assertEquals(actualTextatHomePage, "Home", "Cannot find Home link, user was not logged in!");
    }

    @Test
    public void loginFacebook1() {
        String actualTextatHomePage =
                Navigation
                        .goToFacebook()
                        .clickLoginButtonFromSinUpPage()
                        .enterUsersCredentials("", "")
                        .clickLoginButton()
                        .getUsersHomeLinkText();
        assertEquals(actualTextatHomePage, "Home", "Cannot find Home link, user was not logged in!");


    }

    @Test
    public void loginFacebook2() {
        String actualTextatHomePage =
                Navigation
                        .goToFacebook()
                        .clickLoginButtonFromSinUpPage()
                        .enterUsersCredentials("", "")
                        .clickLoginButton()
                        .getUsersHomeLinkText();
        assertEquals(actualTextatHomePage, "Home", "Cannot find Home link, user was not logged in!");
    }

    @Test
    public void loginFacebook3() {
        String actualTextatHomePage =
                Navigation
                        .goToFacebook()
                        .clickLoginButtonFromSinUpPage()
                        .enterUsersCredentials("", "")
                        .clickLoginButton()
                        .getUsersHomeLinkText();
        assertEquals(actualTextatHomePage, "Home", "Cannot find Home link, user was not logged in!");
    }

    @AfterMethod
    public void closeBrowser() {
        BrowserManager.closeBrowser();
    }
}


