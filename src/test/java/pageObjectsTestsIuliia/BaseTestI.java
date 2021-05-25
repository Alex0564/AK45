package pageObjectsTestsIuliia;

import enumI.BrowserTypeI;
import enums.BrowserType;
import helpers.BrowserFactory;
import helpersI.BrowserFactoryI;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseTestI {
    protected WebDriver driver;
    protected String username;
    protected String password;
    @Parameters({"username", "password", "browser"})
    @BeforeMethod
    public void starUp(String email, String password, String browser) {
        username = email;
        this.password = password;
        BrowserTypeI browserTypeI = browser.equals("chrome") ? BrowserTypeI.CHROME : BrowserTypeI.FIREFOX;
//        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
//        WebDriverManager.firefoxdriver().setup();
//        driver = new FirefoxDriver();
//        WebDriverManager.operadriver().setup();
//        driver = new OperaDriver();
        driver = BrowserFactoryI.getDriver(browserTypeI);
    }
    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}
