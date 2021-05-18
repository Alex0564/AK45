package pageObjectsA;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Time;

public class MainPage {
    private WebDriver driver;
    private Wait<WebDriver> wait;

    public MainPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 10, 200);
    }
    public void open() {
        driver.get("https://bbb.testpro.io/");
    }

    private WebElement getPlusButton() {
        By buttonBy = By.xpath("//*[@class='fa fa-plus-circle control create']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(buttonBy));
        return driver.findElement(By.xpath("//*[@class='fa fa-plus-circle control create']"));
    }

    private WebElement newPlayList() {
        return driver.findElement(By.xpath("//*[text()='New Playlist']"));
    }

    private WebElement textField() {
        return driver.findElement(By.xpath("//*[@class='create']/input"));
    }

    public String createPlaylist(String playListName) {
        String playlistID = null;
        getPlusButton().click();
        newPlayList().click();
        textField().sendKeys("Katerina");
        textField().sendKeys(Keys.RETURN);
        return playlistID;
    }
    public boolean getSuccessBy() {
        By successBy = By.xpath("//*[@class='success show']");
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(successBy));
            return true;
        } catch (TimeoutException xx) {
            return false;
        }
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

}




