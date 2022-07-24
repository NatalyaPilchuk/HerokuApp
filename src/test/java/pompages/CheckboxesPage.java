package pompages;

import constants.Urls;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckboxesPage extends BasePage {
    private By CHECKBOX1 = By.xpath("(//input)[1]");
    private By CHECKBOX2 = By.xpath("(//input)[2]");

    public CheckboxesPage(WebDriver driver) {
        super(driver);
    }

    public void openCheckboxesPage() {
        driver.get(Urls.CHECKBOXES_PAGE_URL);
    }

    public void clickFirstCheckbox() {
        driver.findElement(CHECKBOX1).click();
    }

    public void clickSecondElement() {
        driver.findElement(CHECKBOX2).click();
    }

    public boolean isFirstCheckboxSelected() {
        return driver.findElement(CHECKBOX1).isSelected();
    }

    public boolean isSecondCheckboxSelected() {
        return driver.findElement(CHECKBOX2).isSelected();
    }
}
