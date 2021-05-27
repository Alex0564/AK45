package ao_simleTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AO_SimleTest {
    @Test
    public void ao_udemySearch() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://udemy.com");

        WebElement searchField = driver.findElement(By.xpath("//input[@placeholder='Search for anything']"));
        searchField.sendKeys("Java");
        searchField.sendKeys(Keys.ENTER);

        Thread.sleep(2000);
        WebElement result= driver.findElement(By.xpath("//h1"));
        Assert.assertEquals(result.getText(), "10,000 results for “java”");

        Thread.sleep(5000);
        driver.quit();
    }

}
