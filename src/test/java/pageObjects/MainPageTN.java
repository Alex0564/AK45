package pageObjects;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MainPageTN extends BasePage{
    private boolean selected;

    public MainPageTN(WebDriver driver) {
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
        By playlistBy = By.xpath("//*[@href='#!/playlist/"+playlistId+"']");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement Element = driver.findElement(playlistBy);
        js.executeScript("arguments[0].scrollIntoView();", Element);
        // Add scroll here too

        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(playlistBy));
            String name = driver.findElement(playlistBy).getText();
            return name.equals(playlistName); // name == playlistName
        } catch (TimeoutException c){
            return false;
        }
    }

    public void renamePlaylist(String playlistId, String newPlaylistName) {
        By playlistBy = By.xpath("//*[@href='#!/playlist/"+playlistId+"']");
            JavascriptExecutor js = (JavascriptExecutor) driver;
            WebElement Element = driver.findElement(playlistBy);
            js.executeScript("arguments[0].scrollIntoView();", Element);
            Element.click();
        Actions actions = new Actions(driver);
        WebElement elementLocator = Element;
        actions.doubleClick(elementLocator).perform();
        elementLocator.sendKeys("tatatatat");






        }
        // Scroll
        // By.xpath("//*[@href='#!/playlist/"+playlistId+"']");
        // https://www.guru99.com/scroll-up-down-selenium-webdriver.html
        // double click or right-click
        // Ctrl-A     Cmd-A
    }

