package pageObjectsTests;

import com.github.javafaker.Faker;
import helpers.TestDataGenerator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjects.CreateNewPlayList;
import pageObjects.LoginPage;
import pageObjects.MainPage;

public class PlayListTest extends BaseTest{
    private WebDriver driver;

    @Test
    public void playlistTests_createPlaiListCreated() {
        Faker faker = new Faker();
        String name = faker.funnyName().name();
//        String name = TestDataGenerator.getString(7);
        LoginPage loginPage = new LoginPage(driver);
        CreateNewPlayList createNewPlayList = new CreateNewPlayList(driver);
        loginPage.open();
        MainPage mainPage = loginPage.loginToApp("koeluser06@testpro.io", "te$t$tudent");
        CreateNewPlayList newPlayList = createNewPlayList.newPlayList("Max "+name);

        Assert.assertTrue(mainPage.checkPlaylist(newPlayList));

    }

    @Test
    public void playlistTests_renamePlaiListCreated() {
        Faker faker = new Faker();
        String name = faker.funnyName().name();
//        String name = TestDataGenerator.getString(7);
        LoginPage loginPage = new LoginPage(driver);
        CreateNewPlayList createNewPlayList = new CreateNewPlayList(driver);
        loginPage.open();
        MainPage mainPage = loginPage.loginToApp("koeluser06@testpro.io", "te$t$tudent");
        CreateNewPlayList newPlayList = createNewPlayList.newPlayList("Max "+name);

        String newPlayListName = faker.artist().name();

        Assert.assertTrue(mainPage.checkPlaylist(newPlayList,newPlayListName));

        Assert.assertTrue(mainPage.checkPlaylist(newPlayList));
    }
}
