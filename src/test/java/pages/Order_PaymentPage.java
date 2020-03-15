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

    @FindBy (css= ".bankwire")
    WebElement payByBank;

    @FindBy (className = ".cheque")
    WebElement payByCheque;

    public void payByBank() {
        clickOnElement(payByBank);
    }

    public void payByCheque() {
        clickOnElement(payByCheque);
    }



}
