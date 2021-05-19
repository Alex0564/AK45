package hw_koelPlaylistCreated;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class KoelMainPage {
    private WebDriver driver;
    private Wait<WebDriver> wait;

    public KoelMainPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 5,200);
    }

    public void createPlaylist(String playlist) {
//        String playlistId = null;
        By plusButtonBy = By.xpath("//*[@class='fa fa-plus-circle control create']");
        wait.until(ExpectedConditions.elementToBeClickable(plusButtonBy));
        WebElement plusButton = driver.findElement(plusButtonBy);
        plusButton.click();
        WebElement newPlaylist = driver.findElement(By.xpath("//*[text()='New Playlist']"));
        newPlaylist.click();
        WebElement textField = driver.findElement(By.xpath("//*[@class='create']/input"));
        textField.sendKeys(playlist);
        textField.sendKeys(Keys.RETURN);
//        return playlistId;

    }

}
