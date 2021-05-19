package homework.myPageObjects;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyMainPage {
    private WebDriver driver;
    private Wait<WebDriver> wait;

    public MyMainPage(WebDriver driver) {
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
        By plusButton = By.xpath("//*[@title='Create a new playlist']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(plusButton));
        return driver.findElement(plusButton); }
    private WebElement getContextMenu_CreatePlaylist(){
        By contextMenu = By.xpath("//*[text()='New Playlist']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(contextMenu));
        return driver.findElement(contextMenu); }
    private WebElement getTextField(){ return driver.findElement(By.xpath("//*[@class='create']/input")); }
    public String createPlaylist(String playlistName){
        String playlistId = "";
        getPlusButton().click();
        getContextMenu_CreatePlaylist().click();
        getTextField().sendKeys(playlistName);
        getTextField().sendKeys(Keys.ENTER);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='success show']")));
        playlistId = driver.getCurrentUrl().split("playlist/")[1];
        System.out.println(playlistId);
        return playlistId;
    }

}
