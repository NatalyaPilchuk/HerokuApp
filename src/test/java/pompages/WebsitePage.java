package pompages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WebsitePage extends BasePage {
    private By WEBSITE = By.xpath("//table[@id='table2']//td[text()='fbach@yahoo.com']//following-sibling::td[contains(text(),'www')]");

    public WebsitePage(WebDriver driver) {

        super(driver);
    }

    public String geWebsite() {
        return driver.findElement(WEBSITE).getText();
    }
}
