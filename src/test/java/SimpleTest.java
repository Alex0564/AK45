import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SimpleTest {
    @Test
    public void udemySearch() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://udemy.com");
        WebElement buttonLearnPython = driver.findElement(By.xpath("//*[@href=\"/sitemap/\"]"));
        buttonLearnPython.click();
        Thread.sleep(2000);

        WebElement result = driver.findElement(By.xpath("//h1"));
        Assert.assertEquals("Sitemap",result.getText());

        Thread.sleep(5000);
        driver.quit();



    }
}
