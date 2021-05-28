package simpleTest;

import net.bytebuddy.asm.Advice;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class KoelLoginA {

   private WebDriver driver;
   private Wait<WebDriver> wait;
   private Wait<WebDriver> fluentWait;
    @BeforeMethod
        public void starUp()  {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver,5,200);
        fluentWait = new FluentWait<>(driver)
                .pollingEvery(Duration.ofMillis(200))
                .withTimeout(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class)
                .ignoring(ElementClickInterceptedException.class)
                .ignoring(ElementNotInteractableException.class)
                .ignoring(StaleElementReferenceException.class);





   //     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://bbb.testpro.io/");
    }
    @AfterMethod
    public void tearDown()  {

        driver.quit();
    }

    @Test
    public void loginToKoel_correctCredentials()  {
        By emailBy = By.xpath("//*[@type='email']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(emailBy));
        WebElement email = driver.findElement(emailBy);
        WebElement password = driver.findElement(By.xpath("//*[@type='password']"));
        WebElement loginButton = driver.findElement(By.tagName("button"));

        email.sendKeys("timur895289@gmail.com");
        password.sendKeys("te$t$tudent");
        loginButton.click();

        By homeBy = By.cssSelector(".home");
        wait.until(ExpectedConditions.visibilityOfElementLocated(homeBy));
        WebElement home = driver.findElement(homeBy);
        Assert.assertTrue(home.isDisplayed());

    }
    @Test
    public void loginToKoel_incorrectCredentials() {
        By emailBy = By.xpath("//*[@type='email']");
        fluentWait.until(x->x.findElement(emailBy).isDisplayed());
        WebElement email = driver.findElement(By.xpath("//*[@type='email']"));
        WebElement password = driver.findElement(By.xpath("//*[@type='password']"));
        WebElement loginButton = driver.findElement(By.tagName("button"));

        email.sendKeys("timur895289@gmail.com");
        password.sendKeys("wrongPassword");
        loginButton.click();

        By errorBy = By.cssSelector(".error");
        fluentWait.until(x->x.findElement(errorBy).isDisplayed());
        WebElement home = driver.findElement(errorBy);
        Assert.assertTrue(home.isDisplayed());
    }
    @Test
    public void loginToKoel_createPlaylist() {
        By emailBy = By.xpath("//*[@type='email']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(emailBy));

        WebElement email = driver.findElement(emailBy);
        WebElement password = driver.findElement(By.xpath("//*[@type='password']"));
        WebElement loginButton = driver.findElement(By.tagName("button"));


        email.sendKeys("timur895289@gmail.com");
        password.sendKeys("te$t$tudent");
        loginButton.click();

       By plusButtonBy = By.xpath("//*[@class='fa fa-plus-circle control create']");
       wait.until(ExpectedConditions.elementToBeClickable(plusButtonBy));

        WebElement plusButton = driver.findElement(plusButtonBy);
        plusButton.click();


        WebElement newPlaylist = driver.findElement(By.xpath("//*[text()='New Playlist']"));
        newPlaylist.click();
        WebElement textField = driver.findElement(By.xpath("//*[@class='create']/input"));
        textField.sendKeys("XXXX");
        textField.sendKeys(Keys.RETURN);
        By successBy= By.xpath("//*[@class='success show']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(successBy));

        WebElement green = driver.findElement(successBy);
        Assert.assertTrue(green.isDisplayed());


    }

}