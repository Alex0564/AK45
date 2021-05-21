package pageObjectsIuliia;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePageI {
    protected WebDriver driver;
    protected Wait<WebDriver> wait;

    public BasePageI(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver,10,200);
    }
}
