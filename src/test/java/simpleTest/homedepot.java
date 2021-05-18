package simpleTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class homedepot {
    private WebDriver driver;
    private WebDriverWait wait;

    @BeforeMethod
    public void startUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 5, 200);

//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://www.homedepot.com/");
    }


    @AfterMethod
    public void tearDown() {
//        Thread.sleep(500);
        driver.quit();
    }
    @Test
    public void homeDeportSearch()  {
//        System.setProperty("webdriver.chrome.driver", "chromedriver");
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://www.homedepot.com/");
//        Thread.sleep(2000);


        By enterBy = By.xpath(
                "(//*[@class='MyAccount__label SimpleFlyout__link--bold'])[1]");
        wait.until(ExpectedConditions.visibilityOfElementLocated(enterBy));

        WebElement enter = driver.findElement(enterBy);
        enter.click();

        By signInBy = By.xpath("(//*[@class='MyAccount__auth'])[1]");
        wait.until(ExpectedConditions.visibilityOfElementLocated(signInBy));

//        WebElement signIn = driver.findElement(signInBy);
//        signIn.click();
        driver.findElement(signInBy).click();

        By emailBy = By.xpath("//*[@class='form-input__field']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(emailBy));

        WebElement email = driver.findElement(emailBy);
        WebElement password = driver.findElement(By.xpath("//*[@id='password-input-field']"));
        WebElement loginButton = driver.findElement(By.xpath("(//*[@class='bttn__content'])[1]"));

        email.sendKeys("oleksiy564@gmail.com");
        password.sendKeys("Songs-11");
        loginButton.click();
//        Thread.sleep(1000);

        By welkomeBy = By.xpath
                ("//*[@class='welcomeMessage heavyText col__12-12 u--paddingNormal-top u__text-align--center']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(welkomeBy));
        WebElement welkomeBack = driver.findElement(welkomeBy);
        Assert.assertTrue(welkomeBack.isDisplayed());

//        Thread.sleep(1000);
//        driver.quit();
    }
    @Test
    public void homeDeportNoSearch()  {
//        System.setProperty("webdriver.chrome.driver", "chromedriver");
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://www.homedepot.com/");
//        Thread.sleep(2000);


        WebElement enter = driver.findElement(By.xpath(
                "(//*[@class='MyAccount__label SimpleFlyout__link--bold'])[1]"));
        enter.click();

        WebElement signIn = driver.findElement(By.xpath("(//*[@class='MyAccount__auth'])[1]"));
        signIn.click();


        WebElement email = driver.findElement(By.xpath("//*[@class='form-input__field']"));
        WebElement password = driver.findElement(By.xpath("//*[@id='password-input-field']"));
        WebElement loginButton = driver.findElement(By.xpath("(//*[@class='bttn__content'])[1]"));

        email.sendKeys("oleksiy564@gmail.com");
        password.sendKeys("Songs-12");
        loginButton.click();


        WebElement error = driver.findElement(By.xpath("//*[@class='alert-inline__message']"));
        Assert.assertTrue(error.isDisplayed());
//        Thread.sleep(1000);
//        driver.quit();
    }
    @Test
    public void homeDeportNewList() throws InterruptedException {
//        System.setProperty("webdriver.chrome.driver", "chromedriver");
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://www.homedepot.com/");
//        Thread.sleep(5000);

        WebElement enter = driver.findElement(By.xpath(
                "(//*[@class='MyAccount__label SimpleFlyout__link--bold'])[1]"));
        enter.click();

        WebElement signIn = driver.findElement(By.xpath("(//*[@class='MyAccount__auth'])[1]"));
        signIn.click();


        WebElement email = driver.findElement(By.xpath("//*[@class='form-input__field']"));
        WebElement password = driver.findElement(By.xpath("//*[@id='password-input-field']"));
        WebElement loginButton = driver.findElement(By.xpath("(//*[@class='bttn__content'])[1]"));

        email.sendKeys("oleksiy564@gmail.com");
        password.sendKeys("Songs-11");
        loginButton.click();


        WebElement list = driver.findElement(By.xpath("//*[@class='SimpleFlyout__link--bold']"));
        list.click();


        WebElement createNewList = driver.findElement(By.xpath("//*[text()='Create a New List']"));
        createNewList.click();


        WebElement nameOfNewList = driver.findElement(By.xpath("//*[@class='form-input__field ng-untouched ng-pristine ng-invalid']"));
        nameOfNewList.sendKeys("4rt");
        WebElement pushForNewList = driver.findElement(By.xpath("//*[@class='bttn__content e2e__list-summary--button-create-a-list']"));
        pushForNewList.click();


        WebElement created = driver.findElement(By.xpath("//*[@class='alert-inline_message']"));
        WebElement listCreated = driver.findElement(By.xpath("//*[@class='alert-inline_title createlist_word--break'"));
        WebElement creatingList = driver.findElement(By.xpath("//*[text()='alert-intime'"));
        WebElement createedNewList = driver.findElement(By.xpath("//*[@class='mylist--spinner_bg']"));
//        Assert.assertTrue(created.isDisplayed());
//        Assert.assertTrue(listCreated.isDisplayed());
        Assert.assertTrue(createedNewList.isDisplayed());
//        Thread.sleep(5000);
//
//        driver.quit();


    }

}
