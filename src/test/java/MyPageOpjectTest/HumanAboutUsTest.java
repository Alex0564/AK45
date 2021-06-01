package MyPageOpjectTest;

import MyPageObject.HumanAboutUsPage;
import MyPageObject.HumanMainPage;
import MyPageObject.HumanPlayAboutUsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HumanAboutUsTest extends HumanBaseTest{
    @Test
    public void aboutUsHumans()throws InterruptedException{
        HumanMainPage humanMainPage = new HumanMainPage(driver);
        humanMainPage.open();
        HumanAboutUsPage humanAboutUsPage = humanMainPage.gotoAboutUsPage();
        Assert.assertTrue(humanAboutUsPage.isUboutUsPage());

        HumanPlayAboutUsPage humanPlayAboutUsPage = humanAboutUsPage.playAboutUs();
//        Thread.sleep(1000);
        Assert.assertTrue(humanPlayAboutUsPage.isPlayAboutUs());

        humanAboutUsPage = humanPlayAboutUsPage.returnToUboutUs();
        Assert.assertTrue(humanAboutUsPage.isUboutUsPage());
        System.out.println("+++++++++ About Us Page +++++++++++++++");
//        Thread.sleep(2000);
        humanMainPage = humanAboutUsPage.backToMainPage();
        System.out.println("____________ Human Main Page ____________");
//        Thread.sleep(5000);
        Assert.assertTrue(HumanMainPage.isHumanMainPage());
    }
}
