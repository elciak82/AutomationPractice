package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Order_ShippingPage extends OrderPage{
    public Order_ShippingPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy (id ="cgv")
    WebElement checkboxAgree;

    public void selectCheckbox() {
        if(!checkboxAgree.isSelected()) {
            checkboxAgree.click();
        } else
            System.out.println("Checkbox is selected");
    }
    
}
