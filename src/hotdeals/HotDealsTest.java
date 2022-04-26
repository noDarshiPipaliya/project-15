package hotdeals;

import browserfactory.BaseClass;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HotDealsTest extends BaseClass {

    String baseUrl = "https://mobile.x-cart.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void mousehover(){
        Actions actions = new Actions(driver);

        WebElement hotdeals= driver.findElement(By.className("primary-title"));
        WebElement salelink = driver.findElement(By.xpath("//h3[contains(text(),'Sale')]"));

//        actions.moveToElement(hotdeals).click().build().perform();
//        actions.moveToElement(salelink).click().build().perform();
//
//        String expectedMessage = "Sale";
//        WebElement actualMessageelement = driver.findElement(By.xpath("//h1[@id='page-title']"));
//        String actualMessage = actualMessageelement.getText();
//        Assert.assertEquals("navigate to sale area ", expectedMessage, actualMessage);
//
//        WebElement sortbylink = driver.findElement(By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]"));
//        actions.moveToElement(sortbylink).build().perform();
//        WebElement sortbyAtoZ = driver.findElement(By.xpath("//span[contains(text(),'Name A - Z')]"));
//       actions.moveToElement(sortbyAtoZ).click().build().perform();

    }

    @Test
    public void verifySaleProductsPriceArrangeLowToHigh(){
        Actions actions = new Actions(driver);
        WebElement hotdeals = driver.findElement(By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='header-area']/div[1]/div[1]/div[4]/div[1]/ul[1]/li[2]/span[1]"));
        actions.moveToElement(hotdeals).build().perform();


    }




}
