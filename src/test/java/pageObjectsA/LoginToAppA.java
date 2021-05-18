package pageObjectsA;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.nio.channels.InterruptedByTimeoutException;

public class LoginToAppA {
    private WebDriver driver;
    @BeforeMethod
    public void startUp(){
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();
    }
    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
    @Test
    public void LoginToApp_correctCredentials_successfulLogin(){
        LoginPageA LoginPage = new LoginPageA(driver);
        LoginPage.open();
        MainPage mainPage = LoginPage.loginToApp("koeluser06@testpro.io", "te$t$tudent");
        Assert.assertTrue(mainPage.isMain());
    }
}
