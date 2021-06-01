package mySimpleTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CourseraLogin {
    private WebDriver driver;

    @BeforeMethod
    public void startUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.coursera.org/");
        Thread.sleep(3000);}

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }

    @Test
    public void loginToCoursera_correctCredentials()throws InterruptedException{

        WebElement exit = driver.findElement(By.xpath("//*[text()='Войти']"));
        exit.click();
        Thread.sleep(3000);
        WebElement email = driver.findElement(By.xpath("//*[@type='email']"));
        WebElement password = driver.findElement(By.cssSelector("[type='password']"));
        WebElement loginButton = driver.findElement(By.xpath("(//*[text()='Войти'])[2]"));

        email.sendKeys("oleksiy564@gmail.com");
        password.sendKeys("intell10");
        Thread.sleep(3000);
        loginButton.click();

    }
}
