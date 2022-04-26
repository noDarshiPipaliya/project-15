package homepage;

import browserfactory.BaseClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TopMenuTest extends BaseClass {

    String baseUrl = "https://mobile.x-cart.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void verifyUserShouldNavigateToShippingPageSuccessfully(){
        driver.findElement(By.linkText("Shipping")).click();

        String expectedMessage = "Shipping";
        WebElement actualMessageelement = driver.findElement(By.xpath("//h1[@id='page-title']"));
        String actualMessage = actualMessageelement.getText();
        Assert.assertEquals("navigate to shipping area ", expectedMessage, actualMessage);
    }

    @Test
    public void verifyUserShouldNavigateToNewPageSuccessfully() {
        driver.findElement(By.linkText("New!")).click();

        String expectedMessage = "New arrivals";
        WebElement actualMessageelement = driver.findElement(By.xpath("//h1[@id='page-title']"));
        String actualMessage = actualMessageelement.getText();
        Assert.assertEquals("navigate to new arrivals area ", expectedMessage, actualMessage);
    }

    @Test
    public void erifyUserShouldNavigateToComingsoonPageSuccessfully() {
        driver.findElement(By.linkText("Contact us")).click();

        String expectedMessage = "Contact us";
        WebElement actualMessageelement = driver.findElement(By.xpath("//h1[@id='page-title']"));
        String actualMessage = actualMessageelement.getText();
        Assert.assertEquals("navigate to contact us area ", expectedMessage, actualMessage);
    }





}
