package tests;

import constants.Urls;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddRemoveTest extends BaseTest {
    @Test
    public void addRemTest() {
        //Open Chrome browser
        driver.get(Urls.ADD_REMOVE_PAGE_URL);
        //Click button "Add Element" the first time
        driver.findElement(By.cssSelector("[onclick='addElement()']")).click();
        //Click button "Add Element" the second time
        driver.findElement(By.cssSelector("[onclick='addElement()']")).click();
        //Click  1 of the button "Delete"
        driver.findElement(By.cssSelector("button[class='added-manually']")).click();
        //Add check
        WebElement button = driver.findElement(By.cssSelector("button[class='added-manually']"));
        boolean isOneButtonDisplayed = button.isDisplayed();
        Assert.assertTrue(isOneButtonDisplayed, "there isn't one button");
    }
}
