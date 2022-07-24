package pompages;

import constants.Urls;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class InputsPage extends BasePage{
private By ARROW=By.cssSelector("[type='number']");
    public InputsPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnUpArrow (){
        driver.findElement(By.cssSelector("[type='number']")).sendKeys(Keys.ARROW_UP);
    }
    public void ClickOnDownArrow(){
        driver.findElement(By.cssSelector("[type='number']")).sendKeys(Keys.ARROW_DOWN);
    }
    public void openInputPage (){
        driver.get(Urls.INPUTS_PAGE_URL);
    }
    public String countDigits(){
        return driver.findElement(ARROW).getAttribute("value");
    }
}
