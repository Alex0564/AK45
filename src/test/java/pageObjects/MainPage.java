package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
    public String createPlaylist(String playlistName){
        String playlistId = null;

        return playlistId;
    }
    public WebElement plusButton(){
        By plusButtonBy = By.xpath("//*[@class='fa fa-plus-circle control create']");
        return driver.findElement(plusButtonBy);

    }
    public WebElement newPlaylist(){
        By newPlaylistBy = By.xpath("//*[text()='New Playlist']");
        return driver.findElement(newPlaylistBy);
    }
    public WebElement textField(){
        By textFieldBy = By.xpath("//*[@class='create']/input");
        return driver.findElement(textFieldBy);
    }

}
