import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class Test_Add_Product_To_Cart extends BaseTest{

    HomePage homePage;
    ProductsPage productsPage;
   ProductDetailPage productDetailPage;
   CartPage cartPage;


    @Test
    @Order(1)
    public void search_a_product() {
        homePage = new HomePage(driver);
        homePage.acceptOkey();
        homePage.acceptCokies();
        homePage.denyOkey();
        productsPage = new ProductsPage(driver);
        homePage.searchBox().search("Telefon");
        Assertions.assertTrue(productsPage.isOnProductPage(),
                "Not on products page!");
    }


    @Test
    @Order(2)
    public void select_a_product(){
        productDetailPage = new ProductDetailPage(driver);
        productsPage.selectProduct(1);
//        Assertions.assertTrue(productDetailPage.isOnCheckProductDetailPage(),
 //               "Not on product detail page!");
   }

    @Test
    @Order(3)
    public void add_Product_to_Cart(){
        productDetailPage.clickAddToCart();
    //    Assertions.assertTrue(homePage.isProductCountUp(),"Product Not Added.");
    }

    @Test
    public void go_to_Cart(){
        cartPage = new CartPage(driver);
        homePage.goToCart();
        cartPage.clickAcceptButton();
      Assertions.assertTrue(cartPage.checkIfProductAdded(),"Not go to cart page.");

    }

}
