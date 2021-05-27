package simpleTest;

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

public class KoelWithoutThreadSleep {
        private WebDriver driver;
        private WebDriverWait wait;
        private FluentWait<WebDriver> fluentWait;

        @BeforeMethod
        public void starUp() throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
            driver = new ChromeDriver();
            wait = new WebDriverWait(driver,5, 200);
            fluentWait = new FluentWait<>(driver)
                    .pollingEvery(Duration.ofMillis(200))
                    .withTimeout(Duration.ofSeconds(5))
                    .ignoring(NoSuchElementException.class)
                    .ignoring(ElementClickInterceptedException.class)
                    .ignoring(ElementNotInteractableException.class)
                    .ignoring(StaleElementReferenceException.class);


//            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.get("https://bbb.testpro.io/");

        }
        @AfterMethod
        public void tearDown() throws InterruptedException {
            Thread.sleep(3000);
            driver.quit();
        }
        @Test
        public void loginToKoel_correctCredentials() throws InterruptedException {
            By emailBy = By.xpath("//*[@type='email']");
            wait.until(ExpectedConditions.visibilityOfElementLocated(emailBy));
            WebElement email = driver.findElement(emailBy);
            WebElement password = driver.findElement(By.cssSelector("[type='password']"));
            WebElement loginButton = driver.findElement(By.tagName("button"));

            email.sendKeys("olgaprice77@gmail.com");
            password.sendKeys("te$t$tudent");
            loginButton.click();


            By homeBy = By.cssSelector(".home");
            wait.until(ExpectedConditions.visibilityOfElementLocated(homeBy));
            WebElement home = driver.findElement(By.cssSelector(".home")); //*[@class= 'home active']
            Assert.assertTrue(home.isDisplayed());

        }
        @Test
        public void loginToKoel_incorrectCredentials() throws InterruptedException {
            By emailBy = By.xpath("//*[@type='email']");
            fluentWait.until(x->x.findElement(emailBy).isDisplayed());

            WebElement email = driver.findElement(By.xpath("//*[@type='email']"));
            WebElement password = driver.findElement(By.cssSelector("[type='password']"));
            WebElement loginButton = driver.findElement(By.tagName("button"));

            email.sendKeys("olgaprice77@gmail.com");
            password.sendKeys("wrongPassword");
            loginButton.click();


            By errorBy = By.cssSelector(".error");
            fluentWait.until(x->x.findElement(errorBy).isDisplayed());
            WebElement home = driver.findElement(errorBy); //*[@class= 'home active']
            Assert.assertTrue(home.isDisplayed());

        }
        @Test
        public void loginToKoel_creatPlaylist() throws InterruptedException {
            By emailBy = By.xpath("//*[@type='email']");
            wait.until(ExpectedConditions.visibilityOfElementLocated(emailBy));

            WebElement email = driver.findElement(By.xpath("//*[@type='email']"));
            WebElement password = driver.findElement(By.cssSelector("[type='password']"));
            WebElement loginButton = driver.findElement(By.tagName("button"));

            email.sendKeys("olgaprice77@gmail.com");
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

            By successeBy = By.xpath("//*[@class='success show']");
            wait.until(ExpectedConditions.visibilityOfElementLocated(successeBy));

            WebElement green = driver.findElement(successeBy);
            Assert.assertTrue(green.isDisplayed());

        }

}


