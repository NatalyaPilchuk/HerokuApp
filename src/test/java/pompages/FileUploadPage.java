package pompages;

import constants.Urls;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadPage extends BasePage {
    private By CHOOSE_FILE_BUTTON = By.cssSelector("#file-upload");
    private By UPLOAD_BUTTON = By.cssSelector("#file-submit");

    public FileUploadPage(WebDriver driver) {
        super(driver);
    }

    public void openFileUploadPage() {

        driver.get(Urls.FILE_UPLOAD_PAGE_URL);
    }

    public void chooseFile() {
        String path = System.getProperty("user.dir").concat("/src/test/resources/img.jfif");
        driver.findElement(CHOOSE_FILE_BUTTON).sendKeys(path);
    }

    public void clickUpload() {

        driver.findElement(UPLOAD_BUTTON).click();
    }

}
