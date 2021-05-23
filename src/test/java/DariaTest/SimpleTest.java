package DariaTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SimpleTest {
    private WebDriver driver;
    @BeforeMethod
    public void StartUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.udemy.com/");
        Thread.sleep(500);
    }
    @AfterMethod
    public void FinishUp (){
        driver.quit();
    }
    @Test
    public void LogInCorrectCredentials () throws InterruptedException {
        WebElement logIn = driver.findElement(By.xpath("//span[text()='Log in']"));
        Thread.sleep(500);
        logIn.click();
        Thread.sleep(500);
        WebElement Email = driver.findElement(By.xpath("//*[@id='email--1']"));
        Email.sendKeys("darialytvynenko@yahoo.com");
        Thread.sleep(500);
        WebElement Password = driver.findElement(By.xpath("//*[@id='id_password']"));
        Password.sendKeys("kazka22");
        Thread.sleep(500);
        WebElement Submit = driver.findElement(By.xpath("//*[@class='btn btn-primary ']"));
        Submit.click();
    }
    @Test
    public void LogInIncorrectCredentials () throws InterruptedException {
        WebElement logIn = driver.findElement(By.xpath("//span[text()='Log in']"));
        Thread.sleep(500);
        logIn.click();
        Thread.sleep(500);
        WebElement Email = driver.findElement(By.xpath("//*[@id='email--1']"));
        Email.sendKeys("darialytvynenko@yahoo.com");
        Thread.sleep(500);
        WebElement Password = driver.findElement(By.xpath("//*[@id='id_password']"));
        Password.sendKeys("kazka222");
        Thread.sleep(500);
        WebElement Submit = driver.findElement(By.xpath("//*[@class='btn btn-primary ']"));
        Submit.click();
    }
}
