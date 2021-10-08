import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductsPage extends BasePage{

    By shippingOptionLocator = new By.ByCssSelector("div[class='listOptionHolder darkListOpt']");
    By productNameLocator = new By.ByCssSelector("ul[class='clearfix'] > li[class='column '] img");
// ul[class='clearfix'] > li[class='column ' img]


    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    public boolean isOnProductPage() {
        return isDisplayed(shippingOptionLocator);
    }

    public void selectProduct(int i) {
        getAllProducts().get(i).click();
    }

    private List<WebElement> getAllProducts(){
        return findAll(productNameLocator);
    }


}