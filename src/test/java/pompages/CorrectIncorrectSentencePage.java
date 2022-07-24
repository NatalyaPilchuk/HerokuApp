package pompages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CorrectIncorrectSentencePage extends BasePage {
    private By SENTENCE = By.xpath("(//p)[2]");

    public CorrectIncorrectSentencePage(WebDriver driver) {
        super(driver);
    }

    public String getSentence() {
        return driver.findElement(SENTENCE).getText();
    }
}
