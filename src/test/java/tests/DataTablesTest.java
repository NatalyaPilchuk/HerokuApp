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
        NameBachPage nameBachPage = new NameBachPage(driver);
        NameFrankPage nameFrankPage = new NameFrankPage(driver);
        Assert.assertEquals("Bach", nameBachPage.getNameBach(), "there isn't such  last name");
        Assert.assertEquals("Frank", nameFrankPage.getNameFrank(), "there isn't such  first name");
    }

    @Test
    public void dueWebsiteTest() {
        DataTablesPage dataTablesPage = new DataTablesPage(driver);
        dataTablesPage.openDataTablePage();
        PriceDuePage priceDuePage = new PriceDuePage(driver);
        WebsitePage websitePage = new WebsitePage(driver);
        Assert.assertEquals("$51.00", priceDuePage.getPrice(), "there isn't such  due");
        Assert.assertEquals("http://www.frank.com", websitePage.geWebsite(), "there isn't such  website");
    }
}
