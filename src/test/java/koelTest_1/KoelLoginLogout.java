package koelTest_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class KoelLoginLogout {
    private WebDriver driver;
    private Wait<WebDriver> wait;


    @BeforeMethod
    public void Start() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 3, 200);
        driver.get("https://bbb.testpro.io/");
    }

    @AfterMethod
    public void ShutDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }

    By emailField = By.xpath("//*[@type = 'email']");
    By passwordField = By.xpath("//*[@type = 'password']");
    By loginButton = By.xpath("//*[@type = 'submit']");
    By logoutButton = By.xpath("//*[@data-cy='btnLogOut']");

    @Test
    public void koelLogin_correctCredentials () {
        wait.until(ExpectedConditions.visibilityOfElementLocated(emailField));
        WebElement email = driver.findElement(emailField);
        WebElement password = driver.findElement(passwordField);
        WebElement submitLogin = driver.findElement(loginButton);

        email.sendKeys("koeluser06@testpro.io");
        password.sendKeys("te$t$tudent");
        submitLogin.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(logoutButton));
        WebElement logTrue = driver.findElement(logoutButton);
        Assert.assertTrue(logTrue.isDisplayed());

    }

    @Test
    public void koelLogout_successful () {
        wait.until(ExpectedConditions.visibilityOfElementLocated(emailField));
        WebElement email = driver.findElement(emailField);
        WebElement password = driver.findElement(passwordField);
        WebElement submitLogin = driver.findElement(loginButton);

        email.sendKeys("koeluser06@testpro.io");
        password.sendKeys("te$t$tudent");
        submitLogin.click();

        By accountInfo = By.xpath("//*[text()='koeluser06']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(accountInfo));
        WebElement submitAccountInfo = driver.findElement(accountInfo);
        submitAccountInfo.click();
        WebElement submitLogout = driver.findElement(logoutButton);
        submitLogout.click();
        By registration = By.xpath("//*[@class = 'link-add btn-add btn-reg']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(registration));
        WebElement registrationButton = driver.findElement(registration);
        Assert.assertTrue(registrationButton.isDisplayed());

    }
}
