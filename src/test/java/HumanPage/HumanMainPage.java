package HumanPage;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HumanMainPage extends HumansBasePage {

//    private static Instant wait;

    public HumanMainPage(WebDriver driver) {super(driver);}

    public void open(){driver.get("https://humans.net/");}

    public WebElement getLoginField ()throws InterruptedException{
//        System.out.println("get Login field");
        By loginBy = By.xpath("//*[@class='f-B f-s f-v']");
//        System.out.println("get Login field 2");
//        Thread.sleep(5000); // Stale element here
        wait.until(ExpectedConditions.visibilityOfElementLocated(loginBy));
        WebElement login = driver.findElement(loginBy);
//        System.out.println("get Login field 3");
        return login;
    }

    public HumanLoginPage gotoLoginPage () throws InterruptedException {
        getLoginField().click();
        return new HumanLoginPage(driver);
    }
    public void humburger() {
        By humburgerBy = By.xpath("//*[@class='hamburger-box']");
        WebElement humburger = driver.findElement(humburgerBy);
        Actions action = new Actions(driver);
        action.moveToElement(humburger);
        action.perform(); }


    public HumanAboutUsPage gotoAboutUsPage() {
        humburger();
        By aboutBy = By.xpath("//*[@href='/about-us']");
        driver.findElement(aboutBy).click();
        return new HumanAboutUsPage(driver);
    }

    public static boolean isHumanMainPage(){
        By humansBy = By.xpath("//*[@class='w-0t']");
//        System.out.println("-------------- is Human Main Page -------------");
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(humansBy));
            return true;
        }catch (TimeoutException mmm){return false;}
    }






}
