package HumanPage;

import HumanPage.HumanAboutUsPage;
import HumanPage.HumansBasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HumanPlayAboutUsPage extends HumansBasePage {


    public HumanPlayAboutUsPage(WebDriver driver) {
        super(driver);
    }

    public boolean isPlayAboutUs() throws InterruptedException{
//        By playAboutUs = By.xpath("//*[@class='video-react-bezel-icon video-react-bezel-icon-play']");
//        By playAboutUs = By.xpath("//*[contains(@src, 'PHN2ZyB3aWR0aD0iODAiIGhl')]");
        By playAboutUs = By.xpath("//*[@class='video-react-video']");
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(playAboutUs));
            return true;
        }catch (TimeoutException ppp){
//            System.out.println("====== no play ======");
            return false;}
//        Thread.sleep(4000);
//        wait.until(ExpectedConditions.visibilityOfElementLocated(playAboutUs));
//        return true;
//        fluentWait.until(x->x.findElement(playAboutUs).isDisplayed());
//        System.out.println("======  play ======");
//        return true;
    }
//    protected WebDriver driver;
//    protected Wait<WebDriver> wait;

    public HumanAboutUsPage returnToUboutUs(){
        By xBy = By.xpath("//*[@class='modal__close-btn-full']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(xBy));
        driver.findElement(xBy).click();
        return new HumanAboutUsPage(driver);
    }



}
