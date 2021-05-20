package pageObjectsTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.LoginPage;
import pageObjects.LoginPageFactory;
import pageObjects.MainPage;

public class LoginToAppFactory extends BaseTest {
    @Test
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
}
