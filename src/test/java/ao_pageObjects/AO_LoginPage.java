package ao_pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AO_LoginPage {
    private WebDriver driver;
    private Wait<WebDriver> wait;

    public AO_LoginPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 5, 200);
    }

    private WebElement getEmailField(){
        By emailFieldBY = By.xpath("//*[@type='email']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(emailFieldBY));
        return driver.findElement(emailFieldBY);
    }

    private WebElement getPasswordField(){
        return driver.findElement(By.xpath("//*[@type='password']"));
    }

    private WebElement getSubmitButton(){
        return driver.findElement(By.xpath("//*[@type='submit']"));
    }

    public AO_MainPage loginToApp(String username, String password){
        getEmailField().sendKeys(username);
        getPasswordField().sendKeys(password);
        getSubmitButton().click();
        return new AO_MainPage(driver);
    }

    public void openBaseURL(){
        driver.get("https://bbb.testpro.io/");
    }

    public boolean isError() {
        By errorBy = By.xpath("//*[@class='error']");
        try{
            wait.until(ExpectedConditions.visibilityOfElementLocated(errorBy));
            return true;
        } catch (TimeoutException te_1){
            return false;
        }
    }

}
