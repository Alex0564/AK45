package MyPageOpjectTest;

import MyPageObject.MainPage;
import MyPageObject.MyLoginPage;
import com.github.javafaker.Faker;
import helpers.TestDataGenerator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PlayListTest extends BaseTest{
//    private WebDriver driver;
////    private WebDriverWait wait;
//    @BeforeMethod
//    public void startUp(){
//        System.setProperty("webdriver.chrome.driver", "chromedriver");
//        driver = new ChromeDriver();
////        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
////        driver.get("https://bbb.testpro.io/");
//    }
//    @AfterMethod
//    public void tearDown()throws InterruptedException{
//        Thread.sleep(5000);
//        driver.quit();
//    }
    @Test
    public void playListTests_createPlayList_playListCreated(){
        Faker faker = new Faker();
        String playListNameFake = faker.funnyName().name();
        System.out.println(playListNameFake);

        String playListName = TestDataGenerator.getString(7);
        System.out.println(playListName);

        playListName = playListNameFake;

        MyLoginPage myLoginPage = new MyLoginPage(driver);
        myLoginPage.open();
        MainPage mainPage = myLoginPage.loginToApp(userName, password);
        String playListNameFull  = "Alex "+playListName;
        String playListId = mainPage.createdPlayList(playListNameFull);
        System.out.println("Playlist " + playListNameFull + " has ID "+ playListId);
        Assert.assertTrue(mainPage.checkPlaylist(playListId,playListNameFull));
    }

    @Test
    public void playListTests_renamePlayList_playListRenamed(){
        Faker faker = new Faker();
        String playListName = faker.funnyName().name();

        MyLoginPage myLoginPage = new MyLoginPage(driver);
        myLoginPage.open();
        MainPage mainPage = myLoginPage.loginToApp(userName, password);
//        String playListNameFull  = "Alex "+playListName;
        String playListId = mainPage.createdPlayList(playListName);
//        System.out.println("Playlist " + playListName + " has ID "+ playListId);

        String newPlayListName = faker.aviation().aircraft();

//        System.out.println("New Play list: "+ newPlayListName);
        mainPage.renamePlaylist(playListId,newPlayListName );

        Assert.assertTrue(mainPage.checkPlaylist(playListId,newPlayListName));
    }
}
