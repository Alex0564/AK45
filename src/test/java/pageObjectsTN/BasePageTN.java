package pageObjectsTN;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePageTN {
    protected WebDriver driver;
    protected Wait<WebDriver> wait;

    public BasePageTN(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver,10,200);
    }
}