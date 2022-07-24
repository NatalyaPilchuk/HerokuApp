package pompages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NameBachPage extends BasePage {
    private By NAME_BACH = By.xpath("(//table[@id='table1']//td[text()='fbach@yahoo.com']//preceding-sibling::td)[1]");

    public NameBachPage(WebDriver driver) {
        super(driver);
    }

    public String getNameBach() {
        return driver.findElement(NAME_BACH).getText();
    }
}
