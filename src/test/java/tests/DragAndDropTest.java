package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pompages.DragAndDropPage;

public class DragAndDropTest extends BaseTest {
    @Test
    public void dragAndDrop() {
        DragAndDropPage dragAndDropPage = new DragAndDropPage(driver);
        dragAndDropPage.openDragAndDropPage();
        dragAndDropPage.dragging();
        Assert.assertEquals("Dropped!", dragAndDropPage.getTextFromElement(), "there isn't such text");
    }


}
