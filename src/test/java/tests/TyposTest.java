package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pompages.TyposPage;

public class TyposTest extends BaseTest {
    @Test
    public void findMistakeTest() {
        TyposPage typosPage = new TyposPage(driver);
        typosPage.openTyposPage();
        Assert.assertTrue(typosPage.getSentence(), "There isn't such mistake");


    }
}
