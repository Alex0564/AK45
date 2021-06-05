package ao_pageObjectsTests;

import ao_pageObjects.AO_LoginPage;
import ao_pageObjects.AO_MainPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AO_PlaylistTests {
    private WebDriver driver;

    @BeforeMethod
    public void beforeMethod() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
    }

    @AfterMethod
    public void afterMethod() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }

    @Test
    public void ao_playlistTests_createPlaylist_playlistCreated() {
        AO_LoginPage ao_loginPage = new AO_LoginPage(driver);
        ao_loginPage.openBaseURL();
        AO_MainPage ao_mainPage = ao_loginPage.loginToApp("koeluser06@testpro.io", "te$t$tudent");
        ao_mainPage.createPlaylist("AO");
//        System.out.println(driver.getCurrentUrl().split("/")[5]);
    }
}
