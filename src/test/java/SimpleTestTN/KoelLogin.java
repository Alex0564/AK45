package SimpleTestTN;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class KoelLogin {
    @Test
    public void LoginToKoel_correctCredentials() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://bbb.testpro.io/");
        Thread.sleep(1000);
        WebElement email=driver.findElement(By.xpath("//*[@type='email']"));
        WebElement password = driver.findElement(By.xpath("//*[@type='password']"));
        WebElement loginButton = driver.findElement(By.xpath("//*[@type='submit']"));

        email.sendKeys("nessi.tima@gmail.com");
        password.sendKeys("te$t$tudent");
        loginButton.click();

        Thread.sleep(2000);

        WebElement home = driver.findElement(By.xpath("//*[@class='home active']"));
        Assert.assertTrue(home.isDisplayed());

        Thread.sleep(5000);
        driver.quit();
    }
}
