package pageObjectsVK77;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage {
    private WebDriver driver;
    private Wait<WebDriver> wait;

    public MainPage(WebDriver driver) {
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
    //val kan
    private WebElement getPlusButton(){
        By plusButtonBy = By.xpath("//*[@class='fa fa-plus-circle control create']");
        wait.until(ExpectedConditions.elementToBeClickable(plusButtonBy));
        return driver.findElement(plusButtonBy);
    }
    private WebElement getNewPlaylist() {
        By newPlaylistBy = By.xpath("//*[text()='New Playlist']");
        wait.until(ExpectedConditions.elementToBeClickable(newPlaylistBy));
        return driver.findElement(newPlaylistBy);
    }
    private WebElement getPlInput() {
        By PlInputBy = By.xpath("//*[@class='create']/input");
        wait.until(ExpectedConditions.elementToBeClickable(PlInputBy));
        return driver.findElement(PlInputBy);
    }
    public String playListId(){
        //By playlistIdBy2 =By.className("active");//incorrect results
        By playlistIdBy =By.xpath("//*[@class='active']");//correct results
        String playlist="playlist";

        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(playlistIdBy));
            String atrib=driver.findElement(playlistIdBy).getAttribute("href");
            int len=driver.findElement(playlistIdBy).getAttribute("href").length();
            int indexofplaylist=atrib.indexOf(playlist);

            return atrib.substring(indexofplaylist+1+playlist.length());
        } catch (TimeoutException err){
            return "exception ";
        }
    }


    public String createPlaylist(String playlistName){
        String playlistId = "";
        getPlusButton().click();
        getNewPlaylist().click();
        getPlInput().sendKeys(playlistName);
        getPlInput().sendKeys(Keys.RETURN);
        playlistId=playListId();

        return playlistId;
    }
}
