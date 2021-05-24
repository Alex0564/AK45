package pageObjectsIuliia;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class MainPageI extends BasePageI{


    public MainPageI(WebDriver driver) {
        super(driver);
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
        getNewPlaylist().click();
        getTextField().sendKeys(playlistName);
        getTextField().sendKeys(Keys.RETURN);
        By successBy = By.xpath("//*[@class='success show']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(successBy));
        return driver.getCurrentUrl().split("/")[5];
    }
    private By getPlaylistBy(String playlistId){
        return By.xpath("//*[@href='#!/playlist/" + playlistId + "']");
    }

    public boolean checkPlaylist(String playlistId, String playlistName) {

        try {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            By playlistBy = getPlaylistBy(playlistId);
            WebElement playlist = driver.findElement(playlistBy);
            js.executeScript("arguments[0].scrollIntoView();", playlist);
            wait.until(ExpectedConditions.visibilityOfElementLocated(playlistBy));
            String name = driver.findElement(playlistBy).getText();
            return name.equals(playlistName); // name == playlistName
        } catch (TimeoutException c) {
            return false;
        }
    }
    public void renamePlaylist(String playlistId, String newPlaylistName) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        By playlistBy = getPlaylistBy(playlistId);

        WebElement playlist = driver.findElement(playlistBy);

        js.executeScript("arguments[0].scrollIntoView();", playlist);

        Actions actions = new Actions(driver);
        actions.doubleClick(playlist).perform();

        WebElement editingField = getEditPlaylistField();
        editingField.sendKeys(Keys.CONTROL+"A");
        editingField.sendKeys(newPlaylistName);
        editingField.sendKeys(Keys.RETURN);
        // Scroll
        // By.xpath("//*[@href='#!/playlist/"+playlistId+"']");
        // https://www.guru99.com/scroll-up-down-selenium-webdriver.html
        // double click or right-click
        // Ctrl-A     Cmd-A
    }

    private WebElement getEditPlaylistField() {
        By editBy = By.xpath("//*[@type='text']");
        wait.until(ExpectedConditions.elementToBeClickable(editBy));
        return driver.findElement(editBy);
    }
}
