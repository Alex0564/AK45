package homework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreatePlaylistMy {
    private WebDriver driver;
    @BeforeMethod
    public void before() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        this.driver = new ChromeDriver();
        driver.get("https://bbb.testpro.io/");
        Thread.sleep(1000);
    }
    @AfterMethod
    public void after() throws InterruptedException {
        Thread.sleep(2000);
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

        WebElement plusButton = driver.findElement(By.xpath("//*[@title='Create a new playlist']"));
        plusButton.click();
        WebElement createPlaylist = driver.findElement(By.xpath("//*[text()='New Playlist']"));
        createPlaylist.click();
        WebElement textField = driver.findElement(By.xpath("//*[@class='create']/input"));
        textField.sendKeys("Playlist2");
        textField.sendKeys(Keys.ENTER);
        Thread.sleep(400);

        WebElement greenFrame = driver.findElement(By.xpath("//*[@class='success show']"));
        Assert.assertTrue(greenFrame.isDisplayed());

    }
}
