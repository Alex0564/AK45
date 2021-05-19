package hw_koelPlaylistCreated;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class KoelPlaylistTests {
    private WebDriver driver;

    @BeforeMethod
    public void start() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
    }

    @AfterMethod
    public void down() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }

    @Test
    public void koelLogin_correctCredentials() {
        KoelLoginPage koelLoginPage = new KoelLoginPage(driver);
        koelLoginPage.open();
        KoelMainPage koelMainPage = koelLoginPage.loginToApp("koeluser06@testpro.io", "te$t$tudent");
    }

    @Test
    public void koelCreatePlaylist_PlaylistCreated() {
        KoelLoginPage koelLoginPage = new KoelLoginPage(driver);
        koelLoginPage.open();
        KoelMainPage koelMainPage = koelLoginPage.loginToApp("koeluser06@testpro.io", "te$t$tudent");
        koelMainPage.createPlaylist("AO");
    }
}
