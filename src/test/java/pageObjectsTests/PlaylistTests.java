package pageObjectsTests;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.LoginPage;
import pageObjects.MainPage;

public class PlaylistTests extends BaseTest{
    @Test
    public void playlistTests_createPlaylist_playlistCreated(){
        Faker faker = new Faker();
//        String playlistName = TestDataGenerator.getString(7);
        String playlistName = faker.funnyName().name();

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

        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.loginToApp(username,password+"11");
        String playlistId = mainPage.createPlaylist(playlistName);

        String newPlaylistName = faker.artist().name();
        mainPage.renamePlaylist(playlistId,newPlaylistName);



        Assert.assertTrue(mainPage.checkPlaylist(playlistId,newPlaylistName));
    }
    @Test
    public void playlistTests_createPlaylist_playlistCreated1(){
        Faker faker = new Faker();
//        String playlistName = TestDataGenerator.getString(7);
        String playlistName = faker.funnyName().name();
        System.out.println(playlistName);

        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.loginToApp(username,password);
        String playlistId = mainPage.createPlaylist(playlistName);

        Assert.assertTrue(mainPage.checkPlaylist(playlistId,playlistName));
    }
    @Test
    public void playlistTests_renamePlaylist_playlistRenamed1(){
        Faker faker = new Faker();
        String playlistName = faker.funnyName().name();
        System.out.println(playlistName);

        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.loginToApp(username,password);
        String playlistId = mainPage.createPlaylist(playlistName);

        String newPlaylistName = faker.artist().name();
        mainPage.renamePlaylist(playlistId,newPlaylistName);

        Assert.assertTrue(mainPage.checkPlaylist(playlistId,newPlaylistName));
    }
    @Test
    public void playlistTests_createPlaylist_playlistCreated2(){
        Faker faker = new Faker();
//        String playlistName = TestDataGenerator.getString(7);
        String playlistName = faker.funnyName().name();
        System.out.println(playlistName);

        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.loginToApp(username,password);
        String playlistId = mainPage.createPlaylist(playlistName);

        Assert.assertTrue(mainPage.checkPlaylist(playlistId,playlistName));
    }
    @Test
    public void playlistTests_renamePlaylist_playlistRenamed2(){
        Faker faker = new Faker();
        String playlistName = faker.funnyName().name();
        System.out.println(playlistName);

        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.loginToApp(username,password);
        String playlistId = mainPage.createPlaylist(playlistName);

        String newPlaylistName = faker.artist().name();
        mainPage.renamePlaylist(playlistId,newPlaylistName);

        Assert.assertTrue(mainPage.checkPlaylist(playlistId,newPlaylistName));
    }
    @Test
    public void playlistTests_createPlaylist_playlistCreated3(){
        Faker faker = new Faker();
//        String playlistName = TestDataGenerator.getString(7);
        String playlistName = faker.funnyName().name();
        System.out.println(playlistName);

        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.loginToApp(username,password);
        String playlistId = mainPage.createPlaylist(playlistName);

        Assert.assertTrue(mainPage.checkPlaylist(playlistId,playlistName));
    }
    @Test
    public void playlistTests_renamePlaylist_playlistRenamed3(){
        Faker faker = new Faker();
        String playlistName = faker.funnyName().name();
        System.out.println(playlistName);

        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.loginToApp(username,password);
        String playlistId = mainPage.createPlaylist(playlistName);

        String newPlaylistName = faker.artist().name();
        mainPage.renamePlaylist(playlistId,newPlaylistName);

        Assert.assertTrue(mainPage.checkPlaylist(playlistId,newPlaylistName));
    }
}
