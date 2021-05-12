import org.testng.Assert;
import org.testng.annotations.Test;

public class simpleTest {
    @Test
    public void  udemySearch(){
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = Chrome Driver();

        driver.get("https://udemy.com");

        WebElement searchField = driver.findElement(By.xpath("//*[@name='q'])[2]"));
        serachFiels.sendKeys("Java");
        Thread.sleep(5000);
        searchField.sendKeys(Keys.ENTER);

        Thread.sleep(5000);
        WebElement result = driver.findElement(By.tagname("h1"));
        Assert.assertEquals("10000 results for "java"",result.getText());

        driver.quit();
    }

}
