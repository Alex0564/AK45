package pageObjects;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MainPage extends BasePage {
    public MainPage(WebDriver driver) {
        super(driver);
    }

    private WebElement getPlusButton(){
        By plusButtonBy = By.xpath("//*[@class='fa fa-plus-circle control create']");
        wait.until(ExpectedConditions.elementToBeClickable(plusButtonBy));
        return driver.findElement(plusButtonBy);
    }
    private WebElement getNewPlaylistItem() {return driver.findElement(By.xpath("//*[text()='New Playlist']"));}

    private WebElement getCreatePlaylistField() {
        return driver.findElement(By.xpath("//*[@class='create']/input"));
    }

    public boolean isMain() {
        By homeBy = By.className("home");
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(homeBy));
            return  true;
        } catch (TimeoutException xx){
            return true;
        }
    }

    public String createPlaylist(String playlistName) {
        String playlistId = "";
        getPlusButton().click();
        getNewPlaylistItem().click();
        getCreatePlaylistField().sendKeys(playlistName);
        getCreatePlaylistField().sendKeys(Keys.RETURN);
        By successBy = By.xpath("//*[@class='success show']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(successBy));
        String url = driver.getCurrentUrl();
        return  driver.getCurrentUrl().split("/")[5];
    }

    private By getPlaylistBy(String playlistId) {
        return By.xpath("//*[@href='#!/playlist/"+playlistId+"']");
    }

    public boolean checkPlaylist(String playlistId, String playlistName) {

        try {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            By playlistBy = getPlaylistBy(playlistId);
            WebElement playlist = driver.findElement(playlistBy);
            js.executeScript("arguments[0].scrollIntoView();",playlist);
            wait.until(ExpectedConditions.visibilityOfElementLocated(playlistBy));
            String name = driver.findElement(playlistBy).getText();
        } catch (TimeoutException c){
            return false;
        }
        return false;
    }

    public void renamePlaylist(String playlistId, String newPlaylistName) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        By playlistBy = getPlaylistBy(playlistId);
        WebElement playlist = driver.findElement(playlistBy);
        js.executeScript("arguments[0].scrollIntoView();",playlist);

        Actions actions = new Actions(driver);
        actions.doubleClick(playlist).perform();

        WebElement editingField = getEditPlaylistField();
        editingField.sendKeys(Keys.CONTROL+"A");
        editingField.sendKeys(newPlaylistName);
        editingField.sendKeys(Keys.RETURN);
    }

    private WebElement getEditPlaylistField() {
        By editBy = By.xpath("//*[@type = 'text']");
        wait.until(ExpectedConditions.elementToBeClickable(editBy));
        return  driver.findElement(By.xpath("//*[@type = 'text']"));
    }
}
