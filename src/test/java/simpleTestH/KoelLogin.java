package simpleTestH;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class KoelLogin {

    @Test //Test annotation allows running test
    public void loginToKoel_validCredentials() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://bbb.testpro.io/");
        Thread.sleep(2000);

        //saving web elements:
        WebElement email = driver.findElement(By.xpath("//*[@type='email']"));
        WebElement password = driver.findElement(By.cssSelector("[type='password']"));
        WebElement loginButton = driver.findElement(By.tagName("button"));

        //send elements:
        email.sendKeys("khilola.tursun@gmail.com");
        password.sendKeys("Sofiya2505");

        //click on element:
        loginButton.click();

        Thread.sleep(2000);

        //save the element 'home':

        WebElement home = driver.findElement(By.cssSelector(".home")); //*[@class='home active']

        //assert if true that 'home' button is displayed on homepage after log in:
        Assert.assertTrue(home.isDisplayed());

        Thread.sleep(3000);
        driver.quit();
    }
    @Test
    public void loginToKoel_invalidCredentials() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://bbb.testpro.io/");
        Thread.sleep(2000);
        WebElement email = driver.findElement(By.xpath("//*[@type='email']"));
        WebElement password = driver.findElement(By.cssSelector("[type='password']"));
        WebElement loginButton = driver.findElement(By.tagName("button"));

        email.sendKeys("khilola.tursun@gmail.com");
        password.sendKeys("wrongPassword");
        loginButton.click();

        Thread.sleep(500);

        WebElement home = driver.findElement(By.cssSelector(".error")); //*[@class='home active']
        Assert.assertTrue(home.isDisplayed());

        Thread.sleep(3000);
        driver.quit();
    }

}
