package pageObjectsTestsIuliia;
import org.testng.Assert;
import org.testng.annotations.Test;
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
    @Test
    public void loginToApp_correctCredentials_successfulLogin1(){
        LoginPageI loginPageI = new LoginPageI(driver);
        loginPageI.open();
        MainPageI mainPageI = loginPageI.loginToApp(username, password);
        Assert.assertTrue(mainPageI.isMain());
    }
    @Test
    public void loginToApp_incorrectCredentials_failedLogin1(){
        LoginPageI loginPageI = new LoginPageI(driver);
        loginPageI.open();
        loginPageI.loginToApp(username, "wrongPassword");
        Assert.assertTrue(loginPageI.isError());
    }
    @Test
    public void loginToApp_correctCredentials_successfulLogin2(){
        LoginPageI loginPageI = new LoginPageI(driver);
        loginPageI.open();
        MainPageI mainPageI = loginPageI.loginToApp(username, password);
        Assert.assertTrue(mainPageI.isMain());
    }
    @Test
    public void loginToApp_incorrectCredentials_failedLogin2(){
        LoginPageI loginPageI = new LoginPageI(driver);
        loginPageI.open();
        loginPageI.loginToApp(username, "wrongPassword");
        Assert.assertTrue(loginPageI.isError());
    }
    @Test
    public void loginToApp_correctCredentials_successfulLogin3(){
        LoginPageI loginPageI = new LoginPageI(driver);
        loginPageI.open();
        MainPageI mainPageI = loginPageI.loginToApp(username, password);
        Assert.assertTrue(mainPageI.isMain());
    }
    @Test
    public void loginToApp_incorrectCredentials_failedLogin3(){
        LoginPageI loginPageI = new LoginPageI(driver);
        loginPageI.open();
        loginPageI.loginToApp(username, "wrongPassword");
        Assert.assertTrue(loginPageI.isError());
    }
}
