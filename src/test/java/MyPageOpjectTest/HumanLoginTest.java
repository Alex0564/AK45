package MyPageOpjectTest;

import MyPageObject.HumanLoggedPage;
import MyPageObject.HumanLoginPage;
import MyPageObject.HumanMainPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
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
        humanMainPage.open();
        HumanLoginPage humanLoginPage = humanMainPage.gotoLoginPage();
        Assert.assertTrue(humanLoginPage.isLoginPage());

        HumanLoggedPage humanLoggedPage = humanLoginPage.loginToApp("oleksiy27@yandex.ru","batumi4me");
        Assert.assertTrue(humanLoggedPage.isLoggedPage());

        humanLoggedPage.humburger();
        humanLoggedPage.logout();
        Assert.assertTrue(humanMainPage.isHumanMainPage());

    }
    @Test
    public void loginToHumans_wrongCredentials_unsuccessful() throws InterruptedException {
        HumanMainPage humanMainPage = new HumanMainPage(driver);
        humanMainPage.open();
        System.out.println("Open page");
        HumanLoginPage humanLoginPage = humanMainPage.gotoLoginPage();
        humanLoginPage.loginInvalid();
        Assert.assertTrue(humanLoginPage.isInvalid());
        System.out.println("Invalid test");
//        Thread.sleep(5000);
        humanLoginPage.clearEmail();
//        Thread.sleep(5000);
        System.out.println("Clear email");

        humanLoginPage.loginToApp("oleksiy27@yandex.ru", "wrong");
        System.out.println("wrong password");
        Assert.assertTrue(humanLoginPage.isIncorrect());
        System.out.println("exit");



    }

}
