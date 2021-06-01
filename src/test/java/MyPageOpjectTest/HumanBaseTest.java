package MyPageOpjectTest;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class HumanBaseTest {
    protected WebDriver driver;
    protected WebDriverWait wait;
    private FluentWait<WebDriver> fluentWait;
//    Actions action = new Actions(driver);


    @BeforeMethod
    public void startUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 10, 200);
        fluentWait = new FluentWait<>(driver)
                .pollingEvery(Duration.ofMillis(200))
                .withTimeout(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class)
                .ignoring(ElementClickInterceptedException.class)
                .ignoring(ElementNotInteractableException.class)
                .ignoring(StaleElementReferenceException.class);
//        driver.get("https://humans.net/");
//        Thread.sleep(1000);
    }

    @AfterMethod
    public void tearDown()throws InterruptedException {
//        Thread.sleep(5000);
        driver.quit();
    }

}
