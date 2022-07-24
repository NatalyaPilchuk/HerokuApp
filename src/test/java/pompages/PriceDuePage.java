package pompages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PriceDuePage extends BasePage {
    private By PRICE_DUE = By.xpath("//table[@id='table2']//td[text()='fbach@yahoo.com']//following-sibling::td[contains(text(),'$')]");

    public PriceDuePage(WebDriver driver) {
        super(driver);
    }

    public String getPrice() {
        return driver.findElement(PRICE_DUE).getText();
    }
}
