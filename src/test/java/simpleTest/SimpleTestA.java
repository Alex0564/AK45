package simpleTest;

import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SimpleTestA {
    @Test
    public void udemySearch() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://udemy.com");

        WebElement searchField = driver.findElement(By.xpath("//*[@name='q']"));
        searchField.sendKeys("Java");
        searchField.sendKeys(Keys.ENTER);

        Thread.sleep(2000);
        WebElement rusult = driver.findElement(By.tagName("h1"));
        Assert.assertEquals("10,000 results for “java”",rusult.getText());





        Thread.sleep(5000);
        driver.quit();

    }
}
