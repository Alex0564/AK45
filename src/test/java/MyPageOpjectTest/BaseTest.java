package MyPageOpjectTest;

import Enoms.BrowserTypes;
import helpers.BrowserFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    protected WebDriver driver;
    //    private WebDriverWait wait;
    protected String userName;
    protected String password;
    @BeforeMethod
    public void startUp(){
//        System.setProperty("webdriver.chrome.driver", "chromedriver");
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();

//        WebDriverManager.firefoxdriver().setup();
//        driver = new FirefoxDriver();

        driver = BrowserFactory.getDriver(BrowserTypes.FIREFOX);

        userName = "oleksiy564@gmail.com";
        password = "te$t$tudent";
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//        driver.get("https://bbb.testpro.io/");
    }
    @AfterMethod
    public void tearDown()throws InterruptedException{
        Thread.sleep(5000);
        driver.quit();
    }
}
