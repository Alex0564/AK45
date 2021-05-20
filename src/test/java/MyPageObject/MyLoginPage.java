package MyPageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyLoginPage extends BasePage{
//    private WebDriver driver;
//    private Wait<WebDriver> wait;

    public MyLoginPage(WebDriver driver) {
//        this.driver = driver;
//        wait = new WebDriverWait(driver, 10, 200);
        super(driver);
    }
    public WebElement getEmailField(){
        //        return driver.findElement(By.xpath("//*[@type='email']"));
        By emailBy = By.xpath("//*[@type='email']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(emailBy));
        return driver.findElement(emailBy);
    }
    private WebElement getPasswordField(){
        return driver.findElement(By.cssSelector("[type='password']"));
    }
    private WebElement getLoginButton(){
        return driver.findElement(By.tagName("button"));
    }

    public MainPage loginToApp(String userName, String password){
//    public void loginToApp(String userName, String password){
//        WebElement emailField = getEmailField();
//        emailField.sendKeys(userName);
        getEmailField().sendKeys(userName);
        getPasswordField().sendKeys(password);
        getLoginButton().click();
        return new MainPage(driver);
    }
    public void open(){
        driver.get("https://bbb.testpro.io/");
    }

    public boolean isError(){
        By errorBy = By.className(("error"));
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(errorBy));
            return true;
        } catch (TimeoutException err){
            return false;
        }
    }

}
