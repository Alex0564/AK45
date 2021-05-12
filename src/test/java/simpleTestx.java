import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class simpleTestx {
   @Test
   public void udemySearch() throws InterruptedException {
       System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
       WebDriver driver = new ChromeDriver();
       driver.get("https://udemy.com");

       WebElement searchfield = driver.findElement(By.xpath("//*[@placeholder='Search for anything']"));
       searchfield.sendKeys("Python");
       Thread.sleep(3000);
       searchfield.sendKeys(Keys.ENTER);

       Thread.sleep(3000);
       WebElement result = driver.findElement(By.xpath("//*[text()='10,000 results for “python”']"));
       Assert.assertEquals("10,000 results for “python”", result.getText());



       driver.quit();
   }

}
