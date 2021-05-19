package MyPageObject;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage {
    private WebDriver driver;
    private Wait<WebDriver> wait;

    public MainPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 10, 200);
    }

    private WebElement getPlusButton(){
        By buttonBy = By.xpath("//*[@class='fa fa-plus-circle control create']");
        wait.until(ExpectedConditions.elementToBeClickable(buttonBy));
        return driver.findElement(buttonBy);
    }

    private WebElement getNewPlayListItem(){
        return driver.findElement(By.xpath("//*[text()='New Playlist']"));
    }

    private WebElement getEditPlayListField(){
        return driver.findElement(By.xpath("//*[@class='create']/input"));
    }

    public boolean isMainPage() {
        By homeBy = By.className("home");
//        wait.until(ExpectedConditions.visibilityOfElementLocated(homeBy));
//        return driver.findElement(homeBy).isDisplayed();
        try{ wait.until(ExpectedConditions.visibilityOfElementLocated(homeBy));
            return true; }
        catch (TimeoutException xx) {return false;}
    }

    public String createdPlayList (String playListName){
        String playListId = "";
        getPlusButton().click();
        getNewPlayListItem().click();
        getEditPlayListField().sendKeys(playListName);
        getEditPlayListField().sendKeys(Keys.RETURN);

        return playListId;
    }

}
