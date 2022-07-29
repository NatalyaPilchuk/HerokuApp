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
        String  actualText=alertsPage.getTextAlert();
        alertsPage.closeAlert1();
        Assert.assertEquals(actualText,"I am a JS Alert",  "there isn't such  phrase");

    }

    @Test
    public void alertJSConfirmTest() {
        AlertsPage alertsPage = new AlertsPage(driver);
        alertsPage.openAlertPage();
        alertsPage.clickAlert2();
        String actualText =alertsPage.getTextAlert();
        alertsPage.closeAlert2();
        Assert.assertEquals( actualText,"I am a JS Confirm", "there isn't such  phrase");

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
