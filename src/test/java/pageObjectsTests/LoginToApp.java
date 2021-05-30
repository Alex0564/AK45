package pageObjectsTests;

import listeners.MyRetry;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.LoginPage;
import pageObjects.MainPage;

public class LoginToApp extends BaseTest{ //lesson 05/25/2021
    private int count = 0;
    @Test(retryAnalyzer = MyRetry.class)
    public void flakyTest(){
        if(count<=2){
            count++;
            Assert.assertTrue(false);
        }
        Assert.assertTrue(true);

    }
    @Test
    public void loginToApp_correctCredentials_successfulLogin(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.loginToApp(username, password);
        Assert.assertTrue(mainPage.isMain());
    }
    @Test
    public void loginToApp_incorrectCredentials_failedLogin(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        loginPage.loginToApp(username, "wrongPassword");
        Assert.assertTrue(loginPage.isError());
    }
}
