package stepDefinations;

import cucumber.TestContext;
import cucumber.api.java.en.Then;
import enums.Context;
import org.junit.Assert;
import pageObjects.ConfirmationPage;

public class ConfirmationPageStep {
    TestContext testContext;
    ConfirmationPage confirmationPage;

    public ConfirmationPageStep(TestContext context){
        testContext = context;
        confirmationPage = testContext.getPageObjectManager().getConfirmationPage();
    }

    @Then("^verify order details$")
    public void verify_order_details()  {
        String productName = (String)testContext.scenarioContext.getScenarioContextMap(Context.PRODUCT_NAME);
        System.out.println(" Print - "+ confirmationPage.getProductNames().stream().filter(x -> x.contains(productName)));
        Assert.assertTrue(confirmationPage.getProductNames().stream().filter(x -> x.contains(productName)).findFirst().get().length()>0);
    }

}
