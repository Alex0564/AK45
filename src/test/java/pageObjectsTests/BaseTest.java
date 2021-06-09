package pageObjectsTests;

import Enoms.BrowserTypes;
import enums.BrowserType;
import helpers.BrowserFactory;
import listeners.GetScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseTest {
    protected WebDriver driver;
    protected String username;
    protected String password;
    @Parameters({"username","password","browser"})
    @BeforeMethod
    public void starUp(String email, String password, String browser) {
        username = email;
        this.password = password;
        BrowserType browserType = browser.equals("chrome") ? BrowserType.CHROME : BrowserType.FIREFOX;
        driver = BrowserFactory.getDriver(BrowserTypes.FIREFOX);
    }
    @AfterMethod()
    public void tearDown(ITestResult iTestResult){
        if(iTestResult.getStatus()==iTestResult.FAILURE){
            GetScreenshot.capture(driver, iTestResult.getName());
        }
        driver.quit();
    }
}