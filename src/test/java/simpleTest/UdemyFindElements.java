package simpleTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.w3c.dom.html.HTMLInputElement;

public class UdemyFindElements {
    @Test
    public void UdemyFind() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://udemy.com/");
        Thread.sleep(2000);
        WebElement Udemy=driver.findElement(By.xpath("//*[@src='/staticx/udemy/images/v6/logo-coral.svg']"));
        Thread.sleep(0000);
        Udemy.click();
        Thread.sleep(3000);
//


        WebElement UdemyForBusiness=driver.findElement(By.xpath("//*[@src='/staticx/udemy/images/v6/logo-coral.svg']/parent::*/parent::*/div[3]/a/span"));

        Thread.sleep(1000);
        UdemyForBusiness.click();
        Thread.sleep(5000);
        WebElement back= driver.findElement(By.xpath( "//*[text()='Close']"));
        //*[@class="udlite-btn udlite-btn-medium udlite-btn-ghost udlite-heading-sm"]
        Thread.sleep(10000);
        Assert.assertTrue(Udemy.isDisplayed());
        Thread.sleep(5000);







        driver.quit();
    }
}
