package KoelLogInUmida;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class KoelLogInUmida {
    private WebDriver driver;

    public KoelLogInUmida(WebDriver driver) {
        this.driver = driver;
    }

    @BeforeMethod
    public void startUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver1.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://bbb.testpro.io/");
        Thread.sleep(2000);
    }

    @Test
    public void logInToKoel(){
        WebElement email  = driver.findElement(By.xpath("//*[@type='email']"));
        WebElement password = driver.findElement(By.xpath("//*[@type='password']"));
        WebElement logInButton = driver.findElement(By.tagName("button"));

        email.sendKeys("umida.kaxarova@bk.ru");
        password.sendKeys("te$t$tudent");
        logInButton.click();
    }




}
