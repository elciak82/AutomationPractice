package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Order_AddressPage extends OrderPage{
    public Order_AddressPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    
}
