package tests_selenium;

import helpers.Configuration;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import pages.*;

import static helpers.Configuration.getConfiguration;
import static helpers.Driver.initializeWebDriver;

public class Shopping_Tests {
    private WebDriver driver;
    private HeaderPage headerPage;
    private BlousesPage blousesPage;
    private TshirstPage tshirstPage;
    private PopupPage popupPage;
    private Order_AddressPage orderAddressPage;
    private Order_ShippingPage orderShippingPage;
    private Order_PaymentPage orderPaymentPage;
    private Order_SummaryPage orderSummaryPage;

    @Before
    public void setUp() {
        driver = initializeWebDriver();
        driver.get(getConfiguration().get(Configuration.SITE_ADDRESS));
        headerPage = new HeaderPage(driver);
        headerPage.openSignInPage();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.signIn(getConfiguration().get(Configuration.LOGIN), getConfiguration().get(Configuration.PASSWORD));

        tshirstPage = new TshirstPage(driver);
        blousesPage = new BlousesPage(driver);
        popupPage = new PopupPage(driver);
        orderAddressPage = new Order_AddressPage(driver);
        orderShippingPage = new Order_ShippingPage(driver);
        orderSummaryPage = new Order_SummaryPage(driver);
        orderPaymentPage = new Order_PaymentPage(driver);
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void buyTshirtAndDress_test() {
        headerPage.chooseFromMenuWomen(headerPage.tshirtsFromWomen);

        tshirstPage.addProductToCart(tshirstPage.product);
        popupPage.continueShopping();

        headerPage.chooseFromMenuWomen(headerPage.blousesFromWomen);

        blousesPage.addProductToCart(blousesPage.product);
        popupPage.goToShoppingCart();
        orderSummaryPage.proceedToCheckout();

        orderAddressPage.proceedToCheckout();
        orderShippingPage.selectCheckbox();
        orderShippingPage.proceedToCheckout();
        orderPaymentPage.payByBank();

        System.out.println("buyTshirtTest");
    }

}
