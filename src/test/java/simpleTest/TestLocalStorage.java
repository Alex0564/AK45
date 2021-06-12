package simpleTest;

import helpers.TestDataGenerator;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class TestLocalStorage {
    @Test
    public void setLocalStorage(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("window-size=1400,1000");
//        options.addArguments("--headless");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(options);
        String token = TestDataGenerator.getToken().substring(7);
        driver.get("https://bbb.testpro.io");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("localStorage.setItem(arguments[0],arguments[1])","jwt-token","\""+token+"\"");

        driver.navigate().refresh();

    }
}
