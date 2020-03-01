package tests_selenium;

import helpers.Configuration;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import pages.BlousesPage;
import pages.HeaderPage;
import pages.LoginPage;
import pages.TshirstPage;

import static helpers.Configuration.getConfiguration;
import static helpers.Driver.initializeWebDriver;

public class Shopping_Tests {
    private WebDriver driver;
    private HeaderPage headerPage;
    private BlousesPage blousesPage;
    private TshirstPage tshirstPage;

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
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void buyTshirtAndDress_test() {
        headerPage.chooseFromMenuWomen(headerPage.tshirtsFromWomen);

        tshirstPage.addProductToCart(tshirstPage.product);
        tshirstPage.continueShopping();

        headerPage.chooseFromMenuWomen(headerPage.blousesFromWomen);

        blousesPage.addProductToCart(blousesPage.product);
        blousesPage.goToShoppingCart();


        System.out.println("buyTshirtTest");
    }

}
