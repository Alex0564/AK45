package homework.myPageObjects;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.JavascriptExecutor;


public class MainPageMine extends BasePageMine {
    public MainPageMine(WebDriver driver) {
        super(driver);
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


    private WebElement getPlusButton() {
        By plusButton = By.xpath("//*[@title='Create a new playlist']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(plusButton));
        return driver.findElement(plusButton);
    }

    private WebElement getContextMenu_CreatePlaylist() {
        By contextMenu = By.xpath("//*[text()='New Playlist']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(contextMenu));
        return driver.findElement(contextMenu);
    }

    private WebElement getTextField() {
        return driver.findElement(By.xpath("//*[@class='create']/input"));
    }

    public String createPlaylist(String playlistName) {
        String playlistId = "";
        getPlusButton().click();
        getContextMenu_CreatePlaylist().click();
        getTextField().sendKeys(playlistName);
        getTextField().sendKeys(Keys.ENTER);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='success show']")));
        playlistId = driver.getCurrentUrl().split("playlist/")[1];
        return playlistId;
    }

    public boolean checkMyPlaylist(String playlistId, String playlistName) {
        // Add scroll here too
        By playlistBy = By.xpath("//*[@href='#!/playlist/" + playlistId + "']");
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(playlistBy));
            String name = driver.findElement(playlistBy).getText();
            return name.equals(playlistName);
        } catch (TimeoutException c) {
            return false;
        }
    }

    public void renamePlaylist(String playlistId, String newPlaylistName) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement playlistToRename = driver.findElement(By.xpath("//*[@href='#!/playlist/"+playlistId+"']"));
        js.executeScript("arguments[0].scrollIntoView();", playlistToRename);

        Actions a = new Actions(driver);
        a.doubleClick(playlistToRename).perform();

        WebElement editingField = getEditPlaylistField();
        editingField.sendKeys(Keys.COMMAND+"A");
        editingField.sendKeys(newPlaylistName);
        editingField.sendKeys(Keys.RETURN);

    }
    private WebElement getEditPlaylistField() {
        By editBy = By.xpath("//*[@type='text']");
        wait.until(ExpectedConditions.elementToBeClickable(editBy));
        return driver.findElement(editBy);
    }

}
