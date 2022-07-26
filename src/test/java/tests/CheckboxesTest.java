package tests;

import constants.Urls;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pompages.CheckboxesPage;

public class CheckboxesTest extends BaseTest {
    @Test
    public void theFirstCheckboxUncheckedTest() {
        CheckboxesPage checkboxesPage = new CheckboxesPage(driver);
        checkboxesPage.openCheckboxesPage();
        Assert.assertFalse(checkboxesPage.isFirstCheckboxSelected(), "the first checkbox is checked");

    }

    @Test
    public void checkFirstCheckboxTest() {
        CheckboxesPage checkboxesPage = new CheckboxesPage(driver);
        checkboxesPage.openCheckboxesPage();
        checkboxesPage.clickFirstCheckbox();
        Assert.assertTrue(checkboxesPage.isFirstCheckboxSelected(), "the first checkbox is unchecked");

    }

    @Test
    public void theSecondCheckboxCheckedTest() {
        CheckboxesPage checkboxesPage = new CheckboxesPage(driver);
        checkboxesPage.openCheckboxesPage();
        Assert.assertTrue(checkboxesPage.isSecondCheckboxSelected(), "the second checkbox is unchecked");

    }

    @Test
    public void checkSecondCheckboxTest() {
        CheckboxesPage checkboxesPage = new CheckboxesPage(driver);
        checkboxesPage.openCheckboxesPage();
        checkboxesPage.clickSecondElement();
        Assert.assertFalse(checkboxesPage.isSecondCheckboxSelected(), "the second checkbox is checked");


    }
}
