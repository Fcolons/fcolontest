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
        homePage.clickLogin();
        Assert.assertTrue(homePage.isLoginDisplayed(), "The element doesnt respond, its not ready.");
    }
}
