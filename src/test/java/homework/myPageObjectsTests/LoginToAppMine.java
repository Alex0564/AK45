package homework.myPageObjectsTests;

import homework.listerners.RetryMine;
import homework.myPageObjects.LoginPageMine;
import homework.myPageObjects.MainPageMine;
import org.testng.Assert;
import org.testng.annotations.Test;

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
        LoginPageMine loginPage = new LoginPageMine(driver);
        loginPage.open();
        MainPageMine mainPage = loginPage.loginToApp(username,password);
        Assert.assertTrue(mainPage.isMain());
    }
    @Test
    public void loginToApp_incorrectCredentials_failedLogin(){
        LoginPageMine loginPage = new LoginPageMine(driver);
        loginPage.open();
        loginPage.loginToApp(username,"wrongPassword");
        Assert.assertTrue(loginPage.isError());
    }
}
