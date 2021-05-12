import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class simpleTest {
    @Test
    public void udemySearch() throws  InterruptedException {
        System.setProperty("webserver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://udemy.com");

        WebElement searchField = driver.findElement(By.xpath(""));
        searchField.sendKeys("Java");
        Thread.sleep(2000);
        searchField.sendKeys(Keys.ENTER);

        Thread.sleep(2000);
        WebElement result = driver.findElement(By.tagName("h1"));


        Thread.sleep(5000);
        driver.quit();


    }
}
