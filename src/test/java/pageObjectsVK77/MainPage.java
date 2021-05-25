package pageObjectsVK77;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;


public class MainPage extends BasePage{

    public MainPage(WebDriver driver) {
        super(driver);
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
    //val kan
    //looking Plus button to create/add new playlist
    private WebElement getPlusButton(){
        By plusButtonBy = By.xpath("//*[@class='fa fa-plus-circle control create']");
        wait.until(ExpectedConditions.elementToBeClickable(plusButtonBy));
        return driver.findElement(plusButtonBy);
    }

    //looking for context meenu item "New playlist"
    private WebElement getNewPlaylist() {
        By newPlaylistBy = By.xpath("//*[text()='New Playlist']");
        wait.until(ExpectedConditions.elementToBeClickable(newPlaylistBy));
        return driver.findElement(newPlaylistBy);
    }

   // looking for input field to put name for new playlist
    private WebElement getPlInput() {
        By PlInputBy = By.xpath("//*[@class='create']/input");
        wait.until(ExpectedConditions.elementToBeClickable(PlInputBy));
        return driver.findElement(PlInputBy);
    }

    // looking playlist id
    public String playListId(){
        //By playlistIdBy2 =By.className("active");//incorrect results
        By playlistIdBy =By.xpath("//*[@class='active']");//correct results
        String playlist="playlist";

        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(playlistIdBy));
            String atrib=driver.findElement(playlistIdBy).getAttribute("href");
            int len=driver.findElement(playlistIdBy).getAttribute("href").length();
            int indexofplaylist=atrib.indexOf(playlist);

            return atrib.substring(indexofplaylist+1+playlist.length());
        } catch (TimeoutException err){
            return "exception ";
        }
    }

//    //looking playlist by name
//    private WebElement getPlaylistToDel(){
//        By plusButtonBy = By.xpath("//a[text()='RABDOMPLAYLIS']");
//        wait.until(ExpectedConditions.elementToBeClickable(plusButtonBy));
//        return driver.findElement(plusButtonBy);
//    }

    //looking playlist by name
    private WebElement getPlaylistToDel(){
        By plusButtonBy = By.xpath("//a[text()='RABDOMPLAYLIS']");
        wait.until(ExpectedConditions.elementToBeClickable(plusButtonBy));
        return driver.findElement(plusButtonBy);
    }

    // looking for red button to delete active/selected playlist
    private WebElement getPlaylistDelButton(){
        //By delButtonBy = By.className("del btn-delete-playlist");
        By delButtonBy = By.xpath("//*[@title='Delete this playlist']");
        wait.until(ExpectedConditions.elementToBeClickable(delButtonBy));
        return driver.findElement(delButtonBy);
    }

    //check is it playlist created using success show class
    public boolean isSuccess(){
        //By successBy = By.className("success show");
        By successBy = By.xpath("//*[@class='success show']");
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(successBy));
            return true;
        } catch (TimeoutException err){
            return false;
        }
    }
    //looking input field to put new  name for old playlist (rename)
    private WebElement getPlFieldToRename(){
        By PlInputBy = By.xpath("//*[@class='playlist playlist editing']/input");
        wait.until(ExpectedConditions.elementToBeClickable(PlInputBy));
        return driver.findElement(PlInputBy);

    }
    //create playlist
    public String createPlaylist(String playlistName){
        String playlistId = "";
        getPlusButton().click();
        getNewPlaylist().click();
        getPlInput().sendKeys(playlistName);
        getPlInput().sendKeys(Keys.RETURN);
        By successBy = By.xpath("//*[@class='success show']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(successBy));
        return driver.getCurrentUrl().split("/")[5];


    }

    // looking for element related to playlistId
    private By playlistBy(String playlistId){
        return By.xpath("//*[@href='#!/playlist/"+playlistId+"']");

    }
    //looking existance of created or renamed playlist ini the list on the left side list of playlists
    //using Java script executor to scroll page down
    public boolean checkPlaylist(String playlistId, String playlistName){

        By playlistBy = playlistBy(playlistId);

        //scroll JS for Firefox browsers
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement Element = driver.findElement(playlistBy);

        //This will scroll the page till the element is found
        js.executeScript("arguments[0].scrollIntoView();", Element);
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(playlistBy));
            String name = driver.findElement(playlistBy).getText();
            return name.equals(playlistName); // name == playlistName
        } catch (TimeoutException c){
            return false;
        }

    }
    //method renames playlist  by Id
    //using Java script actions to invoke double click on playlist
    //and Java script executor for scrolling page
    public void renamePlaylist(String playlistId, String newPlaylistName){

        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement playlist = driver.findElement(By.xpath("//*[@href='#!/playlist/"+playlistId+"']"));

        //This will scroll the page till the element is found
        js.executeScript("arguments[0].scrollIntoView();", playlist);

        // double click
        Actions actions = new Actions(driver);
        //double click JS
        actions.doubleClick(playlist).perform();

        // Ctrl-A     Cmd-A
        getPlFieldToRename().sendKeys(Keys.CONTROL,"a");
        getPlFieldToRename().sendKeys(newPlaylistName+"(renamedByValeriy)");
        getPlFieldToRename().sendKeys(Keys.RETURN);

    }
    public void deleteAllPlaylists(){
        List<WebElement> playlist = driver.findElements(By.xpath("//*[@class='playlist playlist']/a"));

        for(WebElement v:playlist){
            System.out.println(v.getAttribute("href").toString());
            //wait.until(ExpectedConditions.elementToBeClickable(v));
            v.click();
            getPlaylistDelButton().click();

            //getPlaylistDelButton().click();

        }
    }


}