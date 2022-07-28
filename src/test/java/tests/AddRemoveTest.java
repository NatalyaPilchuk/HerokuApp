package tests;


import org.testng.Assert;
import org.testng.annotations.Test;
import pompages.AddRemovePage;

public class AddRemoveTest extends BaseTest {
    @Test
    public void addRemTest() {
        AddRemovePage addRemovePage = new AddRemovePage(driver);
        addRemovePage.openAddRemovePage();
        addRemovePage.clickElement();
        addRemovePage.clickElement();
        addRemovePage.deleteElement();
        Assert.assertTrue(addRemovePage.isOneButtonDisplayed(), "there isn't one button");


    }
}
