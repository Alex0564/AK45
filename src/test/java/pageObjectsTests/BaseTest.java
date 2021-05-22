package pageObjectsTests;

import enums.BrowserType;
import helpers.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseTest {
    protected WebDriver driver;
    protected String username;
    protected String password;
    @Parameters({"username","password","browser"})
    @BeforeMethod
    public void startUp(String email, String password, String browser) {
        username = email;
        this.password = password;
        BrowserType browserType = browser.equals("chrome") ? BrowserType.CHROME : BrowserType.EDGE;
        driver = BrowserFactory.getDriver(browserType);
    }
    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}
