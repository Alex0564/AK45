package simpleTest;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DreamUp {
    @Test
    public void DreamUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://udemy.com/");
        Thread.sleep(4000);
        WebElement magnifyingglass=driver.findElement(By.xpath("(//*[contains(@class,'udlite-icon udlite-icon-medium udlite-icon-color-neutral')])[3]"));
//
        Thread.sleep(2000);
        magnifyingglass.click();
        Thread.sleep(2000);

        WebElement HFS= driver.findElement(By.xpath("(//*[contains(@class,'udlite-icon udlite-icon-medium udlite-icon-color-neutral')])[3]/parent::*/parent::*/parent::*/parent::*/h1"));
//        (//*[contains(@class,'udlite-icon udlite-icon-medium udlite-icon-color-neutral')])[3]/parent::*/parent::*/parent::*/parent::*/h1

        Thread.sleep(5000);

        WebElement Python=driver.findElement(By.xpath("//*[@class='udlite-nav-button-container udlite-nav-button-container-active tabs--nav-button-container--P4D9D tabs--active--2rPuV']"));
        Thread.sleep(2000);
//
//
        WebElement World=driver.findElement(By.xpath("//*[@class='headline__main-text udlite-heading-xl']"));
        Thread.sleep(2000);
//
//
        WebElement ExpPython=driver.findElement(By.xpath("(//*[@class='udlite-btn udlite-btn-medium udlite-btn-secondary udlite-heading-sm'])[2]"));
        Thread.sleep(2000);

        WebElement Draw=driver.findElement(By.xpath("(//*[@class='udlite-btn udlite-btn-medium udlite-btn-secondary udlite-heading-sm'])[2]/parent::*/parent::*/parent::*/parent::*/parent::*/div[1]/div[1]/div[1]/div[7]"));
        Thread.sleep(2000);
        driver.quit();

}                                                                             ;
}
