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
}
