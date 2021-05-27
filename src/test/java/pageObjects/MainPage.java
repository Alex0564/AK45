package pageObjects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MainPage extends BasePage {
    private static Logger logger = LogManager.getLogger(MainPage.class);

    public MainPage(WebDriver driver) {
        super(driver);
    }

    private WebElement getPlusButton() {
        By plusButtonBy = By.xpath("//*[@class='fa fa-plus-circle control create']");
        wait.until(ExpectedConditions.elementToBeClickable(plusButtonBy));
        WebElement plusButton = driver.findElement(plusButtonBy);
        return driver.findElement(plusButtonBy);
//        By plusButton = By.xpath("//*[@class = 'fa fa-plus-circle control create']");

//    public MainPage(WebDriver driver) {
//    }
    }

    private WebElement getNewPlaylistItem() {
        return driver.findElement(By.xpath("//*[text()='New Playlist']"));
    }

    private WebElement getCreatePlaylistField() {
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
//        wait.until(ExpectedConditions.visibilityOfElementLocated(homeBy));
//        return driver.findElement(homeBy).isDisplayed();

    }

    public String createPlaylist(String playlistName) {
        logger.debug("Create Playlist with name ->"+playlistName);
        getPlusButton().click();
        getNewPlaylistItem().click();
        getCreatePlaylistField().sendKeys(playlistName);
        getCreatePlaylistField().sendKeys(Keys.RETURN);
        By successBy = By.xpath("//*[@class='success show']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(successBy));
        return driver.getCurrentUrl().split("/")[5];

//        System.out.println(driver.getCurrentUrl());
//        System.out.println(playlistId);


//        return playlistId;
    }

    private By getPlaylistBy(String playlistId) {
        return By.xpath("//*[@href='#!/playlist/" + playlistId + "']");
    }


    public boolean checkPlaylist(String playlistId, String playlistName) {
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        By playlistBy = By.xpath("//*[@href='#!/playlist/" + playlistId + "']");
//        WebElement playlist = driver.findElement(playlistBy);
//        js.executeScript("arguments[0].scrollIntoView();", playlist);
        try {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            By playlistBy = By.xpath("//*[@href='#!/playlist/" + playlistId + "']");
            WebElement playlist = driver.findElement(playlistBy);
            js.executeScript("arguments[0].scrollIntoView();", playlist);
            wait.until(ExpectedConditions.visibilityOfElementLocated(playlistBy));
            String name = driver.findElement(playlistBy).getText();
            return name.equals(playlistName);

        } catch (TimeoutException c) {
            return false;
        }
    }

    public void renamePlaylist(String playlistId, String newPlaylistName) {
        logger.debug("Updating playlist id"+playlistId);
        logger.debug("New playlist name = "+newPlaylistName);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        By playlistBy = getPlaylistBy(playlistId);
        WebElement playlist = driver.findElement(playlistBy);
        js.executeScript("arguments[0].scrollIntoView();", playlist);

        Actions actions = new Actions(driver);
//        WebElement elementLocator = driver.findElement(By.id("ID"));
        actions.doubleClick(playlist).perform();

        WebElement editingField = getEditPlayListField(playlistId);
        editingField.sendKeys(Keys.CONTROL+"A");
        editingField.sendKeys(newPlaylistName);
        editingField.sendKeys(Keys.RETURN);


        try {
            Thread.sleep(5000);

        } catch (InterruptedException e){
            e.printStackTrace();
        }

    }

    private WebElement getEditPlayListField(String playlistId) {
//        By editBy = By.xpath("//*[@type='text']");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@type='text']")));
        return driver.findElement(By.xpath("//*[@type='text']"));
    }
}