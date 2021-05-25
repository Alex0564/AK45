package MyPageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HumanMainPage {
    public HumanMainPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 10,200);
    }

    private WebDriver driver;
    private Wait<WebDriver> wait;

    public void open(){driver.get("https://humans.net/");}

    public WebElement getLoginField (){
        By loginBy = By.xpath("//*[@class='f-B f-s f-v']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(loginBy));
        WebElement login = driver.findElement(loginBy);
        return login;
    }
    public HumanLoginPage gotoLoginPage () throws InterruptedException {
        getLoginField().click();
//        Thread.sleep(2000);
        return new HumanLoginPage(driver);
    }



}
