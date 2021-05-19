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

public class LoginToAppI {
    private WebDriver driver;
    @BeforeMethod
    public void starUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
    }
    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
    @Test
    public void loginToApp_correctCredentials_successfulLogin(){
        LoginPageI loginPageI = new LoginPageI(driver);
        loginPageI.open();
        MainPageI mainPageI = loginPageI.loginToApp("uliyax88@gmail.com","te$t$tudent");
        Assert.assertTrue(mainPageI.isMain());
    }
    @Test
    public void loginToApp_incorrectCredentials_failedLogin(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        loginPage.loginToApp("uliyax88@gmail.com","wrongPassword");
        Assert.assertTrue(loginPage.isError());
    }
}
