package components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import settings.BasePage;
import data.VideoGameDetails;

import java.util.ArrayList;
import java.util.List;

public class NavBar extends BasePage {

    @FindBy(id = "store_nav_search_term")
    private WebElement searchTheStoreInput;

    @FindBy(css = "#search_suggestion_contents a .match_name")
    private List<WebElement> suggestedGames;

    public NavBar(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver,this);
    }

    public List<String> getSuggestedGames(){

        List<String> suggestedGamesNames = new ArrayList<String>();

        for (WebElement suggestedGame : suggestedGames){
            suggestedGamesNames.add(suggestedGame.getText());
        }

        return suggestedGamesNames;
    }

    public void writeGameIntoSearchInput(String gameName){
        this.writeInInput(searchTheStoreInput, gameName);
    }

    public void clickFirstItem(){
        this.click(suggestedGames.get(0));
    }



    /*public List<String> getItemList(){
        List<String> itemsList = new ArrayList<String>();

        for (WebElement details_block : itemList){
            itemsList.add(details_block.getText());
            itemsList.get(0);
        }
        return itemsList;
    }*/
}
