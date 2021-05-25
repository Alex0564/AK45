package pageObjectsTestsIuliia;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjects.LoginPage;
import pageObjects.MainPage;
import pageObjectsIuliia.LoginPageI;
import pageObjectsIuliia.MainPageI;

public class PlaylistTestsI extends BaseTestI{
    @Test
    public void playlistTests_createPlaylist_playlistCreated(){
        Faker faker = new Faker();
//        String playlistName = TestDataGenerator.getString(7);
        String playlistName = faker.funnyName().name();
        System.out.println(playlistName);

        LoginPageI loginPageI = new LoginPageI(driver);
        loginPageI.open();
        MainPageI mainPageI = loginPageI.loginToApp(username, password);
        String playlistId = mainPageI.createPlaylist(playlistName);

        Assert.assertTrue(mainPageI.checkPlaylist(playlistId, playlistName));
    }
    @Test
    public void playlistTests_renamePlaylist_playlistRenamed(){
        Faker faker = new Faker();
        String playlistName = faker.funnyName().name();
        System.out.println(playlistName);

        LoginPageI loginPageI = new LoginPageI(driver);
        loginPageI.open();
        MainPageI mainPageI = loginPageI.loginToApp(username,password);
        String playlistId = mainPageI.createPlaylist(playlistName);

        String newPlaylistName = faker.artist().name();
        mainPageI.renamePlaylist(playlistId,newPlaylistName);

        Assert.assertTrue(mainPageI.checkPlaylist(playlistId,newPlaylistName));
    }
    @Test
    public void playlistTests_createPlaylist_playlistCreated1(){
        Faker faker = new Faker();
//        String playlistName = TestDataGenerator.getString(7);
        String playlistName = faker.funnyName().name();
        System.out.println(playlistName);

        LoginPageI loginPageI = new LoginPageI(driver);
        loginPageI.open();
        MainPageI mainPageI = loginPageI.loginToApp(username, password);
        String playlistId = mainPageI.createPlaylist(playlistName);

        Assert.assertTrue(mainPageI.checkPlaylist(playlistId, playlistName));
    }
    @Test
    public void playlistTests_renamePlaylist_playlistRenamed1(){
        Faker faker = new Faker();
        String playlistName = faker.funnyName().name();
        System.out.println(playlistName);

        LoginPageI loginPageI = new LoginPageI(driver);
        loginPageI.open();
        MainPageI mainPageI = loginPageI.loginToApp(username,password);
        String playlistId = mainPageI.createPlaylist(playlistName);

        String newPlaylistName = faker.artist().name();
        mainPageI.renamePlaylist(playlistId,newPlaylistName);

        Assert.assertTrue(mainPageI.checkPlaylist(playlistId,newPlaylistName));
    }
    @Test
    public void playlistTests_createPlaylist_playlistCreated2(){
        Faker faker = new Faker();
//        String playlistName = TestDataGenerator.getString(7);
        String playlistName = faker.funnyName().name();
        System.out.println(playlistName);

        LoginPageI loginPageI = new LoginPageI(driver);
        loginPageI.open();
        MainPageI mainPageI = loginPageI.loginToApp(username, password);
        String playlistId = mainPageI.createPlaylist(playlistName);

        Assert.assertTrue(mainPageI.checkPlaylist(playlistId, playlistName));
    }
    @Test
    public void playlistTests_renamePlaylist_playlistRenamed2(){
        Faker faker = new Faker();
        String playlistName = faker.funnyName().name();
        System.out.println(playlistName);

        LoginPageI loginPageI = new LoginPageI(driver);
        loginPageI.open();
        MainPageI mainPageI = loginPageI.loginToApp(username,password);
        String playlistId = mainPageI.createPlaylist(playlistName);

        String newPlaylistName = faker.artist().name();
        mainPageI.renamePlaylist(playlistId,newPlaylistName);

        Assert.assertTrue(mainPageI.checkPlaylist(playlistId,newPlaylistName));
    }
    @Test
    public void playlistTests_createPlaylist_playlistCreated3(){
        Faker faker = new Faker();
//        String playlistName = TestDataGenerator.getString(7);
        String playlistName = faker.funnyName().name();
        System.out.println(playlistName);

        LoginPageI loginPageI = new LoginPageI(driver);
        loginPageI.open();
        MainPageI mainPageI = loginPageI.loginToApp(username, password);
        String playlistId = mainPageI.createPlaylist(playlistName);

        Assert.assertTrue(mainPageI.checkPlaylist(playlistId, playlistName));
    }
    @Test
    public void playlistTests_renamePlaylist_playlistRenamed3(){
        Faker faker = new Faker();
        String playlistName = faker.funnyName().name();
        System.out.println(playlistName);

        LoginPageI loginPageI = new LoginPageI(driver);
        loginPageI.open();
        MainPageI mainPageI = loginPageI.loginToApp(username,password);
        String playlistId = mainPageI.createPlaylist(playlistName);

        String newPlaylistName = faker.artist().name();
        mainPageI.renamePlaylist(playlistId,newPlaylistName);

        Assert.assertTrue(mainPageI.checkPlaylist(playlistId,newPlaylistName));
    }
}
