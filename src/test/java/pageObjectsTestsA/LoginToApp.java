package pageObjectsTestsA;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjectsA.LoginPage;
import pageObjectsA.MainPage;

public class LoginToApp extends BaseTestA{
    @Test
    public void loginTiApp_correctCredentials_successfulLogin(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.loginToApp(username,password);
        Assert.assertTrue(mainPage.isMain());
    }
    @Test
    public void loginTiApp_incorrectCredentials_failedlLogin() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        loginPage.loginToApp(username,"wrongPassword");
        Assert.assertTrue(loginPage.isError());

    }
}
