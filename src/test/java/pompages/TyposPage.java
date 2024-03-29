package pompages;

import constants.Urls;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TyposPage extends BasePage {

    private By SENTENCE = By.xpath("(//p)[2]");

    public TyposPage(WebDriver driver) {
        super(driver);
    }

    public void openTyposPage() {

        driver.get(Urls.TYPOS_PAGE_URL);
    }
    public boolean getSentence() {
        return driver.findElement(SENTENCE).getText().contains("won't");
    }

}
