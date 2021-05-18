package mytests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class KoelDeletePlaylist {
    private WebDriver driver;
    private Wait<WebDriver> wait;

    @BeforeMethod
    public void starUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver,5,200);
        driver.get("https://bbb.testpro.io/");

    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }

    @Test
    public void loginToKoel_createPlaylist() {
        By emailBy = By.xpath("//*[@type='email']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(emailBy));
        WebElement email = driver.findElement(emailBy);
        WebElement password = driver.findElement(By.cssSelector("[type='password']"));
        WebElement loginButton = driver.findElement(By.tagName("button"));

        email.sendKeys("uliyax88@gmail.com");
        password.sendKeys("te$t$tudent");
        loginButton.click();

        By allSongsBy = By.xpath("//*[@href=\"#!/songs\"]");
        wait.until(ExpectedConditions.visibilityOfElementLocated(allSongsBy));
        WebElement allSongs = driver.findElement(allSongsBy);
        allSongs.click();


        WebElement song = driver.findElement(By.xpath("//*[text()='Opening Horizons (Kielokaz ID 361)']"));
        song.click();


        WebElement addToo = driver.findElement(By.xpath("//*[@class=\"btn-add-to\"]"));
        addToo.click();


        WebElement playlistName = driver.findElement(By.xpath("(//*[@required=\"required\"])[2]"));
        playlistName.sendKeys("XXXXX");
        playlistName.sendKeys(Keys.RETURN);

        By greenBy = By.xpath("//*[@class='success show']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(greenBy));
        WebElement green = driver.findElement(greenBy);
        Assert.assertTrue(green.isDisplayed());
    }
}