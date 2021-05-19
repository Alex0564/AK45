package homework.myPageObjectsTests;

import com.github.javafaker.Faker;
import homework.myPageObjects.LoginPageMine;
import homework.myPageObjects.MainPageMine;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PlaylistTestsMine extends BaseTestMine{

    @Test
    public void playlistTests_createPlaylist_playlistCreated(){
        Faker faker = new Faker();
        String playlistName = faker.pokemon().name();
        System.out.println(playlistName);
        LoginPageMine myLoginPage = new LoginPageMine(driver);
        myLoginPage.open();
        MainPageMine myMainPage = myLoginPage.loginToApp(username,password);
        String playlistId = myMainPage.createPlaylist(playlistName);
        Assert.assertTrue(myMainPage.checkMyPlaylist(playlistId,playlistName));
    }
}
