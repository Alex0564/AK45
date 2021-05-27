package homework.myPageObjectsTests;

import homework.enumsMine.BrowserTypeMine;
import homework.helpersMine.BrowserFactoryMine;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseTestMine {
    protected WebDriver driver;
    protected String username;
    protected String password;
    @Parameters({"username","password","browser"})
    @BeforeMethod
    public void starUp(String email, String password, String browser) {
        username = email;
        this.password = password;
        BrowserTypeMine browserTypeMine = browser.equals("chrome") ? BrowserTypeMine.CHROME : BrowserTypeMine.FIREFOX;
        driver = BrowserFactoryMine.getDriver(browserTypeMine);
//        System.setProperty("webdriver.chrome.driver", "chromedriver");
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
    }
    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}
