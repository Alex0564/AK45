package pageObjectsx;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
    private WebDriver driver;
    private Wait<WebDriver> wait;

    public LoginPage(WebDriver driver){
        this.driver=driver;
        wait = new WebDriverWait(driver,5,200);
    }

    private WebElement getEmailfield(){
        By emailBy = By.xpath("//*[@type='email']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(emailBy));
        return driver.findElement(emailBy);
    }

    private WebElement getPasswordfirld(){
        return driver.findElement(By.cssSelector("[type='password']"));
    }

    private WebElement getButton(){
        return driver.findElement(By.tagName("button"));
    }

    public MainPage loginToApp(String username, String password){
        //WebElement emailField = getEmailField();
        //emailField.sendKeys(username);
        getEmailfield().sendKeys(username);
        getPasswordfirld().sendKeys(password);
        getButton().click();
        return new MainPage(driver);
    }
    public void open(){
        driver.get("https://bbb.testpro.io/");
    }
    public boolean isError(){
        try {
            By errorBy = By.className("error");
            wait.until(ExpectedConditions.visibilityOfElementLocated(errorBy));
            return true;
        }catch (TimeoutException err){
            return false;
        }
    }


}
