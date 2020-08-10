package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import settings.BasePage;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage{

    @FindBy(id = "ul-btn")
    private WebElement btnLoginSession;

    @FindBy(className = "desktop")
    private WebElement loginElement;

    public HomePage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void clickLogin() {
        click(btnLoginSession);
    }

    public boolean isLoginDisplayed() {
        return loginElement.isDisplayed();
    }
}
