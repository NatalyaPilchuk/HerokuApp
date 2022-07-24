package pompages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NameFrankPage extends BasePage {
    private By NAME_FRANK = By.xpath("(//table[@id='table1']//td[text()='fbach@yahoo.com']//preceding-sibling::td)[2]");

    public NameFrankPage(WebDriver driver) {
        super(driver);
    }

    public String getNameFrank() {
        return driver.findElement(NAME_FRANK).getText();
    }
}
