package pageObjectsVK77;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage  extends BasePage{

    public LoginPage(WebDriver driver) {    super(driver);}

    private WebElement getEmailField(){
        By emailBy = By.xpath("//*[@type='email']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(emailBy));
        return driver.findElement(emailBy);
    }
    private WebElement getPasswordField(){
        return driver.findElement(By.xpath("//*[@type='password']"));
    }
    private WebElement getLoginButton(){
        return driver.findElement(By.tagName("button"));
    }
    public MainPage loginToApp(String username, String password){
        // WebElement emailField = getEmailField();
        // emailField.sendKeys(username);
        getEmailField().sendKeys(username);
        getPasswordField().sendKeys(password);
        getLoginButton().click();
        return new MainPage(driver);
    }
    public void open(){
        driver.get("https://bbb.testpro.io/");
    }
    public boolean isError(){
        By errorBy = By.className("error");
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(errorBy));
            return true;
        } catch (TimeoutException err){
            return false;
        }
    }
}