package pageObjectsTestsVK77;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjectsVK77.LoginPage;
import pageObjectsVK77.MainPage;

public class PlaylistTests {
    private WebDriver driver;
    @BeforeMethod
    public void starUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
    }
    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
    @Test
    public void playlistTests_createPlaylist_playlistCreated(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();

        //MainPage mainPage = loginPage.loginToApp("valeriy.kan@gmail.com","te$t$tudent");
        MainPage mainPage = loginPage.loginToApp("koeluser06@testpro.io","te$t$tudent");

        //mainPage.createPlaylist("XXXX");
        System.out.println("playlist id - "+mainPage.createPlaylist("XXXX"));

    }
}
