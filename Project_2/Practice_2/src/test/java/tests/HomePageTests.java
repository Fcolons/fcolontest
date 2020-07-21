package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import pages.HomePage;
import settings.BaseTest;
import org.testng.annotations.Test;

public class HomePageTests extends BaseTest {

    private HomePage homePage;

    @BeforeTest
    public void setUp(){
        homePage = new HomePage(this.driver);
    }

    @Test
    public void testClickOnButton() {
        int i = 1;
        int opportunities = 3;
        homePage.clickLogin();
        while (i <= opportunities) {
            if(homePage.isLoginDisplayed() == false){
                i=i+1;
            }
            else{
                break;
            }
        }
        Assert.assertEquals(true, homePage.isLoginDisplayed());
    }
}
