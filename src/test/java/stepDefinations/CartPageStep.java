package stepDefinations;

import cucumber.TestContext;
import cucumber.api.java.en.When;
import pageObjects.CartPage;

public class CartPageStep {
    TestContext testContext;
    CartPage cartPage;

    public CartPageStep(TestContext context){
        testContext = context;
        cartPage = testContext.getPageObjectManager().getCartPage();
    }


    @When("^moves the check out from mini cart$")
    public void moves_the_check_out_from_mini_cart() {
        cartPage.clickOn_Cart();
        cartPage.clickOn_ContinueToCheckout();
    }
}
