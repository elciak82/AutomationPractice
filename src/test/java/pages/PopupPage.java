package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PopupPage extends GenericPage{
    public PopupPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy (css = "#layer_cart div.clearfix")
    WebElement productAddedToCartPopup;

    @FindBy (css = ".continue")
    WebElement continueShopping;

    @FindBy (css = "[title='Proceed to checkout']")
    WebElement checkout;

    public void continueShopping() {
        clickOnElement(continueShopping);
    }

    public Order_SummaryPage goToShoppingCart() {
        clickOnElement(checkout);
        return new Order_SummaryPage(driver);
    }

    
}
