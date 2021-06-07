package pageObjectsTestsA;

import com.github.javafaker.Faker;
import helpersA.TestDataGenarator;
import helpersA.TestDataGenarator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjectsA.LoginPage;
import pageObjectsA.MainPage;

public class PlaylistTest extends BaseTestA {

    @Test
    public void playlistTest_createPlaylist_PlayListCreated() {
        Faker faker = new Faker();
        String playlistName = faker.funnyName().name();

        //     String playlistName = TestDataGenarator.getString(7);
        System.out.println(playlistName);

        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.loginToApp(username, password);
        String playlistId = mainPage.createPlaylist(playlistName);
        Assert.assertTrue(mainPage.checkPlaylist(playlistId, playlistName));
    }

    @Test
    public void playlistTest_renamePlaylist_PlayListRenamed() {
        Faker faker = new Faker();
        String playlistName = faker.funnyName().name();
        System.out.println(playlistName);

        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.loginToApp(username, password);
        String playlistId = mainPage.createPlaylist(playlistName);

        String newPlaylistName = faker.artist().name();
        mainPage.renamePlaylist(playlistId,newPlaylistName);

        Assert.assertTrue(mainPage.checkPlaylist(playlistId, newPlaylistName));
    }
}
