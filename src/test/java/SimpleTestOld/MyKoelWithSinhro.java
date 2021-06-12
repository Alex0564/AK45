package SimpleTestOld;

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

public class MyKoelWithSinhro {
    private WebDriver driver;
    private WebDriverWait wait;
    private FluentWait<WebDriver> fluentWait;
    @BeforeMethod
    public void startUp(){
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 5, 200);
        fluentWait = new FluentWait<>(driver)
                .pollingEvery(Duration.ofMillis(200))
                .withTimeout(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class)
                .ignoring(ElementClickInterceptedException.class)
                .ignoring(ElementNotInteractableException.class)
                .ignoring(StaleElementReferenceException.class);
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://bbb.testpro.io/");
    }
    @AfterMethod
    public void tearDown()throws InterruptedException{
        Thread.sleep(5000);
        driver.quit();
    }
    @Test
    public void loginToKoel_correctCredentials()  {
//        System.setProperty("webdriver.chrome.driver", "chromedriver");
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://bbb.testpro.io/");
//        Thread.sleep(1000);

//        System.out.println("I am here - before test");

        By emailBy = By.xpath("//*[@type='email']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(emailBy));

        WebElement myEmail = driver.findElement(emailBy);
        WebElement myPassword = driver.findElement(By.cssSelector("[type='password']"));
        WebElement myLoginButton = driver.findElement(By.tagName("button"));

//        System.out.println("Found elements");

        myEmail.sendKeys("oleksiy564@gmail.com");
        myPassword.sendKeys("te$t$tudent");
        myLoginButton.click();

        By homeBy = By.cssSelector(".home");
        wait.until(ExpectedConditions.visibilityOfElementLocated(homeBy));
        WebElement home = driver.findElement(homeBy); //*[@class = 'home active']
        Assert.assertTrue(home.isDisplayed());
//        Thread.sleep(3000);
//        driver.quit();
    }
    @Test
    public void loginToKoel_incorrectCredentials()  {
//        System.setProperty("webdriver.chrome.driver", "chromedriver");
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://bbb.testpro.io/");
//        Thread.sleep(1000);

        By emailBy = By.xpath("//*[@type='email']");
        fluentWait.until(x->x.findElement(emailBy));

        WebElement myEmail = driver.findElement(emailBy);
        WebElement myPassword = driver.findElement(By.cssSelector("[type='password']"));
        WebElement myLoginButton = driver.findElement(By.tagName("button"));

        myEmail.sendKeys("oleksiy564@gmail.com");
        myPassword.sendKeys("wrongPassword");
        myLoginButton.click();

        By erreoBy = By.cssSelector(".error");
        fluentWait.until(x->x.findElement(erreoBy));
        WebElement home = driver.findElement(erreoBy); //*[@class = 'home active']
        Assert.assertTrue(home.isDisplayed());
//        Thread.sleep(3000);
//        driver.quit();
    }
    @Test
    public void newPlayList()throws InterruptedException {
//        System.out.println("I am here - before Play list test");

        By emailBy = By.xpath("//*[@type='email']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(emailBy));

        WebElement myEmail = driver.findElement(emailBy);
        WebElement myPassword = driver.findElement(By.cssSelector("[type='password']"));
        WebElement myLoginButton = driver.findElement(By.tagName("button"));

//        System.out.println("Found elements for play list test");

        myEmail.sendKeys("oleksiy564@gmail.com");
        myPassword.sendKeys("te$t$tudent");
        myLoginButton.click();

        By buttonBy = By.xpath("//*[@class='fa fa-plus-circle control create']");
        wait.until(ExpectedConditions.elementToBeClickable(buttonBy));
        WebElement plusButton = driver.findElement(buttonBy);
        plusButton.click();

        WebElement newList = driver.findElement(By.xpath("//*[text()='New Playlist']"));
        newList.click();
        WebElement textField = driver.findElement(By.xpath("//*[@class='create']/input"));
        textField.sendKeys("My new list");
        textField.sendKeys(Keys.RETURN);

        By greenBy = By.xpath("//*[@class='success show']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(greenBy));
        WebElement green = driver.findElement(greenBy);
        Assert.assertTrue(green.isDisplayed());

    }

}
