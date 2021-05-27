package MyPageObject;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HumanLoginPage extends HumansBasePage{

    public HumanLoginPage(WebDriver driver) {
        super(driver);
//        this.driver = driver; заменили на super(driver) как в MainPage
//        wait = new WebDriverWait(driver, 10, 200); перенесли в конструктор в BasePage
    }

//    private WebDriver driver; перенесли в HumansBasePage
//    private Wait<WebDriver> wait; перенесли в HumansBasePage

//    public void open(){driver.get("https://humans.net/");}

    private WebElement getEmailField() {
        By emailBy = By.xpath("//*[@type='text']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(emailBy));
        WebElement email = driver.findElement(emailBy);
        return email;
    }

    private WebElement getPassword() {
        By passwordBy = By.xpath("//*[@type='password']");
        WebElement password = driver.findElement(passwordBy);
        return password;
    }

    private WebElement getGoon() {
        By goonBy = By.xpath("//*[@class='btn btn--size-medium btn--default login-form__submit']");
        WebElement goon = driver.findElement(goonBy);
        return goon;
    }

    public HumanLoggedPage loginToApp(String username, String password) throws InterruptedException {
        getEmailField().sendKeys(username);
        getPassword().sendKeys(password);
//        Thread.sleep(5000);
        getGoon().click();
        return new HumanLoggedPage(driver);
    }


    public boolean isLoginPage() {
        By isLoginBy = By.xpath("//*[text()='Forgot your password?']");
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(isLoginBy));
            return true;
        } catch (TimeoutException xx) {return false;}

//        WebElement isLogin = driver.findElement(isLoginBy);
//        return isLogin.isDisplayed(); уже не надоб заменяется блоком try
    }

    public void loginInvalid() throws InterruptedException{
        getEmailField().sendKeys("username");
        getPassword().sendKeys("wrongpassword");
//        Thread.sleep(5000);
//        getGoon().click();
        }

    public boolean isInvalid () {
//        By incorrectBy = By.xpath("//*[text()='Incorrect login or password']");
        By invalidBy = By.xpath("//*[text()='Invalid email or phone number is specified. Please check the entered data']");
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(invalidBy));
            return true;
        }catch (TimeoutException invalid) {return false;}
    }

    public void clearEmail() throws InterruptedException{

        getEmailField().sendKeys(Keys.RETURN);
//        Thread.sleep(5000);
        getEmailField().sendKeys(Keys.COMMAND + "A");
//        Thread.sleep(5000);
        getEmailField().sendKeys(Keys.RETURN);
//        Thread.sleep(5000);
    }

    public boolean isIncorrect() {
        By incorrectBy = By.xpath("//*[text()='Incorrect login or password']");
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(incorrectBy));
            return true;
        }catch (TimeoutException incorrect) {return false;}
        }

}


