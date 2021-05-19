package pageObjects;

import com.google.common.eventbus.SubscriberExceptionContext;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class MainPage extends BasePage {


   public boolean isMain() {
        By homeBy = By.className("home");
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(homeBy));
            return  true;
        } catch (TimeoutException xx){
            return true;
        }
    }

    public boolean checkPlaylist(CreateNewPlayList newPlayList) {
        By playlistBy = By.xpath("//*[@href='#!/playlist/"+newPlayList+"']");
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(playlistBy));
            String name = driver.findElement(playlistBy).getText();
            return name.equals(newPlayList);
        } catch (TimeoutException c){
            return false;
        }
    }
}
