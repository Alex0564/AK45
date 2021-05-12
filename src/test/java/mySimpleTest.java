import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.nio.file.WatchEvent;

public class mySimpleTest {
    @Test
    public void udemySearch()throws InterruptedException{
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://udemy.com");

        WebElement searchField = driver.findElement(By.xpath("(//*[@name='q'])[1]"));
        Thread.sleep(5000);
        searchField.sendKeys("Java");
        Thread.sleep(5000);
        searchField.sendKeys(Keys.ENTER);
        Thread.sleep(5000);
        WebElement result = driver.findElement(By.tagName("h1"));
        Assert.assertEquals("10 000 результатов по запросу «java»", result.getText());
        driver.quit();


    }
}
