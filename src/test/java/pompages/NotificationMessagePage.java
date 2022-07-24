package pompages;

import constants.Urls;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class NotificationMessagePage extends BasePage {
    private By CLICK_HERE = By.xpath("//a[text()='Click here']");
    private By TEXT = By.xpath("[class='flash notice']");

    public NotificationMessagePage(WebDriver driver) {

        super(driver);
    }

    public void openNotificationMessagePage() {
        driver.get(Urls.NOTIFICATION_MESSAGE_PAGE_URL);
    }

    public void clickHere() {

        driver.findElement(CLICK_HERE).click();
    }


}


