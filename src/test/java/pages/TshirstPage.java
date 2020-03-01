package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.security.PublicKey;

public class TshirstPage extends GenericPage{

    public TshirstPage(WebDriver driver) {
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
