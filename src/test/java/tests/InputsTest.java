package tests;

import constants.Urls;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InputsTest extends BaseTest {
    @Test
    public void inputDigitsTest() {
        //Open Chrome browser
        driver.get(Urls.INPUTS_PAGE_URL);
        // Click on the up arrow
        WebElement arrow = driver.findElement(By.cssSelector("[type='number']"));
        arrow.sendKeys(Keys.ARROW_UP);
        //Click on the up arrow one more time
        arrow.sendKeys(Keys.ARROW_UP);
        //Click on the down arrow
        arrow.sendKeys(Keys.ARROW_DOWN);
        //Add check
        String element = driver.findElement(By.cssSelector("[type='number']")).getAttribute("value");
        String elementExpected = "1";
        Assert.assertEquals(elementExpected,element, "there isn't such digit");

    }
}
