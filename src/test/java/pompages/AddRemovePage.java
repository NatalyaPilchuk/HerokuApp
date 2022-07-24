package pompages;

import constants.Urls;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddRemovePage extends BasePage {
    private By ADD_ELEMENT_INPUT = By.cssSelector("[onclick='addElement()']");
    private By DELETE_ELEMENT_INPUT = By.cssSelector("button[class='added-manually']");

    public AddRemovePage(WebDriver driver) {
        super(driver);
    }

    public void openAddRemovePage() {
        driver.get(Urls.ADD_REMOVE_PAGE_URL);
    }

    public void clickElement() {
        driver.findElement(ADD_ELEMENT_INPUT).click();
    }

    public void deleteElement() {
        driver.findElement(DELETE_ELEMENT_INPUT).click();
    }

    public boolean isOneButtonDisplayed() {
        return driver.findElement(DELETE_ELEMENT_INPUT).isDisplayed();
    }
}
