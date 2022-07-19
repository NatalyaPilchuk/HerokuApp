package tests;

import constants.Urls;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DataTablesTest extends BaseTest {
    @Test
    public void firstNameLastNameTest() {
        //Open Chrome browser
        driver.get(Urls.DATA_TABLES_PAGE_URL);
        //Add check
        WebElement nameBach = driver.findElement(By.xpath("//table[@id='table1']//td[text()='fbach@yahoo.com']//preceding-sibling::td[contains(text(),'Bach')]"));
        String lastName = nameBach.getText();
        Assert.assertEquals("Bach", lastName, "there isn't such  last name");
        WebElement nameFrank = driver.findElement(By.xpath("//table[@id='table1']//td[text()='fbach@yahoo.com']//preceding-sibling::td[contains(text(),'Frank')]"));
        String firstName = nameFrank.getText();
        Assert.assertEquals("Frank", firstName, "there isn't such  first name");
    }

    @Test
    public void dueWebsiteTest() {
        //Open Chrome browser
        driver.get(Urls.DATA_TABLES_PAGE_URL);
        //Add check
        WebElement priceDue = driver.findElement(By.xpath("//table[@id='table2']//td[text()='$51.00']"));
        String dueText = priceDue.getText();
        Assert.assertEquals("$51.00", dueText, "there isn't such  due");
        WebElement link = driver.findElement(By.xpath("//table[@id='table2']//td[text()='http://www.frank.com']"));
        String webSite = link.getText();
        Assert.assertEquals("http://www.frank.com", webSite, "there isn't such  website");
    }
}
