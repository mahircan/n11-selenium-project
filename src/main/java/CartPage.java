import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class CartPage extends BasePage{

    By acceptCartPageLocator = new By.ByCssSelector("span[class='btn btnBlack']");
    By cartPageProductLocator = new By.ByCssSelector("tr[class='prod ']");

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public void clickAcceptButton(){
        WebDriverWait wait = new WebDriverWait(driver,2);
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(acceptCartPageLocator));
        click(acceptCartPageLocator);
    }
    public boolean checkIfProductAdded() {
        // return isDisplayed(cartPageProductLocator);
        return getProducts().size()>0;
    }
    private List<WebElement> getProducts(){
        return findAll(cartPageProductLocator);
    }
}
