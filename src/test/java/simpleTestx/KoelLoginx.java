package simpleTestx;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class KoelLoginx {
    private WebDriver driver;
    private WebDriverWait wait;//private Wait<WebDriver> wait;
    private FluentWait<WebDriver> fluentWait;//private Wait<WebDriver> fluentWait;

    @BeforeMethod
    public void startUp(){
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


//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://bbb.testpro.io/");

    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }

    @Test
    public void loginToKoel_correctCredentials() {
        By emailBy = By.xpath("//*[@type='email']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(emailBy));
        WebElement email = driver.findElement(emailBy);
        WebElement password = driver.findElement(By.cssSelector("[type='password']"));
        WebElement login = driver.findElement(By.tagName("button"));

        email.sendKeys("koeluser06@testpro.io");
        password.sendKeys("te$t$tudent");
        login.click();


        By homeBy = By.cssSelector(".home");
        wait.until(ExpectedConditions.visibilityOfElementLocated(homeBy));
        WebElement home = driver.findElement(homeBy); //*[@class = 'home active']
        Assert.assertTrue(home.isDisplayed());


    }

    @Test
    public void loginToKoel_incorrectCredentials()  {
        By emailBy = By.xpath("//*[@type='email']");
        fluentWait.until(x->x.findElement(emailBy).isDisplayed());

        WebElement email = driver.findElement(emailBy);
        WebElement password = driver.findElement(By.cssSelector("[type='password']"));
        WebElement login = driver.findElement(By.tagName("button"));

        email.sendKeys("koeluser06@testpro.io");
        password.sendKeys("wrongPassword");
        login.click();



        By errorBy = By.cssSelector(".error");
        fluentWait.until(x->x.findElement(errorBy).isDisplayed());
        WebElement wrongLoginForm = driver.findElement(errorBy); //*[@class = 'home active']
        Assert.assertTrue(wrongLoginForm.isDisplayed());

    }

    @Test
    public void loginToKoel_createPlaylist() {
        By emailBy = By.xpath("//*[@type='email']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(emailBy));
        WebElement email = driver.findElement(emailBy);
        WebElement password = driver.findElement(By.cssSelector("[type='password']"));
        WebElement login = driver.findElement(By.tagName("button"));

        email.sendKeys("koeluser06@testpro.io");
        password.sendKeys("te$t$tudent");
        login.click();

        By plus_by_button = By.xpath("//*[@class='fa fa-plus-circle control create']");
        wait.until(ExpectedConditions.elementToBeClickable(plus_by_button));
        WebElement plus_button = driver.findElement(plus_by_button);
        plus_button.click();


        WebElement New_Playlist = driver.findElement(By.xpath("//*[text()='New Playlist']"));
        New_Playlist.click();


        WebElement Text_Field = driver.findElement(By.xpath("//*[@class='create']/input"));
        Text_Field.sendKeys("XXXX");
        Text_Field.sendKeys(Keys.RETURN);


        By greenBy = By.xpath("//*[@class='success show']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(greenBy));
        WebElement green = driver.findElement(greenBy);
        Assert.assertTrue(green.isDisplayed());


    }
}
