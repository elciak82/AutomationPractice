package tests_app;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class App_Tests extends BasedClass {

    @Test
    public void testOne(){
        driver.get("http://automationpractice.com/index.php");
        driver.findElement(By.id("search_query_top")).sendKeys("Sukienka");
        driver.findElement(By.id("search_query_top")).sendKeys(Keys.ENTER);
        System.out.println("Completed Test One...");
    }
}
