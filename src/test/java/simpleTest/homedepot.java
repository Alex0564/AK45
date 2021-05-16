package simpleTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class homedepot {
    private WebDriver driver;

    @Test
    public void homeDeportSearch() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.homedepot.com/");
        Thread.sleep(2000);


        WebElement enter = driver.findElement(By.xpath(
                "(//*[@class='MyAccount__label SimpleFlyout__link--bold'])[1]"));
        enter.click();
        Thread.sleep(1000);
        WebElement signIn = driver.findElement(By.xpath("(//*[@class='MyAccount__auth'])[1]"));
        signIn.click();
        Thread.sleep(1000);

        WebElement email = driver.findElement(By.xpath("//*[@class='form-input__field']"));
        WebElement password = driver.findElement(By.xpath("//*[@id='password-input-field']"));
        WebElement loginButton = driver.findElement(By.xpath("(//*[@class='bttn__content'])[1]"));

        email.sendKeys("oleksiy564@gmail.com");
        password.sendKeys("Songs-11");
        loginButton.click();
        Thread.sleep(1000);

        WebElement welkomeBack =
                driver.findElement(By.xpath
                ("//*[@class='welcomeMessage heavyText col__12-12 u--paddingNormal-top u__text-align--center']"));
        Assert.assertTrue(welkomeBack.isDisplayed());

        Thread.sleep(1000);
        driver.quit();
    }
    @Test
    public void homeDeportNoSearch() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.homedepot.com/");
        Thread.sleep(2000);


        WebElement enter = driver.findElement(By.xpath(
                "(//*[@class='MyAccount__label SimpleFlyout__link--bold'])[1]"));
        enter.click();
        Thread.sleep(1000);
        WebElement signIn = driver.findElement(By.xpath("(//*[@class='MyAccount__auth'])[1]"));
        signIn.click();
        Thread.sleep(1000);

        WebElement email = driver.findElement(By.xpath("//*[@class='form-input__field']"));
        WebElement password = driver.findElement(By.xpath("//*[@id='password-input-field']"));
        WebElement loginButton = driver.findElement(By.xpath("(//*[@class='bttn__content'])[1]"));

        email.sendKeys("oleksiy564@gmail.com");
        password.sendKeys("Songs-12");
        loginButton.click();
        Thread.sleep(1000);

        WebElement error = driver.findElement(By.xpath("//*[@class='alert-inline__message']"));
        Assert.assertTrue(error.isDisplayed());
        Thread.sleep(1000);
        driver.quit();
    }
    @Test
    public void homeDeportNewList() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.homedepot.com/");
        Thread.sleep(2000);

        WebElement enter = driver.findElement(By.xpath(
                "(//*[@class='MyAccount__label SimpleFlyout__link--bold'])[1]"));
        enter.click();
        Thread.sleep(1000);
        WebElement signIn = driver.findElement(By.xpath("(//*[@class='MyAccount__auth'])[1]"));
        signIn.click();
        Thread.sleep(1000);

        WebElement email = driver.findElement(By.xpath("//*[@class='form-input__field']"));
        WebElement password = driver.findElement(By.xpath("//*[@id='password-input-field']"));
        WebElement loginButton = driver.findElement(By.xpath("(//*[@class='bttn__content'])[1]"));

        email.sendKeys("oleksiy564@gmail.com");
        password.sendKeys("Songs-11");
        loginButton.click();
        Thread.sleep(2000);

        WebElement list = driver.findElement(By.xpath("//*[@class='SimpleFlyout__link--bold']"));
        list.click();
        Thread.sleep(1000);

        WebElement createNewList = driver.findElement(By.xpath("//*[text()='Create a New List']"));
        createNewList.click();
        Thread.sleep(1000);

        WebElement nameOfNewList = driver.findElement(By.xpath("//*[@class='form-input__field ng-untouched ng-pristine ng-invalid']"));
        nameOfNewList.sendKeys("112");
        WebElement pushForNewList = driver.findElement(By.xpath("//*[@class='bttn__content e2e__list-summary--button-create-a-list']"));
        pushForNewList.click();
        Thread.sleep(500);
        WebElement created = driver.findElement(By.xpath("//*[text()='112']"));
        Assert.assertTrue(created.isDisplayed());
        Thread.sleep(1000);

        driver.quit();


    }

}
