package MyPageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HumanLoginPage {
    public HumanLoginPage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, 10,200);
    }
    private WebDriver driver;
    private Wait<WebDriver> wait;

//    public void open(){driver.get("https://humans.net/");}

    private WebElement getEmailField(){
        By emailBy = By.xpath("//*[@type='text']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(emailBy));
        WebElement email = driver.findElement(emailBy);
        return email;
    }
    private WebElement getPassword(){
        By passwordBy = By.xpath("//*[@type='password']");
        WebElement password = driver.findElement(passwordBy);
        return password;
    }
    private WebElement getGoon(){
        By goonBy = By.xpath("//*[@class='btn btn--size-medium btn--default login-form__submit']");
        WebElement goon = driver.findElement(goonBy);
        return goon;
    }
    public void loginToApp(String username, String password){
        getEmailField().sendKeys(username);
        getPassword().sendKeys(password);
        getGoon().click();
    }


}
