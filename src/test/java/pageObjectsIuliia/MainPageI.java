package pageObjectsIuliia;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class MainPageI {
    private WebDriver driver;
    private Wait<WebDriver> wait;

    public MainPageI(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver,10,200);
    }

    public boolean isMain() {
        By homeBy = By.className("home");
        try{
            wait.until(ExpectedConditions.visibilityOfElementLocated(homeBy));
            return true;
        } catch (TimeoutException xx){
            return false;
        }
    }

    private WebElement getPlusButton(){
        By plusButtonBy = By.xpath("//*[@class='fa fa-plus-circle control create']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(plusButtonBy));
        return driver.findElement(plusButtonBy);
    }
    private WebElement getNewPlaylist(){
        return driver.findElement(By.xpath("//*[text()='New Playlist']"));
    }
    private WebElement getTextField(){
        return driver.findElement(By.xpath("//*[@class='create']/input"));
    }


    public String createPlaylist(String playlistName){
        String playlistId = "";
        getPlusButton().click();
        getNewPlaylist().click();
        getTextField().sendKeys("XXXX");
        getTextField().sendKeys(Keys.RETURN);
        return playlistId;
    }
//    public boolean isPlaylist() {
//        By successBy = By.xpath("//*[@class='success show']");
//        try{
//            wait.until(ExpectedConditions.visibilityOfElementLocated(successBy));
//            return true;
//        } catch (TimeoutException x){
//            return false;
//        }
//    }


}
