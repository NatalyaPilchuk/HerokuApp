package tests;

import constants.Urls;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TyposTest extends BaseTest {
    @Test
    public void findMistakeTest () {
        //Open Chrome browser
        driver.get(Urls.TYPOS_PAGE_URL);
        // Find sentence with mistake
        WebElement text = driver.findElement(By.xpath("(//p)[2]"));
        String mistakenText = text.getText();
        boolean isMistakeContains = mistakenText.contains("won't");
        Assert.assertTrue(isMistakeContains, "There isn't such mistake");

    }
}
