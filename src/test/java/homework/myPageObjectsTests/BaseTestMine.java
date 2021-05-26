package homework.myPageObjectsTests;

import homework.enumsMine.BrowserTypeMine;
import homework.helpersMine.BrowserFactoryMine;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTestMine {
    protected WebDriver driver;
    protected String username;
    protected String password;
    @BeforeMethod
    public void starUp() {
        username = "asting2006@rambler.ru";
        password = "te$t$tudent";
        driver = BrowserFactoryMine.getDriver(BrowserTypeMine.FIREFOX);
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
