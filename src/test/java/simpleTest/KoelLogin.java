package simpleTest;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class KoelLogin {
    private WebDriver driver;
    private Wait<WebDriver> wait;
    private Wait<WebDriver> fluentWait;

    @BeforeMethod
    public void startUp() {
        System.setProperty("webserver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 5, 200);
        fluentWait = new FluentWait<>(driver)
                .pollingEvery(Duration.ofMillis(200))
                .withTimeout(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class)
                .ignoring(ElementClickInterceptedException.class)
                .ignoring(ElementNotInteractableException.class)
                .ignoring(StaleElementReferenceException.class);

//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); //waiting each element, to long
        driver.get("https://bbb.testpro.io");
//        Thread.sleep(1000);
    }

    @AfterMethod
    public void tearDown() throws InterruptedException{
        Thread.sleep(3000);
        driver.quit();
    }

    @Test
    public void loginToKoel_correctCredentials() {
//        System.setProperty("webserver.chrome.driver", "chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://bbb.testpro.io");
//        Thread.sleep(1000);
        By emailBy = By.xpath("//*[@type='email']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(emailBy));
        WebElement email = driver.findElement(emailBy);
        WebElement pass = driver.findElement(By.xpath("//*[@type='password']"));
        WebElement loginButton = driver.findElement(By.tagName("button"));

        email.sendKeys("koeluser06@testpro.io");
        pass.sendKeys("te$t$tudent");
        loginButton.click();

        By homeBy = By.cssSelector(".home");
//        Thread.sleep(2000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(homeBy));
        WebElement home = driver.findElement(homeBy); //*[@class = 'home active']
//        Assert.assertFalse(home.isDisplayed());
        Assert.assertTrue(home.isDisplayed());

//        Thread.sleep(3000);
//        driver.quit();
    }
    @Test
    public void loginToKoel_incorrectCredentials() {
        By emailBy = By.xpath("//*[@type='email']");
        fluentWait.until(x->x.findElement(emailBy).isDisplayed());
//        System.setProperty("webserver.chrome.driver", "chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://bbb.testpro.io");
//        Thread.sleep(1000);
        WebElement email = driver.findElement(By.xpath("//*[@type='email']"));
        WebElement pass = driver.findElement(By.xpath("//*[@type='password']"));
        WebElement loginButton = driver.findElement(By.tagName("button"));

        email.sendKeys("koeluser06@testpro.io");
        pass.sendKeys("wrongpassword");
        loginButton.click();

//        Thread.sleep(500);
        By errorBy = By.cssSelector(".error");
        fluentWait.until(x->x.findElement(errorBy).isDisplayed());
        WebElement home = driver.findElement(errorBy); //*[@class = 'home active']
//        Assert.assertFalse(home.isDisplayed());
        Assert.assertTrue(home.isDisplayed());

//        Thread.sleep(3000);
//        driver.quit();
    }
    @Test
    public void loginToKoel_createPlaylist() {
        By emailBy = By.xpath("//*[@type='email']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(emailBy));
        WebElement email = driver.findElement(emailBy);
        WebElement pass = driver.findElement(By.xpath("//*[@type='password']"));
        WebElement loginButton = driver.findElement(By.tagName("button"));

        email.sendKeys("koeluser06@testpro.io");
        pass.sendKeys("te$t$tudent");
        loginButton.click();

//        Thread.sleep(2000);
        By plusButtonBy = By.xpath("//*[@class='fa fa-plus-circle control create']");
        wait.until(ExpectedConditions.elementToBeClickable(plusButtonBy));
        WebElement plusButton = driver.findElement(plusButtonBy);
        plusButton.click();
        WebElement newPlaylist = driver.findElement(By.xpath("//*[text()='New Playlist']"));
        newPlaylist.click();
        WebElement textField = driver.findElement(By.xpath("//*[@class='create']/input"));
        textField.sendKeys("newList");
        textField.sendKeys(Keys.RETURN);
//        Thread.sleep(200);
        By successBy = By.xpath("//*[@class='success show']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(successBy));
        WebElement green = driver.findElement(successBy);
        Assert.assertTrue(green.isDisplayed());
    }

}
