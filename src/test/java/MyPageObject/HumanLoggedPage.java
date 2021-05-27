package MyPageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HumanLoggedPage extends HumansBasePage{


    public HumanLoggedPage(WebDriver driver) {
        super(driver);
//        this.driver = driver;заменили на super(driver) как в MainPage
//        wait = new WebDriverWait(driver, 10, 200); перенесли в конструктор в BasePage
    }

//    private WebDriver driver; перенесли в HumansBasePage
//    private Wait<WebDriver> wait; перенесли в HumansBasePage

    public boolean isLoggedPage() {
        By myprofileBy = By.xpath("//*[@class='D-0L']");
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(myprofileBy));
            return true;
        } catch (TimeoutException cc){return false;}
    }

    public void humburger(){
        By humburgerBy = By.xpath("//*[@class='hamburger-box']");
        WebElement humburger = driver.findElement(humburgerBy);
        Actions action = new Actions(driver);
        action.moveToElement(humburger);
        action.perform();
    }
    public HumanMainPage logout (){
        By logoutBy = By.xpath("//*[text()='Logout']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(logoutBy));
        driver.findElement(logoutBy).click();
        return new HumanMainPage(driver);
    }

}
