package simpleTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Instant;

public class HumansSimpleTest {
    private WebDriver driver;
    private WebDriverWait wait;


    @BeforeMethod
    public void startUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 10, 200);
        driver.get("https://humans.net/");
        Thread.sleep(1000);}

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
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

        Thread.sleep(1000);
        By myprofileBy = By.xpath("//*[@class='D-0L']");



    }
}
