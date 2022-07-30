package pompages;

import constants.Urls;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDownPage extends BasePage {
    private By OPTION_1 = By.cssSelector("[value='1']");
    private By OPTION_2 = By.cssSelector("[value='2']");

    public DropDownPage(WebDriver driver) {
        super(driver);
    }

    public void openDropDownPage() {
        driver.get(Urls.DROPDOWN_PAGE_URL);
    }

    public int quantityOfOptions() {
        WebElement webElement = driver.findElement(By.id("dropdown"));
        Select dropDownList = new Select(webElement);
        List<WebElement> optionList = dropDownList.getOptions();
        return optionList.size();


    }

    public boolean takeOption1() {
        WebElement dropDownList = driver.findElement(By.id("dropdown"));
        Select selectOption = new Select(dropDownList);
        selectOption.selectByIndex(1);
        WebElement option1=selectOption.getFirstSelectedOption();
        return option1.isSelected();
    }

    public boolean takeOption2() {
        WebElement dropDownList = driver.findElement(By.id("dropdown"));
        Select selectOption = new Select(dropDownList);
        selectOption.selectByIndex(2);
        WebElement option2=selectOption.getFirstSelectedOption();
        return option2.isSelected();
    }


}
