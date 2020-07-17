package tests;

import pojos.VideoGameDetails;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import pages.VideoGamePage;
import settings.BaseTest;
import components.NavigationBar;
import java.util.List;

public class HomePageTests extends BaseTest{

    private NavigationBar navBar;
    private VideoGamePage videoGamesPage;

    @BeforeTest
    public void setUp(){
        navBar = new NavigationBar(this.driver);
        videoGamesPage = new VideoGamePage(this.driver);
    }

    @Test
    public void testSuggestedGames() {
        String gameName = "Portal";
        navBar.writeGameIntoSearchInput(gameName);
        List<String> games = navBar.getSuggestedGames();
        Assert.assertEquals(games.size(), 5, "The number of suggested games is not correct");
        for (String game : games) {
            Assert.assertTrue(game.contains("Portal"), "The game " + game + " is not correct. Not contains Search String " + gameName);
        }
    }

    @Test
    public void testPage(){
        String gameName = "Portal";
        navBar.writeGameIntoSearchInput(gameName);
        navBar.clickFirstItem();
            Assert.assertEquals("Portal 2", videoGamesPage.getGameTittle());
    }

    @Test
    public void testGameInfoScroll(){
        String gameName = "Age of Empires II: Definitive";
        navBar.writeGameIntoSearchInput(gameName);
        navBar.clickFirstItem();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement element = driver.findElement(By.className("details_block"));
        js.executeScript("arguments[0].scrollIntoView();", element);
        VideoGameDetails videoGame = videoGamesPage.getVideoGameDetails();
        Assert.assertEquals("Age of Empires II: Definitive Edition", videoGame.getTittle());
        Assert.assertEquals("Estrategia", videoGame.getGenre());
        Assert.assertEquals("Forgotten Empires, Tantalus Media, Wicked Witch", videoGame.getDeveloper());
        Assert.assertEquals("Xbox Game Studios", videoGame.getEditor());
        Assert.assertEquals("Age of Empires", videoGame.getFranchise());
        Assert.assertEquals("14 NOV 2019", videoGame.getReleaseDate());
    }
}
