package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;

import java.util.concurrent.TimeUnit;

public class GenericPage {
    protected WebDriver driver;

    public GenericPage(WebDriver driver) {
        this.driver = driver;
        documentReady();
    }

    public void fluentWaitForElementDisplayed(WebElement elementToBeDisplayed) {
        new FluentWait<>(elementToBeDisplayed)
                .withTimeout(10, TimeUnit.SECONDS)
                .pollingEvery(500, TimeUnit.MILLISECONDS)
                .until(WebElement::isDisplayed);
    }

    public void documentReady() {
        boolean readyStateComplete = false;
        while (!readyStateComplete) {
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("window.scrollTo(0, document.body.offsetHeight)");
            readyStateComplete = executor.executeScript("return document.readyState").equals("complete");
        }
    }

    public void clickOnElement(WebElement webElement) {
        fluentWaitForElementDisplayed(webElement);
        webElement.click();
    }

    public void moveToElement(WebElement webElement) {
        fluentWaitForElementDisplayed(webElement);
        new Actions(driver).moveToElement(webElement).perform();
    }
}
