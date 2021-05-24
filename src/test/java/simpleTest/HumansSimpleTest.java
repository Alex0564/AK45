package simpleTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.swing.*;
import java.lang.reflect.AccessibleObject;
import java.time.Instant;

public class HumansSimpleTest {
    private WebDriver driver;
    private WebDriverWait wait;
//    Actions action = new Actions(driver);


    @BeforeMethod
    public void startUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 10, 200);
        driver.get("https://humans.net/");
        Thread.sleep(1000);}

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(1000);
        driver.quit();
    }

    @Test
    public void loginToHumans_correctCredentials()throws InterruptedException{
        By logInBy = By.xpath("//*[@class='f-B f-s f-v']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(logInBy));
        WebElement logIn = driver.findElement(logInBy);
        logIn.click();

//        By emailBy = By.xpath("//*[@class='form-input__area form-input__area--with-valid-icon phone-email-field-input--single phone-email-field-input']");
        By emailBy = By.xpath("//*[@type='text']");
        Thread.sleep(1000);
//        wait.until(ExpectedConditions.visibilityOfElementLocated(emailBy));
        WebElement email = driver.findElement(emailBy);
        email.sendKeys("oleksiy27@yandex.ru");
//        Thread.sleep(3000);

        By passwordBy = By.xpath("//*[@type='password']");
        WebElement password = driver.findElement(passwordBy);
        password.sendKeys("batumi4me");
//        Thread.sleep(3000);

        By goonBy = By.xpath("//*[@class='btn btn--size-medium btn--default login-form__submit']");
        WebElement goon = driver.findElement(goonBy);
        goon.click();

        Thread.sleep(5000);
        By myprofileBy = By.xpath("//*[@class='D-0L']");
        WebElement myprofile = driver.findElement(myprofileBy);
        Assert.assertTrue(myprofile.isDisplayed());

        By humburgerBy = By.xpath("//*[@class='hamburger-box']");
//       driver.findElement(humburgerBy).click();
        WebElement humburger = driver.findElement(humburgerBy);
        Actions action = new Actions(driver);
        action.moveToElement(humburger);
        action.perform();
        Thread.sleep(5000);

//        By logoutBy = By.xpath("//*[@class='navbar-dropdown_menu-item']");
        By logoutBy = By.xpath("//*[text()='Logout']");
        driver.findElement(logoutBy).click();
        Thread.sleep(5000);

//        By offBy = By.xpath("//*[@class='modal__close-btn-full']");
//        driver.findElement(offBy).click();
        By humansBy = By.xpath("//*[@class='y-0w']");
        WebElement humans = driver.findElement(humansBy);
        Assert.assertTrue(humans.isDisplayed());
        Thread.sleep(5000);


    }
    @Test
    public void loginToHumans_wrong_Credentials()throws InterruptedException{
        By logInBy = By.xpath("//*[@class='f-B f-s f-v']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(logInBy));
        WebElement logIn = driver.findElement(logInBy);
        logIn.click();

//        By emailBy = By.xpath("//*[@class='form-input__area form-input__area--with-valid-icon phone-email-field-input--single phone-email-field-input']");
        By emailBy = By.xpath("//*[@type='text']");
        Thread.sleep(1000);
//        wait.until(ExpectedConditions.visibilityOfElementLocated(emailBy));
        WebElement email = driver.findElement(emailBy);
        email.sendKeys("oleksiy27@yandex.ru");
//        Thread.sleep(3000);

        By passwordBy = By.xpath("//*[@type='password']");
        WebElement password = driver.findElement(passwordBy);
        password.sendKeys("wrongpass");
//        Thread.sleep(3000);

        By goonBy = By.xpath("//*[@class='btn btn--size-medium btn--default login-form__submit']");
        WebElement goon = driver.findElement(goonBy);
        goon.click();

        Thread.sleep(1000);
//        By myprofileBy = By.xpath("//*[@class='D-0L']");
//        WebElement myprofile = driver.findElement(myprofileBy);
//        Assert.assertTrue(myprofile.isDisplayed());

        By incorrectBy = By.xpath("//*[text()='Incorrect login or password']");
//        By incorrectBy = By.xpath("//*[text()='Your session has been blocked']");
        WebElement incorrect = driver.findElement(incorrectBy);
        Assert.assertTrue(incorrect.isDisplayed());
//        if(incorrect.isEnabled()){Thread.sleep(20000);}
    }
    @Test
    public void aboutUs_Humans()throws InterruptedException{
       By humburgerBy = By.xpath("//*[@class='hamburger-box']");
//       driver.findElement(humburgerBy).click();
        WebElement humburger = driver.findElement(humburgerBy);
        Actions action = new Actions(driver);
        action.moveToElement(humburger);
        action.perform();
       Thread.sleep(1000);

    By aboutBy = By.xpath("//*[@href='/about-us']");
    driver.findElement(aboutBy).click();
    Thread.sleep(1000);

    By playBy = By.xpath("//*[contains(@src, 'PHN2ZyB3aWR0aD0iODAiIGhl')]");
    driver.findElement(playBy).click();

    By videoBy = By.xpath("//*[@class='video-react-video']");
    WebElement video = driver.findElement(videoBy);
    Assert.assertTrue(video.isDisplayed());
    Thread.sleep(1000);

    By offBy = By.xpath("//*[@class='modal__close-btn-full']");
    driver.findElement(offBy).click();
    By humansBy = By.xpath("//*[@class=\"y-0w\"]");
    WebElement humans = driver.findElement(humansBy);
    Assert.assertTrue(humans.isDisplayed());
//    Thread.sleep(5000);

    }

}
