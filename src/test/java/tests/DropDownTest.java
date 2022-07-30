package tests;

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
        Assert.assertTrue(dropDownPage.takeOption1(), "there isn't option1");
    }

    @Test
    public void option2() {
        DropDownPage dropDownPage = new DropDownPage(driver);
        dropDownPage.openDropDownPage();
        Assert.assertTrue(dropDownPage.takeOption2(), "there isn't option2");
    }
}
