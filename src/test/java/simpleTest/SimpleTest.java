package simpleTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SimpleTest {
    @Test
    public void udemySearch() throws  InterruptedException {
        System.setProperty("webserver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://udemy.com");

//        WebElement searchField = driver.findElement(By.xpath("//*[@name='q']"));
        WebElement link = driver.findElement(By.xpath("//a[contains(., 'Careers')]"));
//        searchField.sendKeys("Java");
        Thread.sleep(2000);
//        searchField.sendKeys(Keys.ENTER);
        link.sendKeys(Keys.ENTER);

        Thread.sleep(2000);
//        WebElement result = driver.findElement(By.tagName("h1"));

        WebElement result = driver.findElement(By.tagName("h2"));



        Thread.sleep(5000);
        driver.quit();


    }
}
