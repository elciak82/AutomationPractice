package tests_selenium;

import helpers.Configuration;
import org.junit.*;
import org.openqa.selenium.WebDriver;
//import pages.LoginPage;
//import pages.AllProgramsLists;

import static helpers.Configuration.getConfiguration;
import static helpers.Driver.initializeWebDriver;

public class CartTests {
    private WebDriver driver;
    public Configuration configuration;

    private final String login = configuration.getLogin();
    private final String password = configuration.getPassword();

    @Before
    public void setUp() throws InterruptedException {
        driver = initializeWebDriver();
        driver.get(getConfiguration().getSiteURL());
//        this.loginPage = new LoginPage(driver);
//        loginPage.loginToPage(login, password);
    }

    @Test
    public void addTwoProductsFromAllProductPageAndCheckCartTest() {
        System.out.println("dupa");
//        allProgramsLists.checkLogoIsDisplayed();
//        String firstProductName = allProductsPage.getProductName(FIRST_PRODUCT);
//        String secondProductName = allProductsPage.getProductPrice(FIRST_PRODUCT);
//
//        String productName2 = allProductsPage.getProductName(SECOND_PRODUCT);
//        String productPrice2 = allProductsPage.getProductPrice(SECOND_PRODUCT);
//        allProductsPage.addProductToCart(FIRST_PRODUCT).addProductToCart(SECOND_PRODUCT);
//
//        headerPage.openCartPage();
//        cartPageMap = loginPage.getAllProductsFromCartMap();
//
//        Assert.assertEquals("Product name isn't equal!", firstProductName, cartPageMap.get(0).get(LoginPage.PRODUCTS_IN_CART_HEADERS.NAME));
//        Assert.assertEquals("Product name isn't equal!", productName2,cartPageMap.get(1).get(LoginPage.PRODUCTS_IN_CART_HEADERS.NAME) );
//
//        Assert.assertEquals("Price doesn't match!", secondProductName, cartPageMap.get(0).get(LoginPage.PRODUCTS_IN_CART_HEADERS.PRICE));
//        Assert.assertEquals("Price doesn't match!", productPrice2,cartPageMap.get(1).get(LoginPage.PRODUCTS_IN_CART_HEADERS.PRICE) );
    }

//    @Ignore
//    public void addProductFromProductPageAndCheckCartTest(){
//        allProductsPage.selectProduct(FIRST_PRODUCT);
//        String productName = productPage.getProductName();
//        String productPrice = productPage.getProductPrice();
//        productPage.addProductToCart();
//
//        headerPage.openCartPage();
//        cartPageMap = loginPage.getAllProductsFromCartMap();
//
//        Assert.assertEquals("Product name isn't equal!", productName, cartPageMap.get(0).get(LoginPage.PRODUCTS_IN_CART_HEADERS.NAME));
//        Assert.assertEquals("Price doesn't match!", productPrice, cartPageMap.get(0).get(LoginPage.PRODUCTS_IN_CART_HEADERS.PRICE));
//    }
//
//    @Ignore
//    public void checkQuantityAndTotalPriceInCartTest(){
//        int productPrice = Integer.parseInt(allProductsPage.getProductPrice(SECOND_PRODUCT));
//        String allProductsPrice = Integer.toString(productPrice* NUMBER_OF_PRODUCTS);
//        allProductsPage.addProductsToCart(NUMBER_OF_PRODUCTS, SECOND_PRODUCT);
//
//        headerPage.openCartPage();
//        cartPageMap = loginPage.getAllProductsFromCartMap();
//
//        Assert.assertEquals("Total doesn't match!", allProductsPrice, cartPageMap.get(0).get(LoginPage.PRODUCTS_IN_CART_HEADERS.TOTAL));
//        Assert.assertEquals("Quantity doesn't match!", Integer.toString(NUMBER_OF_PRODUCTS), cartPageMap.get(0).get(LoginPage.PRODUCTS_IN_CART_HEADERS.QUANTITY));
//    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
