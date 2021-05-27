package ao_simleTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AO_KoelLogin {

    private WebDriver driver;
    private WebDriverWait wait;

    @BeforeMethod
    public void beforeMethod() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 5,200);
        driver.get("https://bbb.testpro.io/");
    }

    @AfterMethod
    public void afterMethod() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }

    @Test
    public void ao_loginToKoel_correctCredentials() {
        By emailBy = By.xpath("//*[@type='email']");
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(emailBy));
        WebElement emailField = driver.findElement(emailBy);
        WebElement passwordField = driver.findElement(By.xpath("//*[@type='password']"));
        WebElement submitButton = driver.findElement(By.xpath("//*[@type='submit']"));
        emailField.sendKeys("koeluser06@testpro.io");
        passwordField.sendKeys("te$t$tudent");
        submitButton.click();

        By resultBy = By.xpath("//*[@class='music']/h1");
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(resultBy));
        Assert.assertEquals(driver.findElement(resultBy).getText(), "YOUR MUSIC");
    }

    @Test
    public void ao_loginToKoel_incorrectCredentials() {
        By emailBy = By.xpath("//*[@type='email']");
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(emailBy));
        WebElement emailField = driver.findElement(emailBy);
        WebElement passwordField = driver.findElement(By.xpath("//*[@type='password']"));
        WebElement submitButton = driver.findElement(By.xpath("//*[@type='submit']"));
        emailField.sendKeys("koeluser06@testpro.io");
        passwordField.sendKeys("te$t$tudents");
        submitButton.click();

        By errorBy = By.xpath("//*[@class='error']");
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(errorBy));
        Assert.assertTrue(driver.findElement(errorBy).isDisplayed());

    }

    @Test
    public void ao_createPlaylistKoel_playlistCreated() {
        By emailBy = By.xpath("//*[@type='email']");
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(emailBy));
        WebElement emailField = driver.findElement(emailBy);
        WebElement passwordField = driver.findElement(By.xpath("//*[@type='password']"));
        WebElement submitButton = driver.findElement(By.xpath("//*[@type='submit']"));
        emailField.sendKeys("koeluser06@testpro.io");
        passwordField.sendKeys("te$t$tudent");
        submitButton.click();

        By createPlaylistButtonBy = By.xpath("//i[@title='Create a new playlist']");
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(createPlaylistButtonBy));
        WebElement createPlaylistButton = driver.findElement(By.xpath("//i[@title='Create a new playlist']"));
        createPlaylistButton.click();
        WebElement newPlaylistButton = driver.findElement(By.xpath("//*[text()='New Playlist']"));
        newPlaylistButton.click();
        WebElement newPlaylistInputField = driver.findElement(By.xpath("//input[@placeholder='↵ to save']"));
        newPlaylistInputField.sendKeys("AO");
        newPlaylistInputField.sendKeys(Keys.ENTER);

        By successFieldBy = By.xpath("//div[@class='success show']");
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(successFieldBy));
        Assert.assertTrue(driver.findElement(successFieldBy).isDisplayed());


    }

}
