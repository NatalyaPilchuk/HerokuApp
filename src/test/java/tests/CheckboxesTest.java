package tests;

import constants.Urls;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckboxesTest extends BaseTest {
    @Test
    public void theFirstCheckboxUncheckedTest () {
        //Open Chrome browser
        driver.get(Urls.CHECKBOXES_PAGE_URL);
        //Add check
        WebElement theFirstCheckbox = driver.findElement(By.xpath("(//input)[1]"));
        boolean isFirstCheckboxSelected = theFirstCheckbox.isSelected();
        Assert.assertFalse(isFirstCheckboxSelected, "the first checkbox is checked");
    }

    @Test
    public void checkFirstCheckboxTest() {
        //Open Chrome browser
        driver.get(Urls.CHECKBOXES_PAGE_URL);
        //Click the first checkbox
        driver.findElement(By.xpath("(//input)[1]")).click();
        //Add check
        WebElement theFirstCheckbox = driver.findElement(By.xpath("(//input)[1]"));
        boolean isFirstCheckboxSelected = theFirstCheckbox.isSelected();
        Assert.assertTrue(isFirstCheckboxSelected, "the  first checkbox is unchecked");
    }

    @Test
    public void theSecondCheckboxCheckedTest() {
        //Open Chrome browser
        driver.get(Urls.CHECKBOXES_PAGE_URL);
        //Add check
        WebElement theFirstCheckbox = driver.findElement(By.xpath("(//input)[2]"));
        boolean isSecondCheckboxSelected = theFirstCheckbox.isSelected();
        Assert.assertTrue(isSecondCheckboxSelected, "the second checkbox is unchecked");
    }

    @Test
    public void checkSecondCheckboxTest() {
        //Open Chrome browser
        driver.get(Urls.CHECKBOXES_PAGE_URL);
        //Click the first checkbox
        driver.findElement(By.xpath("(//input)[2]")).click();
        //Add check
        WebElement theSecondCheckbox = driver.findElement(By.xpath("(//input)[2]"));
        boolean isSecondCheckboxSelected = theSecondCheckbox.isSelected();
        Assert.assertFalse(isSecondCheckboxSelected, "the second checkbox is checked");
    }
}