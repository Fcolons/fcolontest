package components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import settings.BasePage;
import java.util.ArrayList;
import java.util.List;

public class NavigationBar extends BasePage {

    @FindBy(id = "store_nav_search_term")
    private WebElement searchTheStoreInput;

    @FindBy(css = "#search_suggestion_contents a .match_name")
    private List<WebElement> suggestedGames;

    public NavigationBar(WebDriver driver){
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
}
