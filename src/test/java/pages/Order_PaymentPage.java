package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Order_PaymentPage extends OrderPage{
    public Order_PaymentPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy (className = ".bankwire")
    WebElement payByBank;

    @FindBy (className = ".cheque")
    WebElement payByCheque;





}
