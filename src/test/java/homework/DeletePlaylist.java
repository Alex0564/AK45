package homework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class DeletePlaylist {
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

        Actions a = new Actions(driver);
        a.contextClick(driver.findElement(By.xpath("//*[@id=\"playlists\"]/ul/li[3]/a/text()"))).pause(Duration.ofMillis(1000))
                .click(driver.findElement(By.xpath("//*[@id=\"playlists\"]/ul/li[3]/nav/ul/li[2]")));
        Thread.sleep(500);


        WebElement greenFrame = driver.findElement(By.xpath("//*[@class='Success show']"));
        Assert.assertTrue(greenFrame.isDisplayed());

    }
}
