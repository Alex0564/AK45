package pageObjects;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MainPage extends BasePage{
    public MainPage(WebDriver driver) {
        super(driver);
    }
    private WebElement getPlusButton(){
        By plusButtonBy = By.xpath("//*[@class='fa fa-plus-circle control create']");
        wait.until(ExpectedConditions.elementToBeClickable(plusButtonBy));
        return driver.findElement(plusButtonBy);
    }
    private WebElement getNewPlaylistItem(){
        return driver.findElement(By.xpath("//*[text()='New Playlist']"));
    }
    private WebElement getEditPlaylistField(){
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
        getNewPlaylistItem().click();
        getEditPlaylistField().sendKeys(playlistName);
        getEditPlaylistField().sendKeys(Keys.RETURN);
        By successBy = By.xpath("//*[@class='success show']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(successBy));
        return driver.getCurrentUrl().split("/")[5];
    }

    public boolean checkPlaylist(String playlistId, String playlistName) {
        // Add scroll here too
        By playlistBy = By.xpath("//*[@href='#!/playlist/"+playlistId+"']");
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(playlistBy));
            String name = driver.findElement(playlistBy).getText();
            return name.equals(playlistName); // name == playlistName
        } catch (TimeoutException c){
            return false;
        }
    }

    public void renamePlaylist(String playlistId, String newPlaylistName) throws InterruptedException {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        By playlistNameBy = By.xpath("//*[@href='#!/playlist/"+playlistId+"']"); //By.xpath("//*[@href='#!/playlist/3433']");
        WebElement scrollTo = driver.findElement(playlistNameBy);
        js.executeScript("arguments[0].scrollIntoView();", scrollTo);

//        Actions action = new Actions(driver);
//        WebElement link = driver.findElement(playlistNameBy);
//        action.doubleClick(link).perform();

        Actions action = new Actions(driver);
        WebElement link = driver.findElement(playlistNameBy);
        action.contextClick(link).perform();

//        By editBy = By.xpath("//*[@href='#!/playlist/"+playlistId+"']/following-sibling::nav/ul/li[text()='Edit']");
        Thread.sleep(3000);
        By editBy = By.xpath("//*[text() = 'Edit']");
        WebElement edit = driver.findElement(editBy);
        edit.click();
        wait.until(ExpectedConditions.elementToBeSelected(edit));
        edit.sendKeys(Keys.CONTROL+"A");
        edit.sendKeys(newPlaylistName);

//        action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
//        link.clear();

//        Thread.sleep(2000);
//
//        link.sendKeys("Selenium");
//        String s = Keys.chord(Keys.CONTROL, "a");
//        link.sendKeys(s);


        Thread.sleep(5000);

    }
    }

