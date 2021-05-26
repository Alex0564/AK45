package simpleTest;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class KoelLoginA {
    @Test
    public void loginToKoel_correctCredentials() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://bbb.testpro.io/");
        Thread.sleep(2000);

        WebElement email = driver.findElement(By.xpath("//*[@type='email']"));
        WebElement password = driver.findElement(By.xpath("//*[@type='password']"));
        WebElement loginButton = driver.findElement(By.tagName("button"));

        email.sendKeys("timur895289@gmail.com");
        password.sendKeys("te$t$tudent");
        loginButton.click();
        Thread.sleep(3000);

        WebElement home = driver.findElement(By.cssSelector(".home"));
        Assert.assertTrue(home.isDisplayed());
        Thread.sleep(3000);


        driver.quit();
    }
    @Test
    public void loginToKoel_incorrectCredentials() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://bbb.testpro.io/");
        Thread.sleep(2000);

        WebElement email = driver.findElement(By.xpath("//*[@type='email']"));
        WebElement password = driver.findElement(By.xpath("//*[@type='password']"));
        WebElement loginButton = driver.findElement(By.tagName("button"));

        email.sendKeys("timur895289@gmail.com");
        password.sendKeys("wrongPassword");
        loginButton.click();
        Thread.sleep(500);
        WebElement home = driver.findElement(By.cssSelector(".error"));
        Assert.assertTrue(home.isDisplayed());
        Thread.sleep(3000);


        driver.quit();
    }
}