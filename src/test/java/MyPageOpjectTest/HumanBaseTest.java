package MyPageOpjectTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class HumanBaseTest {
    protected WebDriver driver;
    protected WebDriverWait wait;
//    Actions action = new Actions(driver);


    @BeforeMethod
    public void startUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 10, 200);
//        driver.get("https://humans.net/");
//        Thread.sleep(1000);
    }

    @AfterMethod
    public void tearDown()throws InterruptedException {
//        Thread.sleep(5000);
        driver.quit();
    }

}
