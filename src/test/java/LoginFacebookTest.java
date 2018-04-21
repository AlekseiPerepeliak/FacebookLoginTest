import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class LoginFacebookTest {

    @BeforeClass
    public void browser() {
        BrowserManager.openBrowser();
    }

    @Test
    public void loginFacebook() {
        String actualTextatHomePage =
                Navigation
                        .goToFacebook()
                        .clickLoginButtonFromSinUpPage()
                        .enterUsersCredentials("fupxzqr_carrieroman_1517492731@tfbnw.net", "trololo123")
                        .clickLoginButton()
                        .getUsersHomeLinkText();
        assertEquals(actualTextatHomePage, "Home", "Cannot find Home link, user was not logged in!");


    }

    @AfterClass
    public void closeBrowser() {
        BrowserManager.closeBrowser();
    }
}


