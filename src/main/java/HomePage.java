import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage{

    SearchBox searchBox;

    By acceptLocator = By.id("myLocation-close-info");
    By denyLocator = new By.ByCssSelector("div[class='dn-slide-buttons horizontal'] button[class='dn-slide-deny-btn']");
    By acceptCokiesLocator = new By.ByCssSelector("div[class='popin generalAnnounce'] span[class='closeBtn']");

    By goToBasketButtonLocator = new By.ByCssSelector("i[class='icon iconBasket']");

    public HomePage(WebDriver driver) {
        super(driver);
        searchBox = new SearchBox(driver);
    }


    public SearchBox searchBox(){
        return this.searchBox;
    }

    public void acceptOkey(){
        if (isDisplayed(acceptLocator)){
            click(acceptLocator);
        }
    }
    public void denyOkey(){
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(denyLocator));
       click(denyLocator);

    }
    public void acceptCokies(){
        if (isDisplayed(acceptCokiesLocator)){
            click(acceptCokiesLocator);
        }

    }

    public void goToCart() {
        click(goToBasketButtonLocator);

    }
}
