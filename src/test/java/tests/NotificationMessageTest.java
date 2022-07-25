package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pompages.NotificationMessagePage;

public class NotificationMessageTest extends BaseTest {
    @Test
    public void checkNotificationMessageTest() {
        NotificationMessagePage notificationMessagePage = new NotificationMessagePage(driver);
        notificationMessagePage.openNotificationMessagePage();
        notificationMessagePage.clickHere();
        Assert.assertTrue(notificationMessagePage.getActionMessage(), "There isn't such phrase");

    }
}
