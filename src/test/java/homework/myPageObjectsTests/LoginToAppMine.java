package homework.myPageObjectsTests;

import homework.listerners.RetryMine;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.LoginPage;
import pageObjects.MainPage;

public class LoginToAppMine extends BaseTestMine{
    private int count =0;
    @Test(retryAnalyzer = RetryMine.class)
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
