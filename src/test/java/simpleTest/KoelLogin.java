package simpleTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class KoelLogin {
    private WebDriver driver;

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
        WebElement password = driver.findElement(By.cssSelector("[type='password']"));
        WebElement loginButton = driver.findElement(By.tagName("button"));

        email.sendKeys("koeluser06@testpro.io");
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

        email.sendKeys("koeluser06@testpro.io");
        password.sendKeys("wrongPassword");
        loginButton.click();

        Thread.sleep(500);

        WebElement home = driver.findElement(By.cssSelector(".error")); //*[@class = 'home active']
        Assert.assertTrue(home.isDisplayed());
    }
    @Test
    public void loginToKoel_createPlaylist() throws InterruptedException {
        WebElement email = driver.findElement(By.xpath("//*[@type='email']"));
        WebElement password = driver.findElement(By.cssSelector("[type='password']"));
        WebElement loginButton = driver.findElement(By.tagName("button"));

        email.sendKeys("koeluser06@testpro.io");
        password.sendKeys("te$t$tudent");
        loginButton.click();

        Thread.sleep(2000);
        WebElement plusButton = driver.findElement(By.xpath("//*[@class='fa fa-plus-circle control create']"));
        plusButton.click();
        WebElement newPlaylist = driver.findElement(By.xpath("//*[text()='New Playlist']"));
        newPlaylist.click();
        WebElement textField = driver.findElement(By.xpath("//*[@class='create']/input"));
        textField.sendKeys("XXXX");
        textField.sendKeys(Keys.RETURN);
        Thread.sleep(300);
        WebElement green = driver.findElement(By.xpath("//*[@class='success show']"));
        Assert.assertTrue(green.isDisplayed());

    }
}
