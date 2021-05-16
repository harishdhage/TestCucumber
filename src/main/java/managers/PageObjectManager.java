package managers;

import org.openqa.selenium.WebDriver;
import pageObjects.*;

public class PageObjectManager {
    private WebDriver driver;

    private HomePage homePage;

    private ProductListingPage productListingPage;

    private CheckoutPage checkoutPage;

    private CartPage cartPage;

    private ConfirmationPage confirmationPage;

    public PageObjectManager(WebDriver driver){
        this.driver = driver;
    }

    public HomePage getHomePage(){
        return (homePage==null)? homePage=new HomePage(driver):homePage;
    }

    public ProductListingPage getProductListingPage(){
        return  (productListingPage==null) ? productListingPage=new ProductListingPage(driver) : productListingPage;
    }

    public CheckoutPage getCheckoutPage(){
        return (checkoutPage==null) ? checkoutPage = new CheckoutPage(driver) : checkoutPage;
    }

    public CartPage getCartPage(){
        return (cartPage == null) ? cartPage = new CartPage(driver) : cartPage;
    }

    public ConfirmationPage getConfirmationPage(){
        return (confirmationPage == null) ? confirmationPage = new ConfirmationPage(driver) : confirmationPage;
    }
}
