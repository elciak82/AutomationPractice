package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WomenPage extends GenericPage{
    public WomenPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

}
