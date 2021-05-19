package hw_koelPlaylistCreated;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class KoelLoginPage {

    private WebDriver driver;
    private Wait<WebDriver> wait;

    public KoelLoginPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 5,200);
    }

    private WebElement getEmailField() {
        By emailBy = By.xpath("//*[@type='email']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(emailBy));
        return driver.findElement(emailBy);
    }

    private WebElement getPasswordField() {
        return driver.findElement(By.xpath("//*[@type='password']"));
    }

    private WebElement getLoginButton() {
        return driver.findElement(By.xpath("//*[@type = 'submit']"));
    }

    public KoelMainPage loginToApp(String username, String password) {
        getEmailField().sendKeys(username);
        getPasswordField().sendKeys(password);
        getLoginButton().click();
        return new KoelMainPage(driver);
    }

    public void open(){
        driver.get("https://bbb.testpro.io/");
    }
}
