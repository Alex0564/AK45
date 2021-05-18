package pageObjectsA;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PlayListTestA {
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
    public void PlayListTestA_createPlaylist_playListCreated(){
        LoginPageA LoginPage = new LoginPageA(driver);
        LoginPage.open();
        MainPage mainPage = LoginPage.loginToApp("koeluser06@testpro.io", "te$t$tudent");
        mainPage.createPlaylist("Katerina");
        Assert.assertTrue(mainPage.getSuccessBy());
    }

}
