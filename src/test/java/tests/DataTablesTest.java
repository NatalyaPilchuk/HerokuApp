package tests;

import constants.Urls;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pompages.*;

public class DataTablesTest extends BaseTest {
    @Test
    public void firstNameLastNameTest() {
        DataTablesPage dataTablesPage = new DataTablesPage(driver);
        dataTablesPage.openDataTablePage();
        Assert.assertEquals("Bach", dataTablesPage.getNameBach(), "there isn't such  last name");
        Assert.assertEquals("Frank", dataTablesPage.getNameFrank(), "there isn't such  first name");
    }

    @Test
    public void dueWebsiteTest() {
        DataTablesPage dataTablesPage = new DataTablesPage(driver);
        dataTablesPage.openDataTablePage();
        Assert.assertEquals("$51.00", dataTablesPage.getPrice(), "there isn't such  due");
        Assert.assertEquals("http://www.frank.com", dataTablesPage.geWebsite(), "there isn't such  website");
    }
}
