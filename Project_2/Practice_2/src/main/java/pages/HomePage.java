package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import settings.BasePage;
import org.openqa.selenium.support.PageFactory;
import java.util.NoSuchElementException;

public class HomePage extends BasePage{

    @FindBy(id = "ul-btn")
    private WebElement btnLoginSession;

    public HomePage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void clickLogin() {
        click(btnLoginSession);
    }

    public boolean isLoginDisplayed(){
        boolean present;
        try{
            driver.findElement(By.className("desktop"));
            present = true;
        }catch(NoSuchElementException e){
            present = false;
        }
        return present;
    }
}
