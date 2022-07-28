package pompages;

import constants.Urls;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertsPage extends BasePage {
    private By BUTTON1_ALERT = By.cssSelector("[onclick='jsAlert()']");
    private By BUTTON2_ALERT = By.cssSelector("[onclick='jsConfirm()']");
    private By BUTTON3_ALERT = By.cssSelector("[onclick='jsPrompt()']");

    private By CHECK_MESSAGE = By.cssSelector("#result");

    public AlertsPage(WebDriver driver) {
        super(driver);
    }

    public void openAlertPage() {
        driver.get(Urls.ALERTS_PAGE_URL);
    }

    public void clickAlert1() {
        driver.findElement(BUTTON1_ALERT).click();
    }

    public String getTextAlert() {
        return driver.switchTo().alert().getText();

    }

    public void closeAlert1() {
        driver.switchTo().alert().accept();
    }

    public void clickAlert2() {
        driver.findElement(BUTTON2_ALERT).click();
    }

    public void closeAlert2() {
        driver.switchTo().alert().dismiss();
    }

    public void clickAlert3() {
        driver.findElement(BUTTON3_ALERT).click();
    }

    public void enterTextAlert3() {
        driver.switchTo().alert().sendKeys("Hello");


    }

    public void closeAlert3() {
        driver.switchTo().alert().accept();
    }

    public boolean getMessageText() {
        return driver.findElement(CHECK_MESSAGE).getText().contains("Hello");
    }

}
