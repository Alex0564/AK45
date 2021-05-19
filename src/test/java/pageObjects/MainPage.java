package pageObjects;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MainPage extends BasePage{
    public MainPage(WebDriver driver) {
        super(driver);
    }
    private WebElement getPlusButton(){
        By plusButtonBy = By.xpath("//*[@class='fa fa-plus-circle control create']");
        wait.until(ExpectedConditions.elementToBeClickable(plusButtonBy));
        return driver.findElement(plusButtonBy);
    }
    private WebElement getNewPlaylistItem(){
        return driver.findElement(By.xpath("//*[text()='New Playlist']"));
    }
    private WebElement getEditPlaylistField(){
        return driver.findElement(By.xpath("//*[@class='create']/input"));
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
    public String createPlaylist(String playlistName){
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
        // Add scroll here too
        By playlistBy = By.xpath("//*[@href='#!/playlist/"+playlistId+"']");
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(playlistBy));
            String name = driver.findElement(playlistBy).getText();
            return name.equals(playlistName); // name == playlistName
        } catch (TimeoutException c){
            return false;
        }
    }

    public void renamePlaylist(String playlistId, String newPlaylistName) {
        // Scroll
        // By.xpath("//*[@href='#!/playlist/"+playlistId+"']");
        // https://www.guru99.com/scroll-up-down-selenium-webdriver.html
        // double click or right-click
        // Ctrl-A     Cmd-A
    }
}
