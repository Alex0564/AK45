package simpleTest;

import net.bytebuddy.asm.Advice;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class KoelLoginA {

    WebDriver driver;
    @BeforeMethod
        public void starUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://bbb.testpro.io/");
        Thread.sleep(1000);
    }
    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(1000);
        driver.quit();
    }

    @Test
    public void loginToKoel_correctCredentials() throws InterruptedException {

        WebElement email = driver.findElement(By.xpath("//*[@type='email']"));
        WebElement password = driver.findElement(By.xpath("//*[@type='password']"));
        WebElement loginButton = driver.findElement(By.tagName("button"));

        email.sendKeys("timur895289@gmail.com");
        password.sendKeys("te$t$tudent");
        loginButton.click();
        Thread.sleep(3000);

        WebElement home = driver.findElement(By.cssSelector(".home"));
        Assert.assertTrue(home.isDisplayed());

    }
    @Test
    public void loginToKoel_incorrectCredentials() throws InterruptedException {

        WebElement email = driver.findElement(By.xpath("//*[@type='email']"));
        WebElement password = driver.findElement(By.xpath("//*[@type='password']"));
        WebElement loginButton = driver.findElement(By.tagName("button"));

        email.sendKeys("timur895289@gmail.com");
        password.sendKeys("wrongPassword");
        loginButton.click();
        Thread.sleep(500);
        WebElement home = driver.findElement(By.cssSelector(".error"));
        Assert.assertTrue(home.isDisplayed());
    }
    @Test
    public void loginToKoel_createPlaylist() throws InterruptedException {
        WebElement email = driver.findElement(By.xpath("//*[@type='email']"));
        WebElement password = driver.findElement(By.xpath("//*[@type='password']"));
        WebElement loginButton = driver.findElement(By.tagName("button"));
        Thread.sleep(1000);

        email.sendKeys("timur895289@gmail.com");
        password.sendKeys("te$t$tudent");
        loginButton.click();
        Thread.sleep(3000);

        WebElement plusButton = driver.findElement(By.xpath("//*[@class='fa fa-plus-circle control create']"));
        plusButton.click();
        WebElement newPlaylist = driver.findElement(By.xpath("//*[text()='New Playlist']"));
        newPlaylist.click();
        WebElement textField = driver.findElement(By.xpath("//*[@required='required'][1]"));
        textField.sendKeys("XXXX");
        textField.sendKeys(Keys.RETURN);
        Thread.sleep(500);
        WebElement green = driver.findElement(By.xpath("//*[@class='success show']"));
        Assert.assertTrue(green.isDisplayed());


    }

}