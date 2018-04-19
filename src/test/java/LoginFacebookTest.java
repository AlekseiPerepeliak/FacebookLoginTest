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
        String actualTextatHomePage = Navigation.
                goToFacebook().
                clickLoginButtonFromSinUpPage().
                enterUsersCredentials("test@mail,com", "testes").
                clickLoginButton().getUsersHomeLinkText();
        assertEquals(actualTextatHomePage, "Home", "Cannot find Home link, user was not logged in!");


    }

    @AfterTest
    public void closeBrowser() {
        BrowserManager.closeBrowser();
    }
}


