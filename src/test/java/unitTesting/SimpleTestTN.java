package unitTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.Driver;

public class SimpleTestTN {

    @Test
    public void udemySearch() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        WebDriver driver=new ChromeDriver();

        driver.get("https://udemy.com");

        WebElement searchField = driver.findElement(By.xpath("(//*[@name='q'])[2]"));
        searchField.sendKeys("Java");
        Thread.sleep(2000);
        searchField.sendKeys(Keys.ENTER);

        Thread.sleep(2000);
        WebElement result = driver.findElement(By.tagName("h1"));

        Assert.assertEquals("10,000 results for “java”", result.getText());

        Thread.sleep(5000);
        driver.quit();

    }

}