package pompages;

import constants.Urls;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropPage extends BasePage {
    private By DRAG_ME_TO_TARGET = By.xpath("//div[@id='draggable']");
    private By DROP_HERE = By.xpath("//div[@id='droppable']");
    private By IFRAME = By.cssSelector("[class='demo-frame']");

    public DragAndDropPage(WebDriver driver) {
        super(driver);
    }

    public void openDragAndDropPage() {
        driver.get(Urls.DRAG_AND_DROP_PAGE_URL);
    }

    public void dragging() {
        WebElement iframeElement = driver.findElement(IFRAME);
        driver.switchTo().frame(iframeElement);

        WebElement elementDrag = driver.findElement(DRAG_ME_TO_TARGET);
        WebElement elementDrop = driver.findElement(DROP_HERE);
        Actions actions = new Actions(driver);
        actions.dragAndDrop(elementDrag, elementDrop).build().perform();
    }

    public String getTextFromElement() {
        return driver.findElement(DROP_HERE).getText();
    }

}
