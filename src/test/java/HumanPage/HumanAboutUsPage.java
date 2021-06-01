package HumanPage;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HumanAboutUsPage {

    protected WebDriver driver;
    protected Wait<WebDriver> wait;
    public HumanAboutUsPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 10,200);
    }

    public boolean isUboutUsPage() {
        By welcomeBy = By.xpath("//*[text()='Welcome to the future of human interaction']");
        By playBy = By.xpath("//*[@src='data:image/svg+xml;base64,PHN2ZyB3aWR0aD0iODAiIGhlaWdodD0iODAiIGZpbGw9Im5vbmUiIHhtbG5zPSJodHRwOi8vd3d3LnczLm9yZy8yMDAwL3N2ZyI+PGNpcmNsZSBjeD0iNDAiIGN5PSI0MCIgcj0iNDAiIGZpbGw9IiNmZmYiLz48cGF0aCBkPSJNNTguNCA0MEwzMC44IDU1LjkzNXYtMzEuODdMNTguNCA0MHoiIGZpbGw9IiNGRjU4NUQiLz48L3N2Zz4=']");
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(welcomeBy));
            return true;
        } catch (TimeoutException aaa){return false;}
    }
    public HumanPlayAboutUsPage playAboutUs(){
        By playBy = By.xpath("//*[@src='data:image/svg+xml;base64,PHN2ZyB3aWR0aD0iODAiIGhlaWdodD0iODAiIGZpbGw9Im5vbmUiIHhtbG5zPSJodHRwOi8vd3d3LnczLm9yZy8yMDAwL3N2ZyI+PGNpcmNsZSBjeD0iNDAiIGN5PSI0MCIgcj0iNDAiIGZpbGw9IiNmZmYiLz48cGF0aCBkPSJNNTguNCA0MEwzMC44IDU1LjkzNXYtMzEuODdMNTguNCA0MHoiIGZpbGw9IiNGRjU4NUQiLz48L3N2Zz4=']");
        driver.findElement(playBy).click();
        return new HumanPlayAboutUsPage(driver);
    }
    public HumanMainPage backToMainPage (){
        By humansBy = By.xpath("//*[contains(@d, '34.4018C16.8121')]");
        driver.findElement(humansBy).click();
        return new HumanMainPage(driver);
    }
}
