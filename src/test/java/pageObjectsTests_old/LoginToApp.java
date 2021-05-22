package pageObjectsTests_old;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects_old.LoginPage;
import pageObjects_old.MainPage;

public class LoginToApp extends BaseTest {
    @Test
    public void loginToApp_correctCredentials_successfulLogin(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.loginToApp(username,password);
        Assert.assertTrue(mainPage.isMain());
    }
    @Test
    public void loginToApp_incorrectCredentials_failedLogin(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        loginPage.loginToApp(username,"wrongPassword");
        Assert.assertTrue(loginPage.isError());
    }
    @Test
    public void loginToApp_correctCredentials_successfulLogin1(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.loginToApp(username,password);
        Assert.assertTrue(mainPage.isMain());
    }
    @Test
    public void loginToApp_incorrectCredentials_failedLogin1(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        loginPage.loginToApp(username,"wrongPassword");
        Assert.assertTrue(loginPage.isError());
    }
    @Test
    public void loginToApp_correctCredentials_successfulLogin2(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.loginToApp(username,password);
        Assert.assertTrue(mainPage.isMain());
    }
    @Test
    public void loginToApp_incorrectCredentials_failedLogin2(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        loginPage.loginToApp(username,"wrongPassword");
        Assert.assertTrue(loginPage.isError());
    }
    @Test
    public void loginToApp_correctCredentials_successfulLogin3(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.loginToApp(username,password);
        Assert.assertTrue(mainPage.isMain());
    }
    @Test
    public void loginToApp_incorrectCredentials_failedLogin3(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        loginPage.loginToApp(username,"wrongPassword");
        Assert.assertTrue(loginPage.isError());
    }
}
