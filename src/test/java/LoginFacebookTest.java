import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utils.BrowserManager;
import utils.CSVDataProvider;
import utils.Navigation;

import java.util.Iterator;

import static org.testng.Assert.assertEquals;

public class LoginFacebookTest {

    @BeforeMethod
    public void browser() {
        BrowserManager.openBrowser();
    }

    @DataProvider(name = "csv")
    public Iterator<Object[]> searchFromCsv() {
        return CSVDataProvider.loadDataFromFile();
    }

    @Test(dataProvider = "csv")
    public void loginFacebookDifferentAccounts(String username, String password) {
        String actualTextatHomePage =
                Navigation
                        .goToFacebook()
                        .clickLoginButtonFromSinUpPage()
                        .enterUsersCredentials(username, password)
                        .clickLoginButton()
                        .getUsersHomeLinkText();
        assertEquals(actualTextatHomePage, "Home", "Cannot find Home link, user was not logged in!");
    }

    @Test
    public void loginFacebook() {
        String actualTextatHomePage =
                Navigation
                        .goToFacebook()
                        .clickLoginButtonFromSinUpPage()
                        .enterUsersCredentials("fupxzqr_carrieroman_1517492731@tfbnw.net", "aLEXANDRIA181289")
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


