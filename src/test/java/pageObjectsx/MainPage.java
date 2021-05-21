package pageObjectsx;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage {
    private WebDriver driver;
    private Wait<WebDriver> wait;

    public MainPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 5, 200);
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


    ///Creating Playlist

    private WebElement getPlus_button() {
        By plusButtonBy = By.xpath("//*[@class='fa fa-plus-circle control create']");
        wait.until(ExpectedConditions.elementToBeClickable(plusButtonBy));
        return driver.findElement(plusButtonBy);
    }

    private WebElement getNew_playlist() {
        return driver.findElement(By.xpath("//*[text()='New Playlist']"));
    }

    private WebElement getText_field() {
        return driver.findElement(By.xpath("//*[@class='create']/input"));
    }


    public String createPlaylist(String playlist_name) {
        String playlistId = "";
        getPlus_button().click();
        getNew_playlist().click();
        getText_field().sendKeys(playlist_name);
        getText_field().sendKeys(Keys.ENTER);
        By greenBy = By.xpath("//*[@class='success show']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(greenBy));
//        String url = driver.getCurrentUrl();
//        playlistId = url.split("/")[5];
//        System.out.println(playlistId);
        return driver.getCurrentUrl().split("/")[5];

    }
}
