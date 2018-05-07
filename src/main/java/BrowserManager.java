import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class BrowserManager {

    public static ThreadLocal<WebDriver> browser = new ThreadLocal<WebDriver>();

    public static WebDriver getBrowser() {
        return browser.get();
    }

    public static void openBrowser() {
        System.setProperty("webdriver.gecko.driver", "C:/drivers/geckodriver.exe");
        browser.set(new FirefoxDriver());
        browser.get().manage().window().maximize();
        browser.get().manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }

    public static void closeBrowser() {
        browser.get().quit();
    }
}
