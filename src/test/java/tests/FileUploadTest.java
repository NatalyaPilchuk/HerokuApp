package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pompages.CreatedNewPage;
import pompages.FileUploadPage;

public class FileUploadTest extends BaseTest {
    @Test
    public void fileUpload() {
        FileUploadPage fileUploadPag = new FileUploadPage(driver);
        fileUploadPag.openFileUploadPage();
        fileUploadPag.chooseFile();
        fileUploadPag.clickUpload();
        CreatedNewPage createdNewPage = new CreatedNewPage(driver);
        Assert.assertEquals("img.jfif", createdNewPage.getNameOfPicture(), "there isn't such title of picture");
    }
}
