package pageObjectsTestsIuliia;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTestI {
    protected WebDriver driver;
    protected String username;
    protected String password;
    @BeforeMethod
    public void starUp() {
        username = "uliyax88@gmail.com";
        password = "te$t$tudent";
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
    }
    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}
