package pompages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreatedNewPage extends BasePage {
    private By PICTURE_ELEMENT = By.cssSelector("#uploaded-files");

    public CreatedNewPage(WebDriver driver) {
        super(driver);
    }

    public String getNameOfPicture() {
        return driver.findElement(PICTURE_ELEMENT).getText();
    }
}
