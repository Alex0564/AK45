package pageObjectsTests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjects.LoginPage;
import pageObjects.MainPage;

public class PlayListTest {
    @BeforeMethod

    @AfterMethod

    @Test
    public void playlistTests_createPlaiListCreated(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.loginToApp();
        mainPage.createPlaylist("MaxList");
    }
}
