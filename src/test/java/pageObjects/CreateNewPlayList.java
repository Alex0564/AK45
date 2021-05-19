package pageObjects;

import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateNewPlayList {
    private WebDriver driver;
    private Wait<WebDriver> wait;

    public CreateNewPlayList(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver,10,200);
    }

    private WebElement getPlusButton() {
        By plusButtonBy = By.xpath("//*[@class='fa fa-plus-circle control create']");
        wait.until(ExpectedConditions.elementToBeClickable(plusButtonBy));
        return driver.findElement(By.xpath("//*[@class='fa fa-plus-circle control create']"));
    }
    private WebElement getNewPlayList() {
        By newListBy = By.xpath("//*[text()='New Playlist']");
        wait.until(ExpectedConditions.elementToBeClickable(newListBy));
        return driver.findElement(By.xpath("//*[text()='New Playlist']"));
    }
     private WebElement getListName() {
        return driver.findElement(By.xpath("//*[@class='create']/input"));
     }

    public CreateNewPlayList newPlayList(String name){
        getPlusButton().click();
        getNewPlayList().click();
        getListName().sendKeys(name);
        getListName().sendKeys(Keys.ENTER);
//        String playListId =
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='success show']")));
        String url = driver.getCurrentUrl();
        System.out.println("Play list Id = "+url.split("/")[5]);

//        WebElement textField = driver.findElement(By.xpath("//*[@class='create']/input"));
//        textField.sendKeys("MaxList");
//        textField.sendKeys(Keys.RETURN);
//        By successBy = By.xpath("//*[@class='success show']");
//        wait.until(ExpectedConditions.visibilityOfElementLocated(successBy));
//        WebElement green = driver.findElement(successBy);
//        Assert.assertTrue(green.isDisplayed());
        return null;

//        return null;
    }
}
