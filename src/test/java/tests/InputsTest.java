package tests;

import constants.Urls;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pompages.InputsPage;

public class InputsTest extends BaseTest {
    @Test
    public void inputDigitsTest() {
        InputsPage inputsPage = new InputsPage(driver);
        inputsPage.openInputPage();
        inputsPage.clickOnUpArrow();
        inputsPage.clickOnUpArrow();
        inputsPage.ClickOnDownArrow();
        Assert.assertEquals("1", inputsPage.countDigits(), "there isn't such digit");


    }
}
