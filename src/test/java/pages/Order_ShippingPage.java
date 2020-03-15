package pages;

import org.junit.Assert;
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

    @FindBy (className = "fancybox-error")
    WebElement fancyBoxError;

    public void selectCheckbox() {
        if(!checkboxAgree.isSelected()) {
            checkboxAgree.click();
        } else
            System.out.println("Checkbox is selected");
    }

    public void checkFancyBoxError() {
        proceedToCheckout();
        fluentWaitForElementDisplayed(fancyBoxError);
        String textFromFancyBoxError = fancyBoxError.getText();
        Assert.assertEquals("You must agree to the terms of service before continuing.", textFromFancyBoxError);
    }


    
}
