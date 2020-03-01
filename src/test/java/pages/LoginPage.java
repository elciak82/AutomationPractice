package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends GenericPage{
    public LoginPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    @FindBy (id = "email")
    WebElement email;

    @FindBy (id = "passwd")
    WebElement password;

    @FindBy (id = "SubmitLogin")
    WebElement submitLogin;

    public MyAccountPage signIn(String userEmail, String userPassword){
        email.sendKeys(userEmail);
        password.sendKeys(userPassword);
        clickOnElement(submitLogin);
        return new MyAccountPage(driver);
    }





}
