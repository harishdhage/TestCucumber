package stepDefinations;

import cucumber.TestContext;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import managers.PageObjectManager;
import managers.WebDriverManager;
import org.openqa.selenium.WebDriver;
import pageObjects.HomePage;

public class HomePageStep {
    TestContext testContext;
    HomePage homePage;

    public HomePageStep(TestContext context){
        testContext = context;
        homePage = testContext.getPageObjectManager().getHomePage();
    }

    @Given("^user is at Home page$")
    public void user_is_at_Home_page() {
        homePage.navigateTo_HomePage();
    }

    @When("^he searches for \"([^\"]*)\"$")
    public void he_searches_for_dress(String product)  {
        homePage.perform_Search(product);
    }

}
