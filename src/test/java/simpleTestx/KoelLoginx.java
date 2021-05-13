package simpleTestx;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class KoelLoginx {
    @Test
    public void loginToKoel_correctCredentials() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://bbb.testpro.io/");
        Thread.sleep(1000);

        WebElement email = driver.findElement(By.xpath("//*[@type='email']"));
        WebElement password = driver.findElement(By.cssSelector("[type='password']"));
        WebElement login = driver.findElement(By.tagName("button"));

        email.sendKeys("koeluser06@testpro.io");
        password.sendKeys("te$t$tudent");
        login.click();
        Thread.sleep(2000);

        WebElement home = driver.findElement(By.cssSelector(".home")); //*[@class = 'home active']
        Assert.assertTrue(home.isDisplayed());
        Thread.sleep(3000);
        driver.quit();

    }

    @Test
    public void loginToKoel_incorrectCredentials() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://bbb.testpro.io/");
        Thread.sleep(1000);

        WebElement email = driver.findElement(By.xpath("//*[@type='email']"));
        WebElement password = driver.findElement(By.cssSelector("[type='password']"));
        WebElement login = driver.findElement(By.tagName("button"));

        email.sendKeys("koeluser06@testpro.io");
        password.sendKeys("wrongPassword");
        login.click();

        Thread.sleep(1000);

        WebElement wrongLoginForm = driver.findElement(By.cssSelector(".error")); //*[@class = 'home active']
        Assert.assertTrue(wrongLoginForm.isDisplayed());
        Thread.sleep(3000);
        driver.quit();

    }
}
