package pages;

import pojos.VideoGameDetails;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import settings.BasePage;
import java.util.List;

public class VideoGamePage extends BasePage {

    @FindBy(className = "details_block")
    private List<WebElement> itemList;

    @FindBy(className = "apphub_AppName")
    private WebElement appName;

    public VideoGamePage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public VideoGameDetails getVideoGameDetails(){
        return generateVideoGameDetailsFromDetailsBlock(itemList.get(0).getText());
    }

    private VideoGameDetails generateVideoGameDetailsFromDetailsBlock(String details_block) {
        String[] detailsBlockArray = details_block.split("\n");
        VideoGameDetails videoGameDetails = new VideoGameDetails();
        videoGameDetails.setTittle(detailsBlockArray[0].replace("TÍTULO:","").trim());
        videoGameDetails.setGenre(detailsBlockArray[1].replace("GÉNERO:", "").trim());
        videoGameDetails.setDeveloper(detailsBlockArray[2].replace("DESARROLLADOR:", "").trim());
        videoGameDetails.setEditor(detailsBlockArray[3].replace("EDITOR:", "").trim());
        videoGameDetails.setFranchise(detailsBlockArray[4].replace("FRANQUICIA:", "").trim());
        videoGameDetails.setReleaseDate(detailsBlockArray[5].replace("FECHA DE LANZAMIENTO:", "").trim());
        return videoGameDetails;
    }

    public String getGameTittle(){
        return appName.getText();
    }
}
