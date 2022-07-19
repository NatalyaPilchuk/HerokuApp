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
        WebElement nameBach = driver.findElement(By.xpath("(//table[@id='table1']//td[text()='fbach@yahoo.com']//preceding-sibling::td)[1]"));
        String lastName = nameBach.getText();
        WebElement nameFrank = driver.findElement(By.xpath("(//table[@id='table1']//td[text()='fbach@yahoo.com']//preceding-sibling::td)[2]"));
        String firstName = nameFrank.getText();
        Assert.assertEquals("Bach", lastName, "there isn't such  last name");
        Assert.assertEquals("Frank", firstName, "there isn't such  first name");
    }

    @Test
    public void dueWebsiteTest() {
        //Open Chrome browser
        driver.get(Urls.DATA_TABLES_PAGE_URL);
        //Add check
        WebElement priceDue = driver.findElement(By.xpath("//table[@id='table2']//td[text()='fbach@yahoo.com']//following-sibling::td[contains(text(),'$')]"));
        String dueText = priceDue.getText();
        Assert.assertEquals("$51.00", dueText, "there isn't such  due");
        WebElement link = driver.findElement(By.xpath("//table[@id='table2']//td[text()='fbach@yahoo.com']//following-sibling::td[contains(text(),'www')]"));
        String webSite = link.getText();
        Assert.assertEquals("$51.00", dueText, "there isn't such  due");
        Assert.assertEquals("http://www.frank.com", webSite, "there isn't such  website");
    }
}
