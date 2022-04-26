package shopping;

import browserfactory.BaseClass;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ShoppingTest extends BaseClass {

    String baseUrl = "https://mobile.x-cart.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void verifyThatUserShouldPlaceOrderSuccessfullyForOllieTheAppControlledRobot(){
        Actions actions = new Actions(driver);
        WebElement hotdeals = driver.findElement(By.xpath(""));
        actions.moveToElement(hotdeals).click().build().perform();
    }



}
