package MyPageOpjectTest;

import MyPageObject.MainPage;
import MyPageObject.MyLoginPage;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginToApp extends BaseTest{
//    private WebDriver driver;
////    private WebDriverWait wait;
//    @BeforeMethod
//    public void startUp(){
//        System.setProperty("webdriver.chrome.driver", "chromedriver");
//        driver = new ChromeDriver();
////        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
////        driver.get("https://bbb.testpro.io/");
//    }
//    @AfterMethod
//    public void tearDown()throws InterruptedException{
//        Thread.sleep(5000);
//        driver.quit();
//    }
    @Test
    public void loginToApp_correctCredentials_successfulLogin(){
        MyLoginPage myLoginPage = new MyLoginPage(driver);
        myLoginPage.open();
//        myLoginPage.loginToApp("oleksiy564@gmail.com", "te$t$tudent");
        MainPage mainPage = myLoginPage.loginToApp(userName, password);
        Assert.assertTrue(mainPage.isMainPage());

    }
    @Test
    public void loginToApp_incorrectCredentials_failedLogin(){
        MyLoginPage myLoginPage = new MyLoginPage(driver);
        myLoginPage.open();
//        myLoginPage.loginToApp("oleksiy564@gmail.com", "te$t$tudent");
        myLoginPage.loginToApp(userName, "wrong");
        Assert.assertTrue(myLoginPage.isError());

    }

    @Test
    public void loginToApp_correctCredentials_successfulLogin1(){
        MyLoginPage myLoginPage = new MyLoginPage(driver);
        myLoginPage.open();
//        myLoginPage.loginToApp("oleksiy564@gmail.com", "te$t$tudent");
        MainPage mainPage = myLoginPage.loginToApp(userName, password);
        Assert.assertTrue(mainPage.isMainPage());

    }
    @Test
    public void loginToApp_incorrectCredentials_failedLogin1(){
        MyLoginPage myLoginPage = new MyLoginPage(driver);
        myLoginPage.open();
//        myLoginPage.loginToApp("oleksiy564@gmail.com", "te$t$tudent");
        myLoginPage.loginToApp(userName, "wrong");
        Assert.assertTrue(myLoginPage.isError());

    }

    @Test
    public void loginToApp_correctCredentials_successfulLogin2(){
        MyLoginPage myLoginPage = new MyLoginPage(driver);
        myLoginPage.open();
//        myLoginPage.loginToApp("oleksiy564@gmail.com", "te$t$tudent");
        MainPage mainPage = myLoginPage.loginToApp(userName, password);
        Assert.assertTrue(mainPage.isMainPage());

    }
    @Test
    public void loginToApp_incorrectCredentials_failedLogin2(){
        MyLoginPage myLoginPage = new MyLoginPage(driver);
        myLoginPage.open();
//        myLoginPage.loginToApp("oleksiy564@gmail.com", "te$t$tudent");
        myLoginPage.loginToApp(userName, "wrong");
        Assert.assertTrue(myLoginPage.isError());

    }

    @Test
    public void loginToApp_correctCredentials_successfulLogin3(){
        MyLoginPage myLoginPage = new MyLoginPage(driver);
        myLoginPage.open();
//        myLoginPage.loginToApp("oleksiy564@gmail.com", "te$t$tudent");
        MainPage mainPage = myLoginPage.loginToApp(userName, password);
        Assert.assertTrue(mainPage.isMainPage());

    }
    @Test
    public void loginToApp_incorrectCredentials_failedLogin3(){
        MyLoginPage myLoginPage = new MyLoginPage(driver);
        myLoginPage.open();
//        myLoginPage.loginToApp("oleksiy564@gmail.com", "te$t$tudent");
        myLoginPage.loginToApp(userName, "wrong");
        Assert.assertTrue(myLoginPage.isError());

    }

}
