import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchBox extends BasePage{

    By searchContainerLocator = new By.ByCssSelector("input[id='searchData']");
    By searchButtonLocator = new By.ByCssSelector("a[class='searchBtn']");


    public SearchBox(WebDriver driver){
        super(driver);
    }

    public void search(String text){
        type(searchContainerLocator, text);
        click(searchButtonLocator);

    }


}
