package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pompages.DropDownPage;

import java.util.List;

public class DropDownTest extends BaseTest {
    @Test
    public void allOptions() {
        DropDownPage dropDownPage = new DropDownPage(driver);
        dropDownPage.openDropDownPage();
        Assert.assertEquals(dropDownPage.quantityOfOptions(), 3, "check quantity");
    }

    @Test
    public void option1() {
        DropDownPage dropDownPage = new DropDownPage(driver);
        dropDownPage.openDropDownPage();
        Assert.assertTrue(dropDownPage.option1(), "there isn't option1");
    }

    @Test
    public void option2() {
        DropDownPage dropDownPage = new DropDownPage(driver);
        dropDownPage.openDropDownPage();
        Assert.assertTrue(dropDownPage.option2(), "there isn't option2");
    }
}
