package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pompages.AlertsPage;

public class AlertsTest extends BaseTest {
    @Test
    public void alertJSTest() {
        AlertsPage alertsPage = new AlertsPage(driver);
        alertsPage.openAlertPage();
        alertsPage.clickAlert1();
        Assert.assertEquals("I am a JS Alert", alertsPage.getTextAlert(), "there isn't such  phrase");
        alertsPage.closeAlert1();
    }

    @Test
    public void alertJSConfirmTest() {
        AlertsPage alertsPage = new AlertsPage(driver);
        alertsPage.openAlertPage();
        alertsPage.clickAlert2();
        Assert.assertEquals("I am a JS Confirm", alertsPage.getTextAlert(), "there isn't such  phrase");
        alertsPage.closeAlert2();
    }

    @Test
    public void alertJSPromptTest() {
        AlertsPage alertsPage = new AlertsPage(driver);
        alertsPage.openAlertPage();
        alertsPage.clickAlert3();
        alertsPage.enterTextAlert3();
        alertsPage.closeAlert3();
        Assert.assertTrue(alertsPage.getMessageText(), "there isn't such  phrase");

    }

}
