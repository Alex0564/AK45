package simpleTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class KoelLogin {
    @Test
    public void LoginToKoel_correctCredentials() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://bbb.testpro.io/");

        Thread.sleep(2000);

        WebElement email = driver.findElement(By.xpath("//*[@type='email']"));
        WebElement password = driver.findElement(By.xpath("//*[@type='password']"));
        WebElement button = driver.findElement(By.tagName("button"));


        email.sendKeys("timur895289@gmail.com");

        password.sendKeys("te$t$tudent");

        button.click();

        Thread.sleep(2000);

        WebElement home = driver.findElement(By.cssSelector(".home"));
        Assert.assertTrue(home.isDisplayed());

        Thread.sleep(3000);
        driver.quit();
    }

    @Test
    public void LoginToKoel_incorrectCredentials() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://bbb.testpro.io/");

        Thread.sleep(2000);

        WebElement email = driver.findElement(By.xpath("//*[@type='email']"));
        WebElement password = driver.findElement(By.xpath("//*[@type='password']"));
        WebElement button = driver.findElement(By.tagName("button"));


        email.sendKeys("timur895289@gmail.com");

        password.sendKeys("wrongPassword");

        button.click();

        Thread.sleep(500);

        WebElement home = driver.findElement(By.cssSelector(".error"));
        Assert.assertTrue(home.isDisplayed());

        Thread.sleep(3000);
        driver.quit();
    }
}








