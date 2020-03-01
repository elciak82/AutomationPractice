package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BlousesPage extends GenericPage{

    public BlousesPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy (css = ".product-image-container .img-responsive")
    public WebElement product;

    @FindBy (css = "[title='Add to cart']")
    WebElement addProductToCart;

    public void chooseProduct(WebElement webElement){
        clickOnElement(webElement);
    }

    public void addProductToCart(WebElement webElement){
        moveToElement(webElement);
        clickOnElement(addProductToCart);
    }
}
