package SimpleTestOld;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MyKoel {
    private WebDriver driver;
    @BeforeMethod
    public void startUp()throws InterruptedException{
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();
        driver.get("https://bbb.testpro.io/");
        Thread.sleep(1000);
    }
    @AfterMethod
    public void tearDown()throws InterruptedException{
        Thread.sleep(5000);
        driver.quit();
    }
    @Test
    public void loginToKoel_correctCredentials() throws InterruptedException {
//        System.setProperty("webdriver.chrome.driver", "chromedriver");
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://bbb.testpro.io/");
//        Thread.sleep(1000);

        System.out.println("I am here - before test");

        WebElement myEmail = driver.findElement(By.xpath("//*[@type='email']"));
        WebElement myPassword = driver.findElement(By.cssSelector("[type='password']"));
        WebElement myLoginButton = driver.findElement(By.tagName("button"));

        System.out.println("Found elements");

        myEmail.sendKeys("oleksiy564@gmail.com");
        myPassword.sendKeys("te$t$tudent");
        myLoginButton.click();

        Thread.sleep(2000);

        WebElement home = driver.findElement(By.cssSelector(".home")); //*[@class = 'home active']
        Assert.assertTrue(home.isDisplayed());
//        Thread.sleep(3000);
//        driver.quit();
    }
    @Test
    public void loginToKoel_incorrectCredentials() throws InterruptedException {
//        System.setProperty("webdriver.chrome.driver", "chromedriver");
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://bbb.testpro.io/");
//        Thread.sleep(1000);
        WebElement myEmail = driver.findElement(By.xpath("//*[@type='email']"));
        WebElement myPassword = driver.findElement(By.cssSelector("[type='password']"));
        WebElement myLoginButton = driver.findElement(By.tagName("button"));

        myEmail.sendKeys("oleksiy564@gmail.com");
        myPassword.sendKeys("wrongPassword");
        myLoginButton.click();

        Thread.sleep(500);

        WebElement home = driver.findElement(By.cssSelector(".error")); //*[@class = 'home active']
        Assert.assertTrue(home.isDisplayed());
//        Thread.sleep(3000);
//        driver.quit();
    }
    @Test
    public void newPlayList()throws InterruptedException {
        System.out.println("I am here - before Play list test");

        WebElement myEmail = driver.findElement(By.xpath("//*[@type='email']"));
        WebElement myPassword = driver.findElement(By.cssSelector("[type='password']"));
        WebElement myLoginButton = driver.findElement(By.tagName("button"));

        System.out.println("Found elements for play list test");

        myEmail.sendKeys("oleksiy564@gmail.com");
        myPassword.sendKeys("te$t$tudent");
        myLoginButton.click();

        Thread.sleep(2000);

       WebElement plusButton = driver.findElement(By.xpath("//*[@class='fa fa-plus-circle control create']"));
       plusButton.click();
       WebElement newList = driver.findElement(By.xpath("//*[text()='New Playlist']"));
       newList.click();
       WebElement textField = driver.findElement(By.xpath("//*[@class='create']/input"));
       textField.sendKeys("My new list");
       textField.sendKeys(Keys.RETURN);
       Thread.sleep(200);
       WebElement green = driver.findElement(By.xpath("//*[@class='success show']"));
       Assert.assertTrue(green.isDisplayed());



    }

}
