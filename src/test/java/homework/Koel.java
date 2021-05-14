package homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Koel {
    private WebDriver driver;
    @BeforeMethod
    public void before() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://bbb.testpro.io/");
        Thread.sleep(1000);
    }
    @AfterMethod
    public void after() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }

    @Test
    public void loginToKoel_correctCredentials() throws InterruptedException {

        WebElement email = driver.findElement(By.xpath("//*[@type='email']"));
        WebElement password = driver.findElement(By.cssSelector("[type='password']"));
        WebElement loginButton = driver.findElement(By.tagName("button"));

        email.sendKeys("asting2006@rambler.ru");
        password.sendKeys("te$t$tudent");
        loginButton.click();

        Thread.sleep(2000);

        WebElement home = driver.findElement(By.cssSelector(".home")); //*[@class = 'home active']
        Assert.assertTrue(home.isDisplayed());
    }

    @Test
    public void loginToKoel_incorrectCredentials() throws InterruptedException {
        WebElement email = driver.findElement(By.xpath("//*[@type='email']"));
        WebElement password = driver.findElement(By.cssSelector("[type='password']"));
        WebElement loginButton = driver.findElement(By.tagName("button"));

        email.sendKeys("asting2006@rambler.ru");
        password.sendKeys("wrongPassword");
        loginButton.click();

        Thread.sleep(500);

        WebElement home = driver.findElement(By.cssSelector(".error")); //*[@class = 'home active']
        Assert.assertTrue(home.isDisplayed());
    }
}
