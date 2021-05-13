package simpleTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CourseraLogin {
    @Test
    public void loginToCoursera_correctCredentials()throws InterruptedException{
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.coursera.org/");
        Thread.sleep(3000);
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
        Thread.sleep(3000);

        driver.quit();
    }
}
