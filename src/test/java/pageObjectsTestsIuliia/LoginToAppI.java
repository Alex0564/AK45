package pageObjectsTestsIuliia;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjects.LoginPage;
import pageObjects.MainPage;
import pageObjectsIuliia.LoginPageI;
import pageObjectsIuliia.MainPageI;

public class LoginToAppI extends BaseTestI{
    @Test
    public void loginToApp_correctCredentials_successfulLogin(){
        LoginPageI loginPageI = new LoginPageI(driver);
        loginPageI.open();
        MainPageI mainPageI = loginPageI.loginToApp(username, password);
        Assert.assertTrue(mainPageI.isMain());
    }
    @Test
    public void loginToApp_incorrectCredentials_failedLogin(){
        LoginPageI loginPageI = new LoginPageI(driver);
        loginPageI.open();
        loginPageI.loginToApp(username, "wrongPassword");
        Assert.assertTrue(loginPageI.isError());
    }
}
