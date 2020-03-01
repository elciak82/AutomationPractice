package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HeaderPage extends GenericPage {

    public HeaderPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(className = "login")
    WebElement login;

    @FindBy(className = "sf-with-ul")
    WebElement womenTab;

    @FindBy (css = "[id='block_top_menu'] ul li ul li a[title='T-shirts']")
    public WebElement tshirtsFromWomen;

    @FindBy (css = ".submenu-container [title='Blouses']")
    public WebElement blousesFromWomen;

    public LoginPage openSignInPage() {
        clickOnElement(login);
        return new LoginPage(driver);
    }

    public void chooseFromMenuWomen(WebElement webElement) {
        moveToElement(womenTab);
        moveToElement(webElement);
        clickOnElement(webElement);
    }
}
