package pageObjectsTests;


import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.LoginPageFactory;
import pageObjects.MainPage;

public class LoginToAppFactory extends BaseTest {

    public LoginToAppFactory(WebDriver driver) {
//        super(driver);
    }

    @Test
    public void  loginToAppFactory_correctCredentials_successfulLogin(){
        LoginPageFactory loginPage = new LoginPageFactory(driver);
        loginPage.open("httrs://bbb.testpro.io");
        MainPage mainPage = loginPage.loginToApp(username, password); ;
        Assert.assertTrue(mainPage.isMain());
    }
    @Test
    public void  loginToApp_incorrectCredentials_failedLogin(){
        LoginPageFactory loginPage = new LoginPageFactory(driver);
        loginPage.open("httrs://bbb.testpro.io");
        loginPage.loginToApp(username,"wrong");
        Assert.assertTrue(loginPage.isErrorFrame());
    }
}
