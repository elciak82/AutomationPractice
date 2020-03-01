package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Order_SummaryPage extends OrderPage{
    public Order_SummaryPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

}
