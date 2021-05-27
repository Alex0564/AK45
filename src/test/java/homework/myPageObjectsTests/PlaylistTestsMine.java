package homework.myPageObjectsTests;

import com.github.javafaker.Faker;
import homework.myPageObjects.LoginPageMine;
import homework.myPageObjects.MainPageMine;
import org.testng.Assert;
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

    @Test
    public void playlistTests_renamePlaylist_playlistRenamed(){
        Faker faker = new Faker();
        String playlistName = faker.funnyName().name();
        System.out.println("Old playlist name - "+playlistName);

        LoginPageMine loginPage = new LoginPageMine(driver);
        loginPage.open();
        MainPageMine mainPage = loginPage.loginToApp(username,password);
        String playlistId = mainPage.createPlaylist(playlistName);

        String newPlaylistName = faker.artist().name();
        System.out.println("New playlist name - "+newPlaylistName);
        mainPage.renamePlaylist(playlistId,newPlaylistName);


        Assert.assertTrue(mainPage.checkMyPlaylist(playlistId,newPlaylistName));
    }
}
