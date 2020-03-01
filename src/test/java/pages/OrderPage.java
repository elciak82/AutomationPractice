package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderPage extends GenericPage{
    public OrderPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    @FindBy (css = "[title = 'Proceed to checkout']")
    WebElement checkout;

    @FindBy (css ="[title = 'Previous']")
    WebElement previous;

    public void proceedToCheckout() {
        clickOnElement(checkout);
    }

    public void goToPrevious(){
        clickOnElement(previous);
    }

    
}
