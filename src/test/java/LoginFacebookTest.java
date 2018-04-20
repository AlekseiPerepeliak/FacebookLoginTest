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
        FacebookUsersHomePage actualTextatHomePage = new FacebookUsersHomePage();
        Navigation.
                goToFacebook().
                clickLoginButtonFromSinUpPage().
                enterUsersCredentials("fupxzqr_carrieroman_1517492731@tfbnw.net", "!@#Trololo").
                clickLoginButton().getUsersHomeLinkText();
        assertEquals(actualTextatHomePage.toString(), "Home", "Cannot find Home link, user was not logged in!");


    }

    @AfterTest
    public void closeBrowser() {
        BrowserManager.closeBrowser();
    }
}


