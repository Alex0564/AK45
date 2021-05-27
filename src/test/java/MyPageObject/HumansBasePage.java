package MyPageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HumansBasePage {
    protected WebDriver driver;
    protected Wait<WebDriver> wait;

    public HumansBasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 10,200);
    }
}
