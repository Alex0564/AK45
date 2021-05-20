package MyPageObject;

import lesson10.ElectricalDevice;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MainPage extends BasePage{
//    MainPage extends BasePage <- добавили
//    переместили в BasePage И сделали protected,видны везде:
//    private WebDriver driver;
//    private Wait<WebDriver> wait;

    public MainPage(WebDriver driver) {
//        this.driver = driver;
//        wait = new WebDriverWait(driver, 10, 200); <-- in BasePage
        super(driver);
    }

    private WebElement getPlusButton(){
        By buttonBy = By.xpath("//*[@class='fa fa-plus-circle control create']");
        wait.until(ExpectedConditions.elementToBeClickable(buttonBy));
        return driver.findElement(buttonBy);
    }

    private WebElement getNewPlayListItem(){
        return driver.findElement(By.xpath("//*[text()='New Playlist']"));
    }

    private WebElement getCreatePlayListField(){
        return driver.findElement(By.xpath("//*[@class='create']/input"));
    }

    public boolean isMainPage() {
        By homeBy = By.className("home");
//        wait.until(ExpectedConditions.visibilityOfElementLocated(homeBy));
//        return driver.findElement(homeBy).isDisplayed();
        try{ wait.until(ExpectedConditions.visibilityOfElementLocated(homeBy));
            return true; }
        catch (TimeoutException xx) {return false;}
    }

    public String createdPlayList (String playListName){
        String playListId = "";
        getPlusButton().click();
        getNewPlayListItem().click();
        getCreatePlayListField().sendKeys(playListName);
        getCreatePlayListField().sendKeys(Keys.RETURN);
        By greenBy = By.xpath("//*[@class='success show']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(greenBy));
//        String url = driver.getCurrentUrl();
        return driver.getCurrentUrl().split("/")[5];
    }

    private By getPlaylistBy(String playListId){
        return By.xpath("//*[@href='#!/playlist/" + playListId + "']");

    }

    public boolean checkPlaylist(String playListId, String playListNameFull) {
//        Add scroll page here too
//

        try {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            By playlistBy = getPlaylistBy(playListId);
            WebElement playlist = driver.findElement(playlistBy);
            js.executeScript("arguments[0].scrollIntoView();", playlist);
            wait.until(ExpectedConditions.visibilityOfElementLocated(playlistBy));
            String name = driver.findElement(playlistBy).getText();
//            return name == playListNameFull; нельзя сравнивать два стринга в java
            return name.equals(playListNameFull);
        } catch (TimeoutException c) {
            return false;
        }
    }

    public void renamePlaylist(String playListId, String newPlayListName) {
//        scroll page
//        By.xpath("//*[@href='#!/playlist/" + playListId + "']");
//        js.executeScript("arguments[0].scrollIntoView();", Element);
//        https://www.guru99.com/scroll-up-down-selenium-webdriver.html
//        double click or right-click
//        Cmd-A выделить все

        JavascriptExecutor js = (JavascriptExecutor) driver;
        By playlistBy = getPlaylistBy(playListId);
        WebElement playlist = driver.findElement(playlistBy);
        js.executeScript("arguments[0].scrollIntoView();", playlist);

        Actions actions = new Actions(driver);
        actions.doubleClick(playlist).perform();

        WebElement editingField = getEditPlayListField();
        editingField.sendKeys(Keys.COMMAND+"A");
        editingField.sendKeys(newPlayListName);
        editingField.sendKeys(Keys.RETURN);
//        try {Thread.sleep(5000);
//        }catch (InterruptedException e){e.printStackTrace();}
    }

    private WebElement getEditPlayListField() {
        By nownElement1By = By.xpath("//*[@type='text']");
//        By nownElement2By = By.xpath("//*[@href='#!/playlist/"+playListId+"']/following-sibling::input");
        wait.until(ExpectedConditions.elementToBeClickable(nownElement1By));
        return driver.findElement(nownElement1By);
    }
}
