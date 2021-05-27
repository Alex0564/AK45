package homework.myPageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePageMine {
    protected WebDriver driver;
    protected Wait<WebDriver> wait;

    public BasePageMine(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver,10,200);
    }
}
