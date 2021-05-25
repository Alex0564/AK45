package MyPageOpjectTest;

import MyPageObject.HumanLoginPage;
import MyPageObject.HumanMainPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HumanLoginTest {
    private WebDriver driver;
    private WebDriverWait wait;
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
    @Test
    public void loginToHumans_correctCredentials_successful() throws InterruptedException {
        HumanMainPage humanMainPage = new HumanMainPage(driver);
//        System.out.println("11111111111111");
        humanMainPage.open();
//        System.out.println("22222222222222222");
        HumanLoginPage humanLoginPage = humanMainPage.gotoLoginPage();
//        System.out.println("33333333333333333");
//        HumanLoginPage humanLoginPage = new HumanLoginPage(driver);
//        System.out.println("44444444444444444444");


    }
}
