package ao_pageObjects;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AO_MainPage {
    private WebDriver driver;
    private Wait<WebDriver> wait;

    public AO_MainPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 5,200);

    }

    public boolean isMain() {
        By resultBy = By.xpath("//*[@class='music']/h1");
        try{
            wait.until(ExpectedConditions.visibilityOfElementLocated(resultBy));
            return true;
        } catch (TimeoutException te_1){
            return false;
        }
    }

    private WebElement getPlusButton() {
        By plusButtonBy = By.xpath("//*[@title='Create a new playlist']");
        wait.until(ExpectedConditions.elementToBeClickable(plusButtonBy));
        return driver.findElement(plusButtonBy);
    }

    private WebElement getNewPlaylistItem(){
        return driver.findElement(By.xpath("//*[text()='New Playlist']"));
    }

    private WebElement getCreatePlaylistField(){
        return driver.findElement(By.xpath("//*[@placeholder='↵ to save']"));
    }

    public String createPlaylist(String playlistName) {
        getPlusButton().click();
        getNewPlaylistItem().click();
        getCreatePlaylistField().sendKeys(playlistName);
        getCreatePlaylistField().sendKeys(Keys.RETURN);
        By successBy = By.xpath("//*[@class='success show']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(successBy));
        return driver.getCurrentUrl().split("/")[5];
    }
}
