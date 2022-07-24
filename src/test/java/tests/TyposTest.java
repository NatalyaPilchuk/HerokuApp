package tests;

import constants.Urls;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pompages.CorrectIncorrectSentencePage;
import pompages.TyposPage;

public class TyposTest extends BaseTest {
    @Test
    public void findMistakeTest() {
        TyposPage typosPage = new TyposPage(driver);
        typosPage.openTyposPage();
        CorrectIncorrectSentencePage correctIncorrectSentencePage = new CorrectIncorrectSentencePage(driver);
        Assert.assertTrue(correctIncorrectSentencePage.getSentence().contains("won't"), "There isn't such mistake");


    }
}
