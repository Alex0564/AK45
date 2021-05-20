package pageObjectsTestsVK77;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjectsVK77.LoginPage;
import pageObjectsVK77.MainPage;

public class PlaylistTests extends BaseTest{



    @Test
    public void playlistTests_createPlaylist_playlistCreated(){

        Faker faker =new Faker();
        //String playlistName = TestDataGenerator.getString(7);
        String playlistName = faker.funnyName().name();
        System.out.println(playlistName);

        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.loginToApp(username,password);
        String playlistId = mainPage.createPlaylist(playlistName);

        Assert.assertTrue(mainPage.checkPlaylist(playlistId,playlistName));

    }
    @Test
    public void playlistTests_renamePlaylist_playlistRenamed(){
        Faker faker = new Faker();
        String playlistName = faker.funnyName().name();
        System.out.println(playlistName);

        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.loginToApp(username,password);
        String playlistId=  mainPage.createPlaylist(playlistName);

        String newPlaylistName = faker.artist().name();
        mainPage.renamePlaylist(playlistId,newPlaylistName);
        Assert.assertTrue(mainPage.checkPlaylist(playlistId,newPlaylistName+"(renamedByValeriy)"));
    }

}
