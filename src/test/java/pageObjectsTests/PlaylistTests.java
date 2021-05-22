package pageObjectsTests;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.LoginPage;
import pageObjects.MainPage;

public class PlaylistTests extends BaseTest{
    @Test
    public void playlistTests_createPlailist_playlistCreated() {
        Faker faker = new Faker();
        String playlistName = faker.funnyName().name();
        System.out.println(playlistName);

        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.loginToApp(username, password);
        String playlistId = mainPage.createPlaylist(playlistName);

//        Assert.assertTrue(mainPage.checkPlaylist(playlistId,playlistName));
    }

    @Test
    public void playlistTests_renamePlailist_playlistRenamed() {
        Faker faker = new Faker();
        String playlitsName = faker.funnyName().name();
        System.out.println(playlitsName);

        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.loginToApp(username,password);
        String playlistId = mainPage.createPlaylist(playlitsName);

        String newPlaylistName = faker.artist().name();
        mainPage.renamePlaylist(playlistId,newPlaylistName);

//        Assert.assertTrue(mainPage.checkPlaylist(playlistId,newPlaylistName));
    }
    @Test
    public void playlistTests_createPlailist_playlistCreated1() {
        Faker faker = new Faker();
        String playlistName = faker.funnyName().name();
        System.out.println(playlistName);

        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.loginToApp(username, password);
        String playlistId = mainPage.createPlaylist(playlistName);

//        Assert.assertTrue(mainPage.checkPlaylist(playlistId,playlistName));
    }

    @Test
    public void playlistTests_renamePlailist_playlistRenamed1() {
        Faker faker = new Faker();
        String playlitsName = faker.funnyName().name();
        System.out.println(playlitsName);

        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.loginToApp(username,password);
        String playlistId = mainPage.createPlaylist(playlitsName);

        String newPlaylistName = faker.artist().name();
        mainPage.renamePlaylist(playlistId,newPlaylistName);

//        Assert.assertTrue(mainPage.checkPlaylist(playlistId,newPlaylistName));
    }
    @Test
    public void playlistTests_createPlailist_playlistCreated2() {
        Faker faker = new Faker();
        String playlistName = faker.funnyName().name();
        System.out.println(playlistName);

        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.loginToApp(username, password);
        String playlistId = mainPage.createPlaylist(playlistName);

//        Assert.assertTrue(mainPage.checkPlaylist(playlistId,playlistName));
    }

    @Test
    public void playlistTests_renamePlailist_playlistRenamed2() {
        Faker faker = new Faker();
        String playlitsName = faker.funnyName().name();
        System.out.println(playlitsName);

        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.loginToApp(username,password);
        String playlistId = mainPage.createPlaylist(playlitsName);

        String newPlaylistName = faker.artist().name();
        mainPage.renamePlaylist(playlistId,newPlaylistName);

//        Assert.assertTrue(mainPage.checkPlaylist(playlistId,newPlaylistName));
    }
    @Test
    public void playlistTests_createPlailist_playlistCreated3() {
        Faker faker = new Faker();
        String playlistName = faker.funnyName().name();
        System.out.println(playlistName);

        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.loginToApp(username, password);
        String playlistId = mainPage.createPlaylist(playlistName);

//        Assert.assertTrue(mainPage.checkPlaylist(playlistId,playlistName));
    }

    @Test
    public void playlistTests_renamePlailist_playlistRenamed3() {
        Faker faker = new Faker();
        String playlitsName = faker.funnyName().name();
        System.out.println(playlitsName);

        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.loginToApp(username,password);
        String playlistId = mainPage.createPlaylist(playlitsName);

        String newPlaylistName = faker.artist().name();
        mainPage.renamePlaylist(playlistId,newPlaylistName);

//        Assert.assertTrue(mainPage.checkPlaylist(playlistId,newPlaylistName));
    }
}
