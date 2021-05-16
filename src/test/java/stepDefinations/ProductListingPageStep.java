package stepDefinations;

import cucumber.TestContext;
import cucumber.api.java.en.When;
import enums.Context;
import pageObjects.ProductListingPage;

public class ProductListingPageStep {
    TestContext testContext;
    ProductListingPage productListingPage;

    public ProductListingPageStep(TestContext context){
        testContext = context;
        productListingPage = testContext.getPageObjectManager().getProductListingPage();
    }

    @When("^choose to buy the first item$")
    public void choose_to_buy_the_first_item()  {
        String productName = productListingPage.getProductName(0);
        testContext.scenarioContext.setScenarioContextMap(Context.PRODUCT_NAME, productName);

        productListingPage.select_Product(0);
        productListingPage.setColor();
        productListingPage.setSize();
        productListingPage.clickOn_AddToCart();
    }
}
