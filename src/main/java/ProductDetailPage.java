import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductDetailPage extends BasePage{

    By productDetailAddToCartLocator = new By.ByCssSelector("span[class='icon-white-basket']");

    //div[class='product-add-cart']  div[class='product-add-cart'] a[title='Sepete Ekle']
    //div[class='product-add-cart'], a[title='Sepete Ekle'] a[class="btn btnGrey addBasketUnify"]
    //

    public ProductDetailPage(WebDriver driver) {
        super(driver);
    }

    public boolean isOnCheckProductDetailPage(){
        return isDisplayed(productDetailAddToCartLocator);
    }
    public void clickAddToCart(){
        WebDriverWait wait = new WebDriverWait(driver, 1);
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(productDetailAddToCartLocator));
        click(productDetailAddToCartLocator);
    }

}
