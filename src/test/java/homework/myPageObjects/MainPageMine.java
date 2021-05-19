package homework.myPageObjects;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;


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
}
