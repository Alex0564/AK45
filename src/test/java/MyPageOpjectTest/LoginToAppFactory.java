package MyPageOpjectTest;

import MyPageObject.LoginPageFactory;
import MyPageObject.MainPage;
import MyPageObject.MyLoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginToAppFactory extends BaseTest{
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
        LoginPageFactory myLoginPage = new LoginPageFactory(driver);
        myLoginPage.open("https://bbb.testpro.io/");
//        myLoginPage.loginToApp("oleksiy564@gmail.com", "te$t$tudent");
        MainPage mainPage = myLoginPage.loginToApp(userName, password);
        Assert.assertTrue(mainPage.isMainPage());

    }
    @Test
    public void loginToApp_incorrectCredentials_failedLogin(){
        LoginPageFactory myLoginPage = new LoginPageFactory(driver);
        myLoginPage.open("https://bbb.testpro.io/");
//        myLoginPage.loginToApp("oleksiy564@gmail.com", "te$t$tudent");
        myLoginPage.loginToApp(userName, "wrong");
        Assert.assertTrue(myLoginPage.isErrorFrame());

    }

}
