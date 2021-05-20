package MyPageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPageFactory {
    private WebDriver driver;

    public LoginPageFactory(WebDriver driver){
        this.driver = driver;
//        PageFactory.initElements(driver,this);
        AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 5);
        PageFactory.initElements(factory, this);
    }

    @FindBy(css = "[type='email']")
    private WebElement email;

    @FindBy(xpath = "//*[@type='password']")
    private WebElement passwprd;

    @FindBy(tagName = "button")
    private WebElement loginButton;

    @FindBy(className = "error")
    private WebElement error;

    public void open(String url){
        driver.get(url);
    }

    public boolean isErrorFrame(){
//        By errorBy = By.className(("error"));
        try {
//            wait.until(ExpectedConditions.visibilityOfElementLocated(errorBy));
            return error.isDisplayed();
        } catch (TimeoutException err){
            return false;
        }
    }
    public MainPage loginToApp(String userName, String password){
        email.sendKeys(userName);
        this.passwprd.sendKeys(password);
        loginButton.click();
        return new MainPage(driver);
    }

}
