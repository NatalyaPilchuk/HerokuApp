package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pompages.NotificationMessagePage;
import pompages.SuccessfulUnsuccessfulActionPage;

public class NotificationMessageTest extends BaseTest {
    @Test
    public void checkNotificationMessageTest() {
        NotificationMessagePage notificationMessagePage = new NotificationMessagePage(driver);
        notificationMessagePage.openNotificationMessagePage();
        notificationMessagePage.clickHere();
        SuccessfulUnsuccessfulActionPage successfulUnsuccessfulActionPage = new SuccessfulUnsuccessfulActionPage(driver);
        Assert.assertTrue(successfulUnsuccessfulActionPage.getActionMessage().contains("Action successful"), "There isn't such phrase");

    }
}
