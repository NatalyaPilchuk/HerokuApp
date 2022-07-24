package pompages;

import constants.Urls;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DataTablesPage extends BasePage {
    private By NAME_BACH = By.xpath("(//table[@id='table1']//td[text()='fbach@yahoo.com']//preceding-sibling::td)[1]");
    private By NAME_FRANK = By.xpath("(//table[@id='table1']//td[text()='fbach@yahoo.com']//preceding-sibling::td)[2]");
    private By PRICE_DUE = By.xpath("//table[@id='table2']//td[text()='fbach@yahoo.com']//following-sibling::td[contains(text(),'$')]");
    private By WEBSITE = By.xpath("//table[@id='table2']//td[text()='fbach@yahoo.com']//following-sibling::td[contains(text(),'www')]");

    public DataTablesPage(WebDriver driver) {
        super(driver);
    }

    public void openDataTablePage() {
        driver.get(Urls.DATA_TABLES_PAGE_URL);
    }

}
