import org.testng.annotations.*;

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
                        .enterUsersCredentials("fupxzqr_carrieroman_1517492731@tfbnw.net", "")
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
                        .enterUsersCredentials("fupxzqr_carrieroman_1517492731@tfbnw.net", "")
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
                        .enterUsersCredentials("fupxzqr_carrieroman_1517492731@tfbnw.net", "")
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
                        .enterUsersCredentials("fupxzqr_carrieroman_1517492731@tfbnw.net", "")
                        .clickLoginButton()
                        .getUsersHomeLinkText();
        assertEquals(actualTextatHomePage, "Home", "Cannot find Home link, user was not logged in!");
    }

    @AfterMethod
    public void closeBrowser() {
        BrowserManager.closeBrowser();
    }
}


