package mytests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class KoelTests {
    private WebDriver driver;

    @BeforeMethod
    public void starUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://bbb.testpro.io/");
        Thread.sleep(1000);
    }
    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(1000);
        driver.quit();
    }
    @Test
    public void loginToKoel_correctCredentials() throws InterruptedException {
        WebElement email = driver.findElement(By.xpath("//*[@type='email']"));
        WebElement password = driver.findElement(By.cssSelector("[type='password']"));
        WebElement loginButton = driver.findElement(By.tagName("button"));

        email.sendKeys("uliyax88@gmail.com");
        password.sendKeys("te$t$tudent");
        loginButton.click();

        Thread.sleep(1000);

        WebElement allSongs = driver.findElement(By.xpath("//*[@href=\"#!/songs\"]"));
        allSongs.click();

        Thread.sleep(1000);

        WebElement song = driver.findElement(By.xpath("//*[text()='Opening Horizons (Kielokaz ID 361)']"));
        song.click();

        Thread.sleep(1000);

        WebElement addToo = driver.findElement(By.xpath("//*[@class=\"btn-add-to\"]"));
        addToo.click();

        Thread.sleep(1000);

        WebElement playlistName = driver.findElement(By.xpath("(//*[@required=\"required\"])[2]"));
        playlistName.sendKeys("XXXXX");
        playlistName.sendKeys(Keys.RETURN);
        Thread.sleep(1000);

        WebElement green = driver.findElement(By.xpath("//*[@class='success show']"));
        Assert.assertTrue(green.isDisplayed());








    }
}
