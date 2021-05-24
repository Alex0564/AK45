package pageObjectsTestsIuliia;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjectsIuliia.LoginPageFactoryI;
import pageObjectsIuliia.LoginPageI;
import pageObjectsIuliia.MainPageI;

public class LoginToAppFactoryI extends BaseTestI{
    @Test
    public void loginToApp_correctCredentials_successfulLogin(){
        LoginPageFactoryI loginPageI = new LoginPageFactoryI(driver);
        loginPageI.open("https://bbb.testpro.io/");
        MainPageI mainPageI = loginPageI.loginToApp(username, password);
        Assert.assertTrue(mainPageI.isMain());
    }
    @Test
    public void loginToApp_incorrectCredentials_failedLogin(){
        LoginPageFactoryI loginPageI = new LoginPageFactoryI(driver);
        loginPageI.open("https://bbb.testpro.io/");
        loginPageI.loginToApp(username, "wrongPassword");
        Assert.assertTrue(loginPageI.isErrorFrame());
    }
}
