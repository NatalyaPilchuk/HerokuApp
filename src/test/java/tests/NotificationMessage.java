package tests;

import constants.Urls;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NotificationMessage extends BaseTest {
    @Test
    public void checkNotificationMessage() {
        //Open Chrome browser
        driver.get(Urls.NOTIFICATION_MESSAGE_PAGE_URL);
        // Click "Click here"
        driver.findElement(By.xpath("//a[text()='Click here']")).click();
        //Add check
        WebElement text = driver.findElement(By.cssSelector("[class='flash notice']"));
        String successfulText = text.getText();
        boolean isActionSuccessful = successfulText.contains("Action successful");
        Assert.assertTrue(isActionSuccessful, "There isn't such phrase");
    }
}
