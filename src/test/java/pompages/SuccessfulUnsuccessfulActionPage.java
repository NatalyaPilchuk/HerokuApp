package pompages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.security.PublicKey;

public class SuccessfulUnsuccessfulActionPage extends BasePage {
    private By ACTION_MESSAGE = By.cssSelector("[class='flash notice']");

    public SuccessfulUnsuccessfulActionPage(WebDriver driver) {
        super(driver);
    }

    public String getActionMessage() {
        return driver.findElement(ACTION_MESSAGE).getText();
    }
}
