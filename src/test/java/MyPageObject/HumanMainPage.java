package MyPageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HumanMainPage extends HumansBasePage{

    public HumanMainPage(WebDriver driver) {super(driver);}

    public void open(){driver.get("https://humans.net/");}

    public WebElement getLoginField ()throws InterruptedException{
        System.out.println("get Login field");
        Thread.sleep(5000); // Stale element here
        By loginBy = By.xpath("//*[@class='f-B f-s f-v']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(loginBy));
        WebElement login = driver.findElement(loginBy);
        return login;
    }

    public HumanLoginPage gotoLoginPage () throws InterruptedException {
        getLoginField().click();
        return new HumanLoginPage(driver);
    }

    public boolean isHumanMainPage(){
        By humansBy = By.xpath("//*[@class='y-0w']");
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(humansBy));
            return true;
        }catch (TimeoutException mmm){return false;}
    }






}
