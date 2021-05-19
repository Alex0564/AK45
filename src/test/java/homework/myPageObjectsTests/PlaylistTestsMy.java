package homework.myPageObjectsTests;

import homework.myPageObjects.MyLoginPage;
import homework.myPageObjects.MyMainPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjects.LoginPage;
import pageObjects.MainPage;

public class PlaylistTestsMy {
    private WebDriver driver;
    @BeforeMethod
    public void starUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();
    }
    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
    @Test
    public void playlistTests_createPlaylist_playlistCreated(){
        MyLoginPage myLoginPage = new MyLoginPage(driver);
        myLoginPage.open();
        MyMainPage myMainPage = myLoginPage.loginToApp("asting2006@rambler.ru","te$t$tudent");
        myMainPage.createPlaylist("XXXX");
    }
}
