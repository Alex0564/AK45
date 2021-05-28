package pageObjectsTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.LoginPageFactory;
import pageObjects.MainPage;

public class LoginToAppFactory extends BaseTest {
    @Test(enabled = false)
    public void loginToApp_correctCredentials_successfulLogin(){
        LoginPageFactory loginPage = new LoginPageFactory(driver);
        loginPage.open("https://bbb.testpro.io");
        MainPage mainPage = loginPage.loginToApp(username,password);
        Assert.assertTrue(mainPage.isMain());
    }
    @Test
    public void loginToApp_incorrectCredentials_failedLogin(){
        LoginPageFactory loginPage = new LoginPageFactory(driver);
        loginPage.open("https://bbb.testpro.io");
        loginPage.loginToApp(username,"wrongPassword");
        Assert.assertTrue(loginPage.isErrorFrame());
    }
    @Test(enabled = false)
    public void loginToApp_correctCredentials_successfulLogin1(){
        LoginPageFactory loginPage = new LoginPageFactory(driver);
        loginPage.open("https://bbb.testpro.io");
        MainPage mainPage = loginPage.loginToApp(username,password);
        Assert.assertTrue(mainPage.isMain());
    }
    @Test
    public void loginToApp_incorrectCredentials_failedLogin1(){
        LoginPageFactory loginPage = new LoginPageFactory(driver);
        loginPage.open("https://bbb.testpro.io");
        loginPage.loginToApp(username,"wrongPassword");
        Assert.assertTrue(loginPage.isErrorFrame());
    }
    @Test
    public void loginToApp_correctCredentials_successfulLogin2(){
        LoginPageFactory loginPage = new LoginPageFactory(driver);
        loginPage.open("https://bbb.testpro.io");
        MainPage mainPage = loginPage.loginToApp(username,password);
        Assert.assertTrue(mainPage.isMain());
    }
    @Test
    public void loginToApp_incorrectCredentials_failedLogin2(){
        LoginPageFactory loginPage = new LoginPageFactory(driver);
        loginPage.open("https://bbb.testpro.io");
        loginPage.loginToApp(username,"wrongPassword");
        Assert.assertTrue(loginPage.isErrorFrame());
    }
    @Test
    public void loginToApp_correctCredentials_successfulLogin3(){
        LoginPageFactory loginPage = new LoginPageFactory(driver);
        loginPage.open("https://bbb.testpro.io");
        MainPage mainPage = loginPage.loginToApp(username,password);
        Assert.assertTrue(mainPage.isMain());
    }
    @Test
    public void loginToApp_incorrectCredentials_failedLogin3(){
        LoginPageFactory loginPage = new LoginPageFactory(driver);
        loginPage.open("https://bbb.testpro.io");
        loginPage.loginToApp(username,"wrongPassword");
        Assert.assertTrue(loginPage.isErrorFrame());
    }
}