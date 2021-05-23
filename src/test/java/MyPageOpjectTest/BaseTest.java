package MyPageOpjectTest;

import Enoms.BrowserTypes;
import helpers.BrowserFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseTest {
    protected WebDriver driver;
    //    private WebDriverWait wait;
    protected String userName;
    protected String password;
    @Parameters({"username", "password","browser"})// Strings совпадают с именами в testng-файле
    @BeforeMethod
    public void startUp(String email, String password, String browser){
//        System.setProperty("webdriver.chrome.driver", "chromedriver");
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();

//        WebDriverManager.firefoxdriver().setup();
//        driver = new FirefoxDriver();
        BrowserTypes browserTypes = browser.equals("chrome") ? BrowserTypes.CHROME : BrowserTypes.FIREFOX;
        driver = BrowserFactory.getDriver(BrowserTypes.FIREFOX);

        userName = "oleksiy564@gmail.com";
        this.password = "te$t$tudent";
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//        driver.get("https://bbb.testpro.io/");
    }
    @AfterMethod
    public void tearDown()throws InterruptedException{
        Thread.sleep(5000);
        driver.quit();
    }
}
