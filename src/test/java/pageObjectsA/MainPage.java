package pageObjectsA;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage extends BasePageA{

    public MainPage(WebDriver driver) {
        super(driver);
    }
    private WebElement getPlusButton() {
        By plusButtonBy = By.xpath("//*[@class='fa fa-plus-circle control create']");
        wait.until(ExpectedConditions.elementToBeClickable(plusButtonBy));
        return driver.findElement(plusButtonBy);
    }

    private WebElement getNewPlaylistItem()  {
        return driver.findElement(By.xpath("//*[text()='New Playlist']"));
    }

    private WebElement getEditPlaylistField() {
        return driver.findElement(By.xpath("//*[@class='create']/input"));
    }


    public boolean isMain() {
        By homeBy = By.className("home");
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(homeBy));
            return true;
        } catch (TimeoutException xx) {
            return false;
        }
    }

    public String createPlaylist(String playlistName)  {
        String playlistId = "";
        getPlusButton().click();
        getNewPlaylistItem().click();
        getEditPlaylistField().sendKeys(playlistName);
        getEditPlaylistField().sendKeys(Keys.RETURN);
        By successBy = By.xpath("//*[@class='success show']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(successBy));
        return driver.getCurrentUrl().split("/")[5];


    }

    public boolean checkPlaylist(String playlistId, String playlistName) {
        By playlistBy = By.xpath("//*[@href='#!/playlist/" + playlistId + "']");
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(playlistBy));
            String name = driver.findElement(playlistBy).getText();
            return name.equals(playlistName);
        } catch (TimeoutException c){
            return false;
        }
    }

    public void renamePlaylist(String playlistId, String newPlaylistName) {

    }
}
