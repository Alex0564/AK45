package MyPageOpjectTest;

import MyPageObject.MainPage;
import MyPageObject.MyLoginPage;
import helpers.TestDataGenerator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PlayListTest {
    private WebDriver driver;
    private WebDriverWait wait;
    @BeforeMethod
    public void startUp(){
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//        driver.get("https://bbb.testpro.io/");
    }
    @AfterMethod
    public void tearDown()throws InterruptedException{
        Thread.sleep(5000);
        driver.quit();
    }
    @Test
    public void playListTests_createPlayList_playListCreated(){
        String playListName = TestDataGenerator.getString(7);
        System.out.println(playListName);
        MyLoginPage myLoginPage = new MyLoginPage(driver);
        myLoginPage.open();
        MainPage mainPage = myLoginPage.loginToApp("oleksiy564@gmail.com", "te$t$tudent");
        String playListNameFull  = "Alex "+playListName;
        String playListId = mainPage.createdPlayList(playListNameFull);
        System.out.println("Playlist " + playListNameFull + " has ID "+ playListId);


    }
}
